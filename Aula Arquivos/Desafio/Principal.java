package Desafio;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        
        //criando objetos Aluno
        Aluno aluno1 = new Aluno("Wilson", 19);
        Aluno aluno2 = new Aluno("Henrique", 18); 
        Aluno aluno3 = new Aluno("Joao", 20); 

        List<Aluno> lista = new ArrayList<>(); 
        
        Arquivo arquivo = new Arquivo("alunos"); 

        arquivo.gravaArquivo(aluno1); 
        arquivo.gravaArquivo(aluno2);
        arquivo.gravaArquivo(aluno3);

        lista = arquivo.leArquivo();

        for(Aluno a : lista){
            System.out.println("Nome: "+a.getNome() + ", Idade: " + a.getIdade());
        }
    }
}
