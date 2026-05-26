import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        Produto produto = new Produto(0); 

        System.out.println("Preço Produto: "+produto.calcularPrecoFinal(50));

        System.out.println("Digite o percentual de desconto do cliente: ");
        double descontoCliente = teclado.nextDouble();

        Cliente cliente = new Cliente(descontoCliente); 

        System.out.println("Preço do produto com o desconto do cliente: "+produto.calcularPrecoFinal(descontoCliente));

        teclado.close(); 
    }
}
