import java.util.Scanner;

public class exercicio10Aula3 {
    public void main(String[]args){

        Scanner teclado = new Scanner(System.in); 

        System.out.println("Digite numeros e digite 0 para interromper");
        
        int numero, i = 0, soma = 0, media;
        while (true){
            System.out.println("Digite um numero: ");
            numero = teclado.nextInt();
            soma += numero;  
            if(numero <= 0){
                break; 
            }
            i++;
        }

        media = soma / i; 
        System.out.println("A media dos numeros é: "+media);

        teclado.close(); 
    }
}
