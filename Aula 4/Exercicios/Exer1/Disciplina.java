package Exercicio1;
import java.util.Scanner;

public class Disciplina {

    Scanner teclado = new Scanner(System.in);

    public String nome; 
    public int cargaHoraria;
    public String nomeProfessor; 

    public Disciplina(){
        this.nome = "Matematica";
        this.cargaHoraria = 80;
        this.nomeProfessor = "Leticia";
    }

    public void exibir(){
        System.out.println("Nome: "+nome);
        System.out.println("Carga Horaria: "+cargaHoraria);
        System.out.println("Nome do Professor: "+nomeProfessor);
    }

    public void inserir(){
        System.out.println("Nome Disciplina: ");
        nome = teclado.nextLine();
        System.out.println("Carga Horaria: ");
        cargaHoraria = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Nome Professor: ");
        nomeProfessor = teclado.nextLine();
    }

}
