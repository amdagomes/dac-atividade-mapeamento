package com.ifpb.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Amanda
 */
@Entity
public class Evento implements Serializable{
    
    @Id
    @GenericGenerator(name = "increment", strategy = "increment")
    @GeneratedValue(generator = "increment")
    private int codigo;
    private String nome;
    private String local;
    private int ano;
    @OneToMany(mappedBy = "filme", targetEntity = FilmeEvento.class)
    @Basic
    private List<FilmeEvento> filmes;

    public Evento() {
    }

    public Evento(String nome, String local, int ano) {
        this.nome = nome;
        this.local = local;
        this.ano = ano;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<FilmeEvento> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<FilmeEvento> filmes) {
        this.filmes = filmes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.codigo;
        hash = 13 * hash + Objects.hashCode(this.nome);
        hash = 13 * hash + Objects.hashCode(this.local);
        hash = 13 * hash + this.ano;
        hash = 13 * hash + Objects.hashCode(this.filmes);
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
        final Evento other = (Evento) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.ano != other.ano) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.local, other.local)) {
            return false;
        }
        if (!Objects.equals(this.filmes, other.filmes)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Evento{" + "codigo=" + codigo + ", nome=" + nome + ", local=" + local + ", ano=" + ano + ", filmes=" + filmes + '}';
    }

}
