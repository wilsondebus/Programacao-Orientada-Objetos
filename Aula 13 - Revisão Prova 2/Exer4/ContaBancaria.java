public class ContaBancaria{

    protected double saldo; 

    public ContaBancaria(double saldo){
        this.saldo = saldo; 
    }

    public void depositar(double valor){
        saldo = saldo + valor; 
    }

    public void depositar(Cheque cheque){
        saldo = saldo + cheque.getValor();
    }

    public void mostrarSaldo(){
        System.out.println("Saldo Atual: "+saldo);
    }
}