import java.util.Scanner;

public class Produto {

    Scanner teclado = new Scanner(System.in);

    public String nome;
    public float preco;
    public float quantidade;

    public Produto(String nome, float preco, float quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public float calcularValorTotalEstoque(){
        return this.preco * this.quantidade;
    }

    public Boolean temEstoque(){
        if(this.quantidade > 0){
            return true;
        } else{
            return false;
        }
    }

    public void adicionarEstoque(){
        System.out.println("Digite a quantidade de Produtos que deseja adiconar ao estoque: ");
        float adicionarQuantidade = teclado.nextFloat();

        this.quantidade += adicionarQuantidade;
    }

    public Boolean venderEstoque(){
        System.out.println("Digite quantos produtos foram vendidos: ");
        float produtosVendidos = teclado.nextFloat();
        if(this.quantidade > produtosVendidos){
            this.quantidade -= produtosVendidos;
            return true;
        } else {
            System.out.println("Estoque insuficiente");
            return false;
        }
    }

}
