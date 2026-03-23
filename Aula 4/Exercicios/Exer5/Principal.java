package Exercicio5;

import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Qual dos contrutores gostaria de usar: (1/2)");
        int escolha = teclado.nextInt();
        teclado.nextLine();

        Pessoa p1;

        if(escolha == 1){
            p1 = new Pessoa(nome, idade);
        } else if(escolha == 2){
            p1 = new Pessoa(idade);
        } else{
            System.out.println("Opcao Invalida!");
        }

        teclado.close();
    }
}
