package Exercicio6;

public class Aluno {

    public String nome;
    public String matricula;
    public String dataNascimento;
    public int anoIngresso;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;

        System.out.println("Construtor 1:");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
    }

    public Aluno(String dataNascimento) {
        this.dataNascimento = dataNascimento;

        System.out.println("\nConstrutor 2:");
        System.out.println("Data de nascimento: " + dataNascimento);
    }

    public Aluno(String nome, String dataNascimento, int anoIngresso) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anoIngresso = anoIngresso;

        System.out.println("\nConstrutor 3:");
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Ano de ingresso: " + anoIngresso);
    }
}
