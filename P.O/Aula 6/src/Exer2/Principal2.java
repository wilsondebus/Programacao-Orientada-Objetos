
public class Principal2 {
    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria();

        System.out.println("\tDADOS DA CONTA: ");
        System.out.println("TITULAR: "+c1.titular);
        System.out.println("SALDO: "+c1.saldo);

        c1.depositar();
        System.out.println("Saldo atual: "+c1.saldo);
        c1.sacar();
        System.out.println("Saldo atual: "+c1.saldo);
        c1.transferir();
        System.out.println("Saldo atual: "+c1.saldo);

    }
}
