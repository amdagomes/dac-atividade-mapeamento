package com.ifpb.dao;

import com.ifpb.entity.Concerto;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Amanda
 */
public class ConcertoDAO {

    private static EntityManager em = Persistence
            .createEntityManagerFactory("DAC")
            .createEntityManager();

    public static void salvarConcerto(Concerto concerto) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(concerto);
        transaction.commit();
    }
    
    public static void removerConcerto(Concerto concerto) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(concerto);
        transaction.commit();
    }
    
}
