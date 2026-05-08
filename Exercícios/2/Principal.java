import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double deposito;

        System.out.println("Digite o valor do depósito: ");
        deposito = teclado.nextDouble();
        teclado.nextLine(); 

        ContaBancaria contaBancaria;

        contaBancaria = new ContaBancaria(); 
        contaBancaria.calcularSaldo(deposito); 

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.calcularSaldo(); 

        teclado.close(); 
    }
}
