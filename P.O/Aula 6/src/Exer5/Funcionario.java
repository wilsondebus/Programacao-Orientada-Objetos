package Exer5;

import java.util.Scanner;

public class Funcionario {

    Scanner teclado = new Scanner(System.in); 

    public String nome;
    public float salario;
    public float horasExtras;

    public Funcionario(){
        this.nome = "Wilson";
        this.salario = 2500;
        this.horasExtras = 5;
    }

    public void calcularValorHoraExtra(){
        float valorHoraExtra = 50;
        System.out.println("Esse funcionariio recebeu "+(horasExtras * valorHoraExtra)+" reais de hora extra");
    }

    public float calcularPagamentoTotal(){
        return (salario * (horasExtras * 50));
    }

    public void adicionarHorasExtras(){
        System.out.print("Quantas horas extras gostaria de adicionar? ");
        float adicionarHorasExtras = teclado.nextFloat();
        teclado.nextLine();

        this.horasExtras += adicionarHorasExtras; 
    }

    public float calcularSalarioAnual(){
        return salario*12; 
    }


}
