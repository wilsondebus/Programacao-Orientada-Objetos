package Exemplo1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class Principal {
    public static void main(String[] args) {
        
        //criando objetos Aluno 
        Aluno aluno1 = new Aluno("Wilson", 19);
        Aluno aluno2 = new Aluno("Henrique", 19);
        Aluno aluno3 = new Aluno("João", 20); 

        //escrevendo os alunos em um arquivo de texto 
        try{
            FileWriter arquivo = new FileWriter("alunos.txt");
            BufferedWriter escritor = new BufferedWriter(arquivo); 

            //escrevendo os alunos mo arquivo 
            escritor.write(aluno1.getNome() + "," + aluno1.getIdade()); 
            escritor.newLine(); 

            escritor.write(aluno2.getNome() + "," + aluno2.getIdade()); 
            escritor.newLine(); 

            escritor.write(aluno3.getNome() + "," + aluno3.getIdade()); 
            escritor.newLine(); 

            escritor.close();
            arquivo.close();

            System.out.println("Alunos salvos no arquivo alunos.txt");

        } catch(IOException e){
            e.printStackTrace();
        }

        //lendo os alunos do arquivo
        try{
            FileReader arquivo = new FileReader("alunos.txt"); 
            BufferedReader leitor = new BufferedReader(arquivo); 

            System.out.println("Alunos lidos no arquivo: ");

            String linha;
            while((linha = leitor.readLine()) != null){
                String[] campos = linha.split(","); 

                String nome = campos [0]; 
                int idade = Integer.parseInt(campos[1]); 

                Aluno aluno = new Aluno(nome,idade); 

                System.out.println("Nome: " + aluno.getNome() + " Idade: "+aluno.getIdade());
            }

            leitor.close();
            arquivo.close(); 

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
