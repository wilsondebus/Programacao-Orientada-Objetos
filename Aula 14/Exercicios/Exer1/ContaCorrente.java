import java.util.Scanner; 

public class ContaCorrente extends Conta{

    Scanner teclado = new Scanner(System.in); 

    void depositar(){
        System.out.println("Estou na Conta Corrente");
        
        System.out.println("Digite o valor que gostaria de depositar: ");
        float deposito = teclado.nextFloat();
        teclado.nextLine();

        saldo = saldo + deposito; 
        System.out.println("Saldo: R$ "+saldo);
    }

    void sacar(){
        System.out.println("Estou na Conta Corrente");

        System.out.println("Digite o valor que gostaria de sacar ");
        float saque = teclado.nextFloat(); 
        teclado.nextLine(); 

        if(saque > saldo){
            System.out.println("Saldo Indisponível");
        } else {
            saldo = saldo - saque;
            System.out.println("Saldo: R$ "+saldo);
        }
    }
}