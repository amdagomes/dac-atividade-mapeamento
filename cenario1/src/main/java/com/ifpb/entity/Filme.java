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
public class Filme implements Serializable {

    @Id
    @GenericGenerator(name = "increment", strategy = "increment")
    @GeneratedValue(generator = "increment")
    private int codigo;
    private String titulo;
    private int ano;
    private String genero;
    private String diretor;
    @OneToMany
    private List<Ator> atores;
    @OneToMany(mappedBy = "evento", targetEntity = FilmeEvento.class)
    @Basic
    private List<FilmeEvento> eventos;

    public Filme() {
    }

    public Filme(String titulo, int ano, String genero, String diretor, List<Ator> atores) {
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.diretor = diretor;
        this.atores = atores;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }

    public List<FilmeEvento> getEventos() {
        return eventos;
    }

    public void setEventos(List<FilmeEvento> eventos) {
        this.eventos = eventos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.codigo;
        hash = 41 * hash + Objects.hashCode(this.titulo);
        hash = 41 * hash + this.ano;
        hash = 41 * hash + Objects.hashCode(this.genero);
        hash = 41 * hash + Objects.hashCode(this.diretor);
        hash = 41 * hash + Objects.hashCode(this.atores);
        hash = 41 * hash + Objects.hashCode(this.eventos);
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
        final Filme other = (Filme) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.ano != other.ano) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        if (!Objects.equals(this.diretor, other.diretor)) {
            return false;
        }
        if (!Objects.equals(this.atores, other.atores)) {
            return false;
        }
        if (!Objects.equals(this.eventos, other.eventos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Filme{" + "codigo=" + codigo + ", titulo=" + titulo + ", ano=" + ano + ", genero=" + genero + ", diretor=" + diretor + ", atores=" + atores + ", eventos=" + eventos + '}';
    }

}
