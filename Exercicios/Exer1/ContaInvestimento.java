import java.util.Scanner;

public class ContaInvestimento extends Conta{
    
   Scanner teclado = new Scanner(System.in); 

    void depositar(){
        System.out.println("Estou na Conta de Investimewnto");
        
        System.out.println("Digite o valor que gostaria de depositar: ");
        float deposito = teclado.nextFloat();
        teclado.nextLine();

        saldo = saldo + deposito; 
        System.out.println("Saldo: R$ "+saldo);
    }

    void sacar(){
        System.out.println("Estou na Conta de Investimento");

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

