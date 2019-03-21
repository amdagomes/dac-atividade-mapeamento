package com.ifpb.entity;

import java.io.Serializable;

/**
 *
 * @author Amand
 */
public class FilmeEventoChave implements Serializable{
    private int filmes;
    private int eventos;

    public FilmeEventoChave() {
    }

    public FilmeEventoChave(int filmes, int eventos) {
        this.filmes = filmes;
        this.eventos = eventos;
    }

    public int getFilmes() {
        return filmes;
    }

    public void setFilmes(int filmes) {
        this.filmes = filmes;
    }

    public int getEventos() {
        return eventos;
    }

    public void setEventos(int eventos) {
        this.eventos = eventos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.filmes;
        hash = 59 * hash + this.eventos;
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
        final FilmeEventoChave other = (FilmeEventoChave) obj;
        if (this.filmes != other.filmes) {
            return false;
        }
        if (this.eventos != other.eventos) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FilmeEventoChave{" + "filmes=" + filmes + ", eventos=" + eventos + '}';
    }
}
