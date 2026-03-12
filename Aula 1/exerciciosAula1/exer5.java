import java.util.Scanner;  

public class exer5 {
     public static void main (String[]args){

        Scanner teclado = new Scanner(System.in);

        float valor1, valor2, valor3, maiorValor = -20000; 

        System.out.println("Digite o primeiro numero: ");
        valor1 = teclado.nextFloat(); 
        System.out.println("Digite o segundo valor: ");
        valor2 = teclado.nextFloat(); 
        System.out.println("Digite o terceiro valor ");
        valor3 = teclado.nextFloat(); 

        if(valor1 > maiorValor){
            maiorValor = valor1; 
        }
        if(valor2 > maiorValor){
            maiorValor = valor2;
        }
        if(valor3 > maiorValor){
            maiorValor = valor3;
        }

        System.out.println("O maior valor é o "+maiorValor);

        teclado.close();

    }
}
