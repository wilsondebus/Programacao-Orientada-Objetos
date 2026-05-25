import java.util.Scanner; 

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 

       Produto produto1 = new Produto(100.00);
       
       produto1.desconto(); 

       System.out.println("Digite o percentual de desconto que deseja aplicar: ");
       double percentualDesconto = teclado.nextDouble(); 

       ProdutoComDesconto produtoComDesconto = new ProdutoComDesconto(100, percentualDesconto); 

       produtoComDesconto.desconto(); 

       teclado.close(); 

    }
}
