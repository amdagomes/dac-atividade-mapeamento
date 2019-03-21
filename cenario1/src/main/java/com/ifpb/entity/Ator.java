package com.ifpb.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Amanda
 */
@Entity
public class Ator implements Serializable{
    
    @Id
    @GenericGenerator(name = "increment", strategy = "increment")
    @GeneratedValue(generator = "increment")
    private int codigo;
    private String nome;
    @Enumerated(EnumType.STRING)
    private Sexo Sexo;
    private String nacionalidade;
    @OneToOne
    private Ator parRomantico;
    
    public Ator() {
    }

    public Ator(String nome, Sexo Sexo, String nacionalidade) {
        this.nome = nome;
        this.Sexo = Sexo;
        this.nacionalidade = nacionalidade;
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

    public Sexo getSexo() {
        return Sexo;
    }

    public void setSexo(Sexo Sexo) {
        this.Sexo = Sexo;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Ator getParRomantico() {
        return parRomantico;
    }

    public void setParRomantico(Ator parRomantico) {
        this.parRomantico = parRomantico;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.codigo;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.Sexo);
        hash = 89 * hash + Objects.hashCode(this.nacionalidade);
        hash = 89 * hash + Objects.hashCode(this.parRomantico);
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
        final Ator other = (Ator) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.nacionalidade, other.nacionalidade)) {
            return false;
        }
        if (this.Sexo != other.Sexo) {
            return false;
        }
        if (!Objects.equals(this.parRomantico, other.parRomantico)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ator{" + "codigo=" + codigo + ", nome=" + nome + ", Sexo=" + Sexo + ", nacionalidade=" + nacionalidade + ", parRomantico=" + parRomantico + '}';
    }

}
