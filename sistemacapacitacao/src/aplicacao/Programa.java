package aplicacao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Curso;
import entidades.Funcionario;
import entidades.Produto;
import entidades.ServidorPublico;

import javax.management.MBeanServerDelegate;
import javax.swing.*;
import java.sql.SQLOutput;

public class Programa {

//        alterarServidorPublico(ServidorPublico servidor);
//        excluirServidorPublico(int matricula);
//        calcularFolhaServidoresPublicos();
    public static void main(String[] args) {
         ServidorPublico servidorPublico  = new ServidorPublico();
         servidorPublico.adicionarServidorPublico();
         servidorPublico.adicionarServidorPublico();
         servidorPublico.ListarServidores();
         servidorPublico.ListarServidores(Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a matricula que desejar pesquisar")));
         servidorPublico.ListarServidores(Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a matricula que deseja pesquisar")));
//        servidorPublico.ListarServidores(JOptionPane.showInputDialog(null,"Informe o nome que desejar pesquisar"));
//        servidorPublico.ListarServidores(JOptionPane.showInputDialog(null,"Informe o nome que deseja pesquisar"));
        servidorPublico.excluirServidores(Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a matrícula a ser excluída")));
        servidorPublico.ListarServidores();


    }

}
