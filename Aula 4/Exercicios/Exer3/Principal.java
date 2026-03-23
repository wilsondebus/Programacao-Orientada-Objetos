package Exercicio3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        System.out.println("Digite os dados da Pessoa 1: ");
        System.out.println("NOME: ");
        p1.nome = teclado.nextLine();
        System.out.println("E-MAIL: ");
        p1.email = teclado.nextLine();
        System.out.println("DATA NASCIMENTO: ");
        p1.dataNascimento = teclado.nextLine();
        System.out.println("ENDERECO: ");
        p1.endereco = teclado.nextLine();
        System.out.println("ADMIN? true/false");
        p1.admin = teclado.nextBoolean();
        teclado.nextLine();

        System.out.println("Digite os dados da Pessoa 2: ");
        System.out.println("NOME: ");
        p2.nome = teclado.nextLine();
        System.out.println("E-MAIL: ");
        p2.email = teclado.nextLine();
        System.out.println("DATA NASCIMENTO: ");
        p2.dataNascimento = teclado.nextLine();
        System.out.println("ENDERECO: ");
        p2.endereco = teclado.nextLine();
        System.out.println("ADMIN? true/false");
        p2.admin = teclado.nextBoolean();

        if(p1.isAdmin() == p2.isAdmin()){
            p2.promoverAdmin();
        }

        System.out.println("Emails dos usuarios: ");
        System.out.println(p1.retornaEmail());
        System.out.println("ADMIN: "+p1.isAdmin());
        System.out.println(p2.retornaEmail());
        System.out.println("ADMIN: "+p2.isAdmin());


        teclado.close();

    }
}
