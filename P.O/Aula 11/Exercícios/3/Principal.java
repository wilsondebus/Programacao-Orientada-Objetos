import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        String frase; 
        int numeroRepeticoes; 

        System.out.println("Digite uma frase: ");
        frase = teclado.nextLine();
        System.out.println("Digite quantas vezes quer que a frase se repita: ");
        numeroRepeticoes = teclado.nextInt(); 
        teclado.nextLine(); 

        Pessoa pessoa = new Pessoa(); 

        pessoa.falar(frase);
        pessoa.falar(frase, numeroRepeticoes); 

        teclado.close(); 
    }
}

