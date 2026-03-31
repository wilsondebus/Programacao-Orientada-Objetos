import java.util.Scanner;

public class Filme {

    Scanner teclado = new Scanner(System.in); 

    public String titulo;
    public float duracao; 
    public int classificacaoEtaria; 

    public Filme(){
        this.titulo = "Homem Aranha"; 
        this.duracao = 124; 
        this.classificacaoEtaria = 12;
    }

    public float converterDuracaoEmHoras(){
        return duracao / 60; 
    }

    public Boolean podeAssistir(){
        System.out.print("Digite sua Idade: ");
        int idade = teclado.nextInt(); 
        teclado.nextLine();

        if(idade >= classificacaoEtaria){
            return true;
        } else {
            return false;
        }
    }

    public String informacoes(){
        String informacoesFilme = "Homem Aranha, Duração: 124min, Faixa Etária: +12 anos";
        return informacoesFilme; 
    }
}