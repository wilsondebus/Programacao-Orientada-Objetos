package Exer2;

import java.util.Scanner;

public class Moto extends Veiculo{

    Scanner teclado = new Scanner(System.in); 

    void digitarInformacoes(){
        System.out.println("Marca do moto: ");
        marca = teclado.nextLine();
        System.out.println("Modelo do moto: ");
        modelo = teclado.nextLine();
        System.out.println("Ano do moto: ");
        ano = teclado.nextInt();
        teclado.nextLine();         
    }
    
    void acelerar(){
        System.out.println("Acelerando a moto...");
    }

    void freiar(){
        System.out.println("Freiando a moto...");
    }
}
