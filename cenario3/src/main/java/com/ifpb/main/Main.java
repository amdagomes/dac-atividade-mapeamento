package com.ifpb.main;

import com.ifpb.dao.ConsertoDAO;
import com.ifpb.entity.Conserto;
import com.ifpb.entity.Funcao;
import com.ifpb.entity.Funcionario;
import com.ifpb.entity.Oficina;

/**
 *
 * @author Amanda
 */
public class Main {
    public static void main(String[] args) {
        
        ConsertoDAO dao = new ConsertoDAO();
                
        Funcionario maria = new Funcionario("Maria", "111.111.111-11", "320112", 1000, Funcao.EMPREGADO);
        
        Oficina oficina = new Oficina("Rua", "Bairro", "Cidade", 10000);
        oficina.getFuncionarios().add(maria);
        
        Conserto conserto = new Conserto();
        conserto.setFuncionario(maria);
        conserto.setValor(200);
        
        conserto.setOficina(oficina);
        dao.salvarConcerto(conserto);
    }
}
