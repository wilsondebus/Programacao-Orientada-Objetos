import java.util.Scanner;

public class Principal {
    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in); 

        Produto p1 = new Produto(); 

        float valorTotalEstoque; 

        System.out.println("Digite o nome do produto: ");
        p1.nome = teclado.nextLine();
        System.out.println("Digite o preço do produto: ");
        p1.preco = teclado.nextFloat();
        teclado.nextLine();
        System.out.println("Digite a quantidade em estoque: ");
        p1.quantidadeEstoque = teclado.nextFloat();

        valorTotalEstoque = p1.preco * p1.quantidadeEstoque; 

        System.out.println("\tINFORMAÇÕES DO PRODUTO: ");
        System.out.println("NOME: "+p1.nome);
        System.out.println("PREÇO: "+p1.preco);
        System.out.println("QNTD ESTOQUE: "+p1.quantidadeEstoque);
        System.out.println("VALOR TOTAL ESTOQUE: "+valorTotalEstoque);
        
        teclado.close();
    }
}
