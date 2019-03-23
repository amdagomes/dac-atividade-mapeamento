package com.ifpb.dao;

import com.ifpb.entity.Conserto;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Amanda
 */
public class ConsertoDAO {

    private static EntityManager em = Persistence
            .createEntityManagerFactory("DAC")
            .createEntityManager();

    public void salvarConcerto(Conserto concerto) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(concerto);
        transaction.commit();
    }
    
    public void removerConcerto(Conserto concerto) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(concerto);
        transaction.commit();
    }
    
}
