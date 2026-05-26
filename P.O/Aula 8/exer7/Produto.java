package exer7; 

public class Produto{

    public String nome;
    public double preco;
    public int quantidade; 

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirInformacoes(){
         System.out.println("\tDADOS DO PRODUTO: ");
         System.out.println("Nome: "+nome);
         System.out.println("Preço: "+preco);
         System.out.println("Quantidade: "+quantidade);
    }

    public double calcularValorTotal(){
        double valorTotal; 
        return valorTotal = preco * quantidade; 
    }


}