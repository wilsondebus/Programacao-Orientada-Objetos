package exer1;

import java.util.Scanner; 

public class ContaBancaria {
    private double saldo;
    private double limite;

    Scanner teclado = new Scanner(System.in);
    
    
    public ContaBancaria(double saldo, double limite){
        this.saldo = saldo; 
        this.limite = limite;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;  
    }

    public double getLimite(){
        return limite;
    }

    public void setLimite(double limite){
        this.limite = limite; 
    }

    public void sacar(double valorSaque){
         if(valorSaque <= saldo + limite){
            System.out.println("Você Sacou R$"+valorSaque);
            setSaldo(saldo - valorSaque);
            System.out.println("Saldo atual: "+getSaldo());
        } else {
            System.out.println("Valor Indisponivel");
        }
    }




}
