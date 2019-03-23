/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Cliente
 */
@Entity
public class Carga {

    @Id
    @GenericGenerator(name = "increment", strategy = "increment")
    @GeneratedValue(generator = "increment")
    private Long codCarga;
    private String origem;
    private String destino;

    @OneToMany
    private List<Produto> produtos;

    public Carga(String origem, String destino) {
        this.codCarga = codCarga;
        this.origem = origem;
        this.destino = destino;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Carga() {
        this.produtos = new ArrayList<>();

    }

    public void adicionar(Produto produto) {
        this.produtos.add(produto);
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Long getCodCarga() {
        return codCarga;
    }

    public void setCodCarga(Long codCarga) {
        this.codCarga = codCarga;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.codCarga);
        hash = 31 * hash + Objects.hashCode(this.origem);
        hash = 31 * hash + Objects.hashCode(this.destino);
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
        final Carga other = (Carga) obj;
        if (!Objects.equals(this.origem, other.origem)) {
            return false;
        }
        if (!Objects.equals(this.destino, other.destino)) {
            return false;
        }
        if (!Objects.equals(this.codCarga, other.codCarga)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Carga{" + "codCarga=" + codCarga + ", origem=" + origem + ", destino=" + destino + '}';
    }

}
