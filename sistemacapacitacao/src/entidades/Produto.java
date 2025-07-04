package entidades;

public class Produto {
         private String nome;
         private double preco;
         private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto(){}

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }
    public double valorTotalEstoque(){
        return preco * quantidade;
    }
    public void adiciona(int quantidadeAdicionar){
        quantidade += quantidadeAdicionar;
    }
    public void retirar(int quantidadeRetirar){
        quantidade -= quantidadeRetirar;
    }
    public void mostrando(){
        System.out.println("Nome: "+nome);
        System.out.println("Preco: R$"+preco);
        System.out.println("Quantidade: "+quantidade);
        System.out.println("O valor total em estoque: R$ "+valorTotalEstoque());
    }



}



