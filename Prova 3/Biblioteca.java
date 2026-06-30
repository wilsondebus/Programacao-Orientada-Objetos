package Prova03;

import java.util.ArrayList;
import java.util.List;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Biblioteca {

    private FileWriter arqw;
    private BufferedWriter escritor;
    private FileReader arqr;
    private BufferedReader leitor; 
    public String nomeArquivo;

    List <Livro> lista = new ArrayList <>(); 

    public void adicionarLivros(String titulo, String autor, int anoPublicacao, boolean emprestado){
        //instanciando objeto 
        Livro livro = new Livro(titulo, autor, anoPublicacao, emprestado); 

        lista.add(livro); 
    }

    public void listarLivros(){
        for(Livro a : lista){
            System.out.println(a);
        }
    }
    
    public void salvarArquivo(){
        try{
            FileWriter arqr = new FileWriter(nomeArquivo + ".txt", true);
            BufferedWriter escritor = new BufferedWriter(arqw); 

                for (Livro l : lista) {
                escritor.write(l.getTitulo() + "," + l.getAutor() + "," + l.getAnoPublicacao());
                escritor.newLine();
            }

            escritor.close();
            arqw.close();

            System.out.println("Livro salvo no arquivo " + nomeArquivo + ".txt");

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void carregarArquivo(String nomeArquivo){
        try{
            FileReader arquivo = new FileReader("livros.txt"); 
            BufferedReader leitor = new BufferedReader(arquivo); 

            System.out.println("Livros lidos no arquivo: ");

            String linha; 
            while((linha = leitor.readLine()) != null){
                String[] campos = linha.split(","); 

                String titulo = campos[0];
                String autor = campos[1]; 
                int anoPublicacao = Integer.parseInt(campos[2]); 
                
                Livro livro = new Livro(titulo, autor, anoPublicacao, false); 
            }

            leitor.close(); 
            arquivo.close(); 

        } catch(IOException e){
            e.printStackTrace();
        }
    }

}
