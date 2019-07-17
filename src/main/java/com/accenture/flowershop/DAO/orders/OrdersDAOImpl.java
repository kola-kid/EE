package com.accenture.flowershop.DAO.orders;

import com.accenture.flowershop.Models.orders.Orders;
import com.accenture.flowershop.Models.user.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class OrdersDAOImpl implements OrdersDAO {
    //@PersistenceContext
    //EntityManager entityManager;

    @Override
    public void addOrder(Orders orders){
        //entityManager.persist(orders);
        EntityManager entityManager = Persistence.createEntityManagerFactory("data").createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(orders);
        entityManager.getTransaction().commit();
    }

    @Override
    public Orders findOrderById(int id){
        EntityManager entityManager = Persistence.createEntityManagerFactory("data").createEntityManager();
        entityManager.getTransaction().begin();
        TypedQuery<Orders> query = entityManager.createQuery("select o from Orders where o.id=:id", Orders.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }
/*
    @Override
    public List<Orders> findOrderByUser(User user){
        TypedQuery<Orders> query = entityManager.createQuery("select o from Orders where o.user=:user", Orders.class);
        query.setParameter("user", user);
        return query.getResultList();
    }
    */

    @Override
    public List<Orders> getAll(){
        EntityManager entityManager = Persistence.createEntityManagerFactory("data").createEntityManager();
        entityManager.getTransaction().begin();
        return entityManager.createQuery("select o from Orders o", Orders.class).getResultList();
    }
}
