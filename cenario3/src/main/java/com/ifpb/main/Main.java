package com.ifpb.main;

import com.ifpb.dao.ConcertoDAO;
import com.ifpb.entity.Concerto;
import com.ifpb.entity.Funcao;
import com.ifpb.entity.Funcionario;
import com.ifpb.entity.Oficina;

/**
 *
 * @author Amanda
 */
public class Main {
    public static void main(String[] args) {
        Oficina ofcina = new Oficina("rua", "bairro", "cidade", 0);
        Funcionario funcionario = new Funcionario("Mick", "111.111.111-11", 
                                                   "123412", 1000, Funcao.EMPREGADO, ofcina);
        Funcionario funcionario2 = new Funcionario("Ju", "111.111.111-11", 
                                                   "123412", 1000, Funcao.EMPREGADO, ofcina);
        Concerto concerto = new Concerto(30, funcionario, ofcina);
        Concerto concerto2 = new Concerto(50, funcionario2, ofcina);
        
        ConcertoDAO.salvarConcerto(concerto);
        ConcertoDAO.salvarConcerto(concerto2);
    }
}
