package exer4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 

        System.out.println("\tDIGITE OS DADOS DO CARRO: ");
        System.out.print("marca: ");
        String marca = teclado.nextLine();
        System.out.print("modelo: ");
        String modelo = teclado.nextLine();
        System.out.print("ano: ");
        int ano = teclado.nextInt();
        teclado.nextLine(); 

        Carro c1 = new Carro(marca, modelo, ano); 

        c1.exibirDetalhes();

        teclado.close();
    }
}
