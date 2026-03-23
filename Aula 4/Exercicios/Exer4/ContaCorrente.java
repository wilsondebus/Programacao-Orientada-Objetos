package Exercicio4;

import java.util.Scanner;

public class ContaCorrente{
    public float saldo;

    Scanner teclado = new Scanner(System.in);

    public void definirSaldoInicial(){
        this.saldo = 1000;
        System.out.println("Seu Saldo Inicial -- R$"+this.saldo);

        depositar(this.saldo);
    }

    public void depositar(float saldo){
        System.out.println("Digite um valor para depositar: ");
        float deposito = teclado.nextFloat();
        this.saldo = saldo + deposito;

        System.out.println("Saldo Disponivel -- R$"+this.saldo);

        sacar(this.saldo);
    }

    public void sacar(float saldo){
        System.out.println("Digite o valor que gostaria de sacar");
        float sacar = teclado.nextFloat();
        if(sacar <= saldo) {
            this.saldo = saldo - sacar;

            System.out.println("Valor Disponivel -- R$"+this.saldo);
        } else {
            System.out.println("Valor Indisponivel!");

            System.out.println("Valor Disponivel -- R$"+this.saldo);
        }
    }
}
