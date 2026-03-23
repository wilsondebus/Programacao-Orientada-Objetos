package Exercicio1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 

        Disciplina d1 = new Disciplina();

        System.out.println("Dados Originais: ");
        d1.exibir();

        System.out.println("Insira novos dados");
        Disciplina d2 = new Disciplina();
        d2.inserir();

        System.out.println("DADOS CADASTRADOS: ");
        d1.exibir();
        d2.exibir();

        teclado.close(); 
    }
}
