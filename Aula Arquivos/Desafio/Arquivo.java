package Desafio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {
    
    private FileWriter arqw;
    private BufferedWriter escritor;
    private FileReader arqr;
    private BufferedReader leitor; 
    private List<Aluno> listAlunos;
    public String nomeArquivo;
    
    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.listAlunos = new ArrayList<>();
    } 

    public void gravaArquivo(Aluno a) {
        try {
            arqw = new FileWriter(nomeArquivo + ".txt", true); 
            escritor = new BufferedWriter(arqw); 

            escritor.write(a.getNome() + "," + a.getIdade()); 
            escritor.newLine(); 

            escritor.close(); 
            arqw.close(); 

            System.out.println("Aluno salvo no arquivo " + nomeArquivo + ".txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Aluno> leArquivo() {
        // cria uma lista vazia antes de ler o arquivo
        listAlunos = new ArrayList<>();

        System.out.println("Alunos lidos no arquivo:");

        try {
            arqr = new FileReader(nomeArquivo + ".txt"); 
            leitor = new BufferedReader(arqr); 

            String linha; 

            while ((linha = leitor.readLine()) != null) {
                String[] campos = linha.split(",");

                String nome = campos[0];
                int idade = Integer.parseInt(campos[1]); 

                Aluno aluno = new Aluno(nome, idade); 
                listAlunos.add(aluno); 
            }

            leitor.close(); 
            arqr.close(); 

        } catch (IOException e) {
            e.printStackTrace();
        }

        return listAlunos; 
    }
}