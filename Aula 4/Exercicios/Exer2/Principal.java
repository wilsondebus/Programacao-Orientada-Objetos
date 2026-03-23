package Exercicio2;

import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Livro l1 = new Livro();

        System.out.println("Dados do Livro: ");
        System.out.println(l1.getExibir());

        System.out.println("Deseja Emprestar ou devolver? ");
        System.out.println("Digite 'E' para emprestar ou 'D' para devolver:");

        String opcao = teclado.nextLine();

        if (opcao.equalsIgnoreCase("E")){
            l1.emprestar();
        } else if(opcao.equalsIgnoreCase("D")){
            l1.devolver();
        } else{
            System.out.println("Opcao Invalida!");
        }

        System.out.println("Dados do Livro Atualizado: ");
        System.out.println(l1.getExibir());

        teclado.close();
    }
}
