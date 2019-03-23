/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Cliente
 */
@Entity
public class Navio implements Serializable {

    @Id
    @GenericGenerator(name = "increment", strategy = "increment")
    @GeneratedValue(generator = "increment")
    private long codNavio;
    private String nome;
    private int capacidade;
    private String país;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idcomandante")
    private Comandante comandante;

    public Navio(String nome, int capacidade, String país) {
        this.codNavio = codNavio;
        this.nome = nome;
        this.capacidade = capacidade;
        this.país = país;
    }

    public Navio(Comandante comandante) {
        this.comandante = comandante;
    }

    public long getCodNavio() {
        return codNavio;
    }

    public void setCodNavio(long codNavio) {
        this.codNavio = codNavio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getPaís() {
        return país;
    }

    public void setPaís(String país) {
        this.país = país;
    }

    public Comandante getComandante() {
        return comandante;
    }

    public void setComandante(Comandante comandante) {
        this.comandante = comandante;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (this.codNavio ^ (this.codNavio >>> 32));
        hash = 37 * hash + Objects.hashCode(this.nome);
        hash = 37 * hash + this.capacidade;
        hash = 37 * hash + Objects.hashCode(this.país);
        hash = 37 * hash + Objects.hashCode(this.comandante);
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
        final Navio other = (Navio) obj;
        if (this.codNavio != other.codNavio) {
            return false;
        }
        if (this.capacidade != other.capacidade) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.país, other.país)) {
            return false;
        }
        if (!Objects.equals(this.comandante, other.comandante)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Navio{" + "codNavio=" + codNavio + ", nome=" + nome + ", "
                + "capacidade=" + capacidade + ", pa\u00eds=" + país + ", comandante=" + comandante + '}';
    }

}
