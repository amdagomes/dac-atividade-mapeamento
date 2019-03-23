package com.ifpb.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Amanda
 */
@Entity
public class Oficina implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String rua;
    private String bairro;
    private String cidade;
    private double saldo;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Funcionario> funcionarios;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "oficina")
    private List<Conserto> consertos;
    
    public Oficina(String rua, String bairro, String cidade, double saldo) {
        this();
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.saldo = saldo;
    }

    public Oficina() {
        this.funcionarios = new ArrayList<>();
        this.consertos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<Conserto> getConsertos() {
        return consertos;
    }

    public void setConsertos(List<Conserto> consertos) {
        this.consertos = consertos;
    }
        
}
