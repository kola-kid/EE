package com.accenture.flowershop.DAO.users;

import com.accenture.flowershop.Models.user.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {
    //@PersistenceContext(name = "data")
    //EntityManager entityManager;

    @Override
    public void addUser(User user) {
        EntityManager em = Persistence.createEntityManagerFactory("data").createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        //  entityManager.persist(user);
    }

    @Override
    public User findUserById(int id) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("data").createEntityManager();
        entityManager.getTransaction().begin();
        TypedQuery<User> query = entityManager.createQuery("select u from User where u.id =:id", User.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }



    @Override
    public User findUserByLogin(String login) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("data").createEntityManager();
        entityManager.getTransaction().begin();
        TypedQuery<User> query = entityManager.createQuery("from User where login=:login", User.class);
        query.setParameter("login", login);
        return query.getSingleResult();
    }

    @Override
    public List<User> getAll(){
        EntityManager entityManager = Persistence.createEntityManagerFactory("data").createEntityManager();
        entityManager.getTransaction().begin();
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }
}
