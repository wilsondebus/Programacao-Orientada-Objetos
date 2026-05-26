package exer2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 

        double raio; 

        System.out.println("CALCULANDO A AREA DE UM CIRCULO...");
        System.out.print("Digite o raio do circulo: ");
        raio = teclado.nextDouble(); 

        Circulo c1 = new Circulo(raio); 

        System.out.println("Area = "+c1.calcularArea(raio)); 

        teclado.close();
    }
}
