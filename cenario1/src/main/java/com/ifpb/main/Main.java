package com.ifpb.main;

import com.ifpb.entity.Ator;
import com.ifpb.entity.Evento;
import com.ifpb.entity.Filme;
import com.ifpb.entity.FilmeEvento;
import com.ifpb.entity.Sexo;
import java.util.Arrays;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Amanda
 */
public class Main {
    public static void main(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("DAC").createEntityManager();
        
        Ator joao = new Ator("João", Sexo.MASCULINO, "Brasil");
        Ator maria = new Ator("Maria", Sexo.FEMININO, "Brasil");
        
        joao.setParRomantico(maria);
        maria.setParRomantico(joao);
        
        Filme fBarbie = new Filme("Barbie", 2006, "animação", "Scismsmx", Arrays.asList(joao, maria));
        Evento evento = new Evento("Oscar", "EUA", 2007);
        
        FilmeEvento fe = new FilmeEvento(10, fBarbie, evento);
        
        em.getTransaction().begin();
        em.persist(joao);
        em.persist(maria);
        em.persist(fBarbie);
        em.persist(evento);
        em.persist(fe);
        em.getTransaction().commit();
    }
}
