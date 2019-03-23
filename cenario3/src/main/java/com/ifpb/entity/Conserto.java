package com.ifpb.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Amanda
 */
@Entity
public class Conserto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double valor;
    @Temporal(TemporalType.DATE)
    private Date dataConserto;

    @OneToOne(cascade = CascadeType.ALL)
    private Funcionario funcionario;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "oficina")
    private Oficina oficina;

    public Conserto(double valor, Funcionario funcionario, Oficina oficina) {
        this();
        this.valor = valor;
        this.funcionario = funcionario;
        this.oficina = oficina;
    }

    public Conserto() {
        this.dataConserto = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataConserto() {
        return dataConserto;
    }

    public void setDataConserto(Date dataConcerto) {
        this.dataConserto = dataConcerto;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

}
