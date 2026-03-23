package Exercicio2;

import java.util.Scanner;

public class Livro{

    public String titulo;
    public String autor;
    public int anoPublicacao;
    public String genero;
    public boolean emprestado;

    Scanner teclado = new Scanner(System.in);

    public Livro(){
        this.titulo = "Meu Pe de Laranja Lima";
        this.autor = "Jose Mauro de Vasconcelos";
        this.anoPublicacao = 1968;
        this.genero = "Romance e Ficao";
        this.emprestado = false;
    }

    public String getExibir(){
        return "TITULO: "+titulo+
                "\nAUTOR:"+autor+
                "\nGenero: "+genero+
                "\nEmprestado: "+(emprestado ? "Sim" : "Nao");

    }

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado!");
        } else {
            System.out.println("Já está emprestado!");
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido!");
        } else {
            System.out.println("Livro já está disponível!");
        }
    }

}
