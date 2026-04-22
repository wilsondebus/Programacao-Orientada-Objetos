package exer9;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        

        Scanner teclado = new Scanner(System.in);

        Filme f1 = new Filme();

        System.out.println("\tDigite os Dados do Filme: ");
        System.out.print("TITULO: ");
        f1.titulo = teclado.nextLine();
        System.out.print("DIRETOR: ");
        f1.diretor = teclado.nextLine();
        System.out.print("DURACAO(em minutos): ");
        f1.duracaoFilme = teclado.nextInt();
        teclado.nextLine();
        System.out.print("GENERO: ");
        f1.genero = teclado.nextLine();

        f1.exibirDetalhes();


        teclado.close();
    }
}
