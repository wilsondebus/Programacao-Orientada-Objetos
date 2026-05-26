import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 

        ContaBancaria conta = new ContaBancaria(1000); 

        conta.depositar(250); 

        Cheque cheque = new Cheque(1200); 

        conta.depositar(cheque); 

        conta.mostrarSaldo();

        teclado.close(); 
    }
}
