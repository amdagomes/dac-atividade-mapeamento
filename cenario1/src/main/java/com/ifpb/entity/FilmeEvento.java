/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Amand
 */
@Entity
@IdClass(FilmeEvento.class)
public class FilmeEvento implements Serializable{
    
    @Id
    @Column(name = "evento_id", insertable = false, updatable = false)
    private int eventos; //read-only
    @Id
    @Column(name = "filme_id", insertable = false, updatable = false)
    private int filmes; //read-only
    private double nota;
    
    @ManyToOne
    @JoinColumn(name = "filmes_id")
    private Filme filme;
    @ManyToOne
    @JoinColumn(name = "eventos_id")
    private Evento evento;

    public FilmeEvento() {
    }

    public FilmeEvento(double nota, Filme filme, Evento evento) {
        this.nota = nota;
        this.filme = filme;
        this.evento = evento;
    }

    public int getEventos() {
        return eventos;
    }

    public void setEventos(int eventos) {
        this.eventos = eventos;
    }

    public int getFilmes() {
        return filmes;
    }

    public void setFilmes(int filmes) {
        this.filmes = filmes;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.eventos;
        hash = 67 * hash + this.filmes;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.nota) ^ (Double.doubleToLongBits(this.nota) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.filme);
        hash = 67 * hash + Objects.hashCode(this.evento);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FilmeEvento other = (FilmeEvento) obj;
        if (this.eventos != other.eventos) {
            return false;
        }
        if (this.filmes != other.filmes) {
            return false;
        }
        if (Double.doubleToLongBits(this.nota) != Double.doubleToLongBits(other.nota)) {
            return false;
        }
        if (!Objects.equals(this.filme, other.filme)) {
            return false;
        }
        if (!Objects.equals(this.evento, other.evento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FilmeEvento{" + "eventos=" + eventos + ", filmes=" + filmes + ", nota=" + nota + ", filme=" + filme + ", evento=" + evento + '}';
    }
    
}
