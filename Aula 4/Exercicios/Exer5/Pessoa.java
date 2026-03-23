package Exercicio5;

public class Pessoa{

    public String nome;
    public int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

        System.out.println("NOME = "+this.nome);
        System.out.println("IDADE = "+this.idade);
    }

    public Pessoa(int idade){
        this.idade = idade;

        System.out.println("IDADE = "+this.idade);
    }
}
