package aplicacao;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.Produto;
import entidades.ServidorPublico;

import java.sql.SQLOutput;

public class Programa {
    public static void main(String[] args) {
//        ServidorPublico isabela = new ServidorPublico();
//        isabela.setNome("Isabela");
//        isabela.setCargo("Auditor");
//        isabela.setOrgao("ANVISA");
//        isabela.setLotacao("Brasilia");
//        isabela.setEmail("isabela@gmail.");
//        isabela.setSalario(2500);
//
//        ServidorPublico joão = new ServidorPublico();
//        ServidorPublico maria = new ServidorPublico(123,"Maria");
//        System.out.println(maria.getNome());
//        ServidorPublico marcos = new ServidorPublico(541,"marcos","Auditor");
//        System.out.println(marcos.getNome());
//        System.out.println(marcos.getCargo());
//
//        isabela.calcularSalarioHorasExtras(5.60,10,10,20);
//        System.out.println("Servidor: "+ isabela.getNome());
//        System.out.printf("Salario e Horas Extras R$ %.2f: ",isabela.getHorasExtras());

//        Scanner leia = new Scanner(System.in);
//        System.out.println("Nome: ");
//        String nome = leia.next();
//        System.out.println("Preco: ");
//        double preco = leia.nextDouble();
//        System.out.println("Quantidade: ");
//        int quantidade = leia.nextInt();

//        System.out.println("\nDados dos Produtos");

//        Produto produto = new Produto(nome,preco,quantidade);

//        produto.mostrando();

//        System.out.println("\nDigite a quantidade de produtos a ser adicionado no estoque: ");
//        int quantidadeAdicionar = leia.nextInt();
//        produto.adiciona(quantidadeAdicionar);
//        System.out.println("\nDigite a quantidade de produtos a ser retirado do estoque: ");
//        int quantidadeRetirar = leia.nextInt();
//        produto.retirar(quantidadeRetirar);

//        System.out.println("\nOs dados foram atualizados ");
//        produto.mostrando();
        Funcionario funcionario = new Funcionario();

        Scanner leia = new Scanner(System.in);
        System.out.println("Nome do Funcionario: ");
        funcionario.setNome(leia.nextLine());
        System.out.println("Salario Bruto: ");
        funcionario.setSalarioBruto(leia.nextDouble());
        System.out.println("Imposto: ");
        funcionario.setImposto(leia.nextDouble());

        System.out.println("Funcionario: "+funcionario.getNome()+", R$"+funcionario.salarioLiquido());
        System.out.println("\nQual a porcentagem de aumento do salario?: ");
        double porcentagem = leia.nextDouble();
        funcionario.aumentarSalario(porcentagem);
        System.out.println("\nDados Atualizados: "+funcionario.toString());

   }
}
