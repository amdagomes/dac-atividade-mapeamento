/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.main;

import com.ifpb.entity.Carga;
import com.ifpb.entity.Comandante;
import com.ifpb.entity.Navio;
import com.ifpb.entity.Produto;
import com.ifpb.entity.Transporte;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Cliente
 */
public class NewMain {

    public static void main(String[] args) throws ParseException {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DAC");
        EntityManager em = emf.createEntityManager();

        Produto p = new Produto("limpeza", "Omo");
        Produto p2 = new Produto("limpeza", "detergente");
        Carga carga = new Carga("Cajazeiras", "João Pessoa");
        Comandante c = new Comandante("Jack Sparrow", "Brasil");
        Navio n = new Navio("Perola Negra", 1000, "Brasil");
        java.util.Date d = new SimpleDateFormat("dd/MM/yyyy").parse("23/10/2019");
        List<Produto> produtos = new ArrayList();
        carga.setProdutos(produtos);
        Transporte tp = new Transporte(2500, d);
        tp.setNavio(n);
        tp.setCarga(carga);

        n.setComandante(c);
        carga.adicionar(p2);
        carga.adicionar(p);

        em.getTransaction().begin();

        em.persist(c);
        em.persist(n);
        em.persist(p2);
        em.persist(p);
        em.persist(carga);
        em.persist(tp);

        em.getTransaction().commit();
    }

}
