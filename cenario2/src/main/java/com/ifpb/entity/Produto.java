/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Cliente
 */
@Entity
public class Produto implements Serializable {

    @Id

    @GeneratedValue
    private long codProduto;
    private String cartegoria;
    private String nome;

    public Produto() {
    }

    public Produto(String cartegoria, String nome) {
        this.codProduto = codProduto;
        this.cartegoria = cartegoria;
        this.nome = nome;
    }

    public long getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(long codProduto) {
        this.codProduto = codProduto;
    }

    public String getCartegoria() {
        return cartegoria;
    }

    public void setCartegoria(String cartegoria) {
        this.cartegoria = cartegoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + (int) (this.codProduto ^ (this.codProduto >>> 32));
        hash = 19 * hash + Objects.hashCode(this.cartegoria);
        hash = 19 * hash + Objects.hashCode(this.nome);
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
        final Produto other = (Produto) obj;
        if (this.codProduto != other.codProduto) {
            return false;
        }
        if (!Objects.equals(this.cartegoria, other.cartegoria)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Produto{" + "codProduto=" + codProduto + ", cartegoria=" + cartegoria + ", nome=" + nome + '}';
    }

}
