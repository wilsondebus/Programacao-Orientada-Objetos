import java.util.Scanner;

public class exer9 {
    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in); 

        float num1, num2; 
        int opcao; 

        System.out.println("Digite dois numeros: ");
        num1 = teclado.nextFloat();
        num2 = teclado.nextFloat(); 

        System.out.println("\t Menu de opções: ");
        System.out.println("1 para somar...");
        System.out.println("2 para subtrair...");
        System.out.println("3 para multiplicar...");
        System.out.println("4 para dividir...");

        opcao = teclado.nextInt();
        switch(opcao){
            case 1: 
                System.out.println(num1+ " + " +num2+ " = " +(num1+num2));
                break;

            case 2:
                System.out.println(num1+ " - " +num2+ " = " +(num1-num2));
                System.out.println(num2+ " + " +num1+ " = " +(num2-num1));
                break; 

            case 3: 
                System.out.println(num1+ " * " +num2+ " = " +(num1*num2));
                break; 
            
            case 4: 
                System.out.println(num1+ " % " +num2+ " = " +(num1/num2));
                System.out.println(num2+ " % " +num1+ " = " +(num2/num1));
        }
        
        teclado.close();
    } 
}
