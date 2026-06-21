package Exer2;

import java.util.Scanner;

public class Carro extends Veiculo{

    Scanner teclado = new Scanner(System.in); 

    void digitarInformacoes(){
        System.out.println("Marca do Carro: ");
        marca = teclado.nextLine();
        System.out.println("Modelo do Carro: ");
        modelo = teclado.nextLine();
        System.out.println("Ano do Carro: ");
        ano = teclado.nextInt();
        teclado.nextLine();         
    }

    void acelerar(){
        System.out.println("Acelerando o carro...");
    }

    void freiar(){
        System.out.println("Freiando o carro...");
    }

}