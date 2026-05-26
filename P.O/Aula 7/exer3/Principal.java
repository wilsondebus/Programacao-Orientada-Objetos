package exer3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a base do retangulo: ");
        double base = teclado.nextDouble();
        System.out.println("Digite a altura do retangulo: ");
        double altura = teclado.nextDouble(); 
        
        Retangulo r1 = new Retangulo(base, altura); 

        System.out.println("Area = "+r1.calcularArea(base, altura));

        teclado.close(); 
    }
}
