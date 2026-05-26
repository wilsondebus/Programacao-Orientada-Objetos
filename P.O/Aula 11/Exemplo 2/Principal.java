import java.util.Scanner; 

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 

        Pessoa pessoa; 

        System.out.println("Digite 1 para pessoa");
        System.out.println("Digite 2 para programador");
        System.out.print("-> ");
        int opcao = teclado.nextInt();
        teclado.nextLine();

        if(opcao == 1){
            pessoa = new Pessoa();
            pessoa.trabalhar();
        } else if (opcao == 2){
            pessoa = new Programador();
            pessoa.trabalhar(); 
        } else {
            System.out.println("Numero invalido!");
        }

        teclado.close(); 
    }
}
