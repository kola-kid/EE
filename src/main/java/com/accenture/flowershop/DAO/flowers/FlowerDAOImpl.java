package com.accenture.flowershop.DAO.flowers;

import com.accenture.flowershop.Models.flowers.Flowers;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class FlowerDAOImpl implements FlowerDAO {
    //@PersistenceContext
    //EntityManager entityManager;

    public void addFlower(Flowers flowers) {
        //entityManager.persist(flowers);
        EntityManager entityManager = Persistence.createEntityManagerFactory("data").createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(flowers);
        entityManager.getTransaction().commit();
    }

    /*public Flowers findFlowerById(int id){
        TypedQuery<Flowers> query = entityManager.createQuery("select f from Flowers where f.id=:id", Flowers.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    public Flowers findFlowerByName(String name){
        TypedQuery<Flowers> query = entityManager.createQuery("select f from Flowers where f.name=:name",Flowers.class);
        query.setParameter("name", name);
        return query.getSingleResult();
    }
*/
    public List<Flowers> getAll(){
        EntityManager entityManager = Persistence.createEntityManagerFactory("data").createEntityManager();
        entityManager.getTransaction().begin();
        return entityManager.createQuery("select f from Flowers f", Flowers.class).getResultList();
    }


}


