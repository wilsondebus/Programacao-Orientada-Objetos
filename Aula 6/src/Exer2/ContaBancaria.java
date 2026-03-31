import java.util.Scanner;

public class ContaBancaria {

    Scanner teclado = new Scanner(System.in);

    public String titular;
    public float saldo;

    public ContaBancaria(){
        this.titular = "Wilson Dias Debus";
        this.saldo = 1500F;
    }

    public void depositar(){
        System.out.print("VALOR DO DEPOSITO: ");
        float valorDeposito = teclado.nextFloat();
        this.saldo += valorDeposito;
    }

    public Boolean sacar(){
        System.out.print("VALOR DO SAQUE: ");
        float valorSaque = teclado.nextFloat();
        teclado.nextLine();

        if(valorSaque < this.saldo) {
            this.saldo -= valorSaque;
            return true;
        } else {
            System.out.println("Possui saldo suficiente? ");
            return false;
        }
    }

    public void transferir(){
        System.out.print("DESTINO: ");
        String contaDestino = teclado.nextLine();
        System.out.print("VALOR DA TRANSFERENCIA: ");
        float valorTransferencia = teclado.nextFloat();

        if(valorTransferencia <= this.saldo){
            this.saldo -= valorTransferencia;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

}
