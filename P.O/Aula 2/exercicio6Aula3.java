import java.util.Scanner; 

public class exercicio6Aula3{
    public void main(String[]args){

        Scanner teclado = new Scanner(System.in); 

        System.out.println("Digite numeros e digite 0 para interromper");
        
        int numero;
        do{
            System.out.println("Digite um numero: ");
            numero = teclado.nextInt(); 
        } while(numero != 0); 

        teclado.close(); 
    }
}