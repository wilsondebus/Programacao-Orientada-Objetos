import java.util.Scanner;

public class Pedido {

    Scanner teclado = new Scanner(System.in); 

    public int numero;
    public String produto; 
    public float preco;
    public float quantidade;

    public Pedido(){
        this.numero = 1011;
        this.produto = "Bola de Futebol";
        this.preco = 200;
        this.quantidade = 20; 
    }

    public float calcularSubtotal(){
        return preco * quantidade; 
    }

    public float calcularDesconto(){
        System.out.println("Digite o percentual de desconto: ");
        float valorDesconto = teclado.nextFloat(); 
        teclado.nextLine(); 
        return valorDesconto; 
    }

    public float calcularTotal(float desconto){
        float precoComDesconto = preco * (desconto / 100); 
        return precoComDesconto; 
    }

    public String resumoFinalPedido(){
        String informacoesPedido = "Bola de Futebol," +(preco)","+ (precoComDesconto);
        return informacoesPedido; 
    }
}

