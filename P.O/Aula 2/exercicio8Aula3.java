import java.util.Scanner;

public class exercicio8Aula3 {
    public void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        String cidade;  

        do{
            System.out.println("Digite o nome de uma cidade: ");
            cidade = teclado.nextLine();
        } while (cidade.equals("São Paulo")); //comparar string 

        System.out.println("Programa Encerrado!");

        teclado.close(); 
    }
}
