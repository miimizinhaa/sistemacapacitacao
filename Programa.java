package aplicacao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Curso;
import entidades.Funcionario;
import entidades.Produto;
import entidades.ServidorPublico;

import javax.swing.*;
import java.sql.SQLOutput;

public class Programa {

        //Lista de Servidores
        List<ServidorPublico> servidores = new ArrayList<>();
        //Lista de Cursos
        List<Curso> cursos = new ArrayList<>();

        /**
         * Método que adiciona o servidor instanciado na nossa Lista de Servidores
         */

        public void adicionarServidorPublico() {
            int matricula = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a Matrícula do Servidor"));
            String nome = JOptionPane.showInputDialog(null,"Informe o nome do Servidor");
            String orgao = JOptionPane.showInputDialog(null,"Informe o Orgão");
            String cargo = JOptionPane.showInputDialog(null,"Informe o Cargo do Servidor");
            String lotacao = JOptionPane.showInputDialog(null,"Informe a Lotacao do Servidor");
            String email = JOptionPane.showInputDialog(null,"Informe o Email do Servidor ");
            double salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o Salário do Servidor"));

            ServidorPublico servidor = new ServidorPublico( matricula,  nome, orgao, salario, cargo, lotacao,  email);

            servidores.add(servidor);



        }
        /**
         * Método que lista todos nossos servidores adicionados na lista de Servidores
         */

        public void ListarServidores(){
            for(ServidorPublico servidor: servidores){
                System.out.println(servidor);
            }
        }
//        public void ListarServidores(int matricula){
//            boolean encontrou = false;
//            for (ServidorPublico servidor : servidores){
//                if (servidor.getMatricula() == matricula){
//                    System.out.println(servidor);
//                    encontrou = true;
//                    break;
//                }
//            }
//            if(!encontrou){
//                JOptionPane.showMessageDialog(null,"Servidor não encontrado!");
//            }
//        }
    public void ListarServidores(String nome){
        boolean encontrou = false;
        for (ServidorPublico servidor : servidores){
            if (servidor.getNome().equalsIgnoreCase(nome)){
                System.out.println(servidor);
                encontrou = true;
                break;
            }
        }
        if(!encontrou){
            JOptionPane.showMessageDialog(null,"Servidor não encontrado!");
        }
    }




//        alterarServidorPublico(ServidorPublico servidor);
//        excluirServidorPublico(int matricula);
//        calcularFolhaServidoresPublicos();
    public static void main(String[] args) {
         Programa programa = new Programa();
         programa.adicionarServidorPublico();
         programa.adicionarServidorPublico();
         programa.ListarServidores();
//         programa.ListarServidores(Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a matricula que desejar pesquisar")));
//         programa.ListarServidores(Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a matricula que deseja pesquisar")));
        programa.ListarServidores(JOptionPane.showInputDialog(null,"Informe o nome que desejar pesquisar"));
        programa.ListarServidores(JOptionPane.showInputDialog(null,"Informe o nome que deseja pesquisar"));





    }

}
