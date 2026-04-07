package exer1;

import java.util.Scanner; 

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); 
        
        System.out.println("Digite seu saldo inicial: ");
        double saldo = teclado.nextDouble();
        System.out.println("Digite seu limite: ");
        double limite = teclado.nextDouble(); 

        ContaBancaria c1 = new ContaBancaria(saldo, limite);  

        System.out.println("Digite o valor que gostria de sacar: ");
        double valorSaque = teclado.nextDouble(); 

        c1.sacar(valorSaque);

        teclado.close();
    }
}
