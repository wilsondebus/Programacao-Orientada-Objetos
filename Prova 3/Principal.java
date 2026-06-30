package Prova03;

import java.util.Scanner; 

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 

        int opcao = 0; 

        Biblioteca b = new Biblioteca(); 

        do{
            System.out.println("\tMENU\n");
            System.out.println("1. Cadastrar livros");
            System.out.println("2. Listar livros");
            System.out.println("3. Sair");
            opcao = teclado.nextInt(); 
            teclado.nextLine(); 

                if(opcao == 1){
                    System.out.println("Digite o titulo do Livro: ");
                    String titulo = teclado.nextLine(); 

                    System.out.println("Digite o autor do Livro: ");
                    String autor = teclado.nextLine(); 

                    System.out.println("Digite o ano de publicação do Livro: ");
                    int anoPublicacao = teclado.nextInt();
                    teclado.nextLine(); 

                    System.out.println("O livro esta emprestado? (1 - Sim / 0 - Não): ");
                    boolean emprestado = teclado.nextBoolean();  
                    teclado.nextLine(); 

                    b.adicionarLivros(titulo, autor, anoPublicacao, emprestado);
                    
                } else if(opcao == 2){
                    b.listarLivros();

                } else if(opcao == 3){
                    System.out.println("Saindo...");
                    break; 

                } else {
                    System.out.println("Opção Inválida. Digite Novamente");
                }

            b.salvarArquivo();
            b.carregarArquivo("livros");

        } while(opcao != 3); 

        teclado.close(); 
        
    }
}
