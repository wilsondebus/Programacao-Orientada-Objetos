package exer7;

import java.util.Scanner; 

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);  

        System.out.println("Digite o nome do produto: ");
        String nome = teclado.nextLine();
        System.out.println("Digite o preço: ");
        double preco = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Digite a quantidade: ");
        int quantidade = teclado.nextInt();
        teclado.nextLine(); 

        Produto p1 = new Produto(nome, preco, quantidade); 
        Produto p2 = new Produto("Caixa", 4.50, 100); 

        p1.exibirInformacoes();
        System.out.println("Valor total: "+p1.calcularValorTotal());

        p2.exibirInformacoes();
        System.out.println("valor total: "+p2.calcularValorTotal());


        teclado.close(); 
    }
}
