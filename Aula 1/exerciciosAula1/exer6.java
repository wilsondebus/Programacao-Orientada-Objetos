import java.util.Scanner; 

public class exer6 {
    public static void main(String[]args){
        
    Scanner teclado = new Scanner(System.in); 

    float num1, num2, num3; 
    
    System.out.println("Informe 3 numeros");
    num1 = teclado.nextFloat(); 
    num2 = teclado.nextFloat();
    num3 = teclado.nextFloat();

    System.out.println("Numeros na ordem crescente: ");

    if(num1 <= num2 && num1 <= num3){
        System.out.println(num1);
        if(num2 <= num3 && num2 >= num1){
            System.out.println(num2);
            System.out.println(num3);
        } else {
            System.out.println(num3);
            System.out.println(num2);
        }
    } else if(num2 <= num1 && num2 <= num3){
        System.out.println(num2);
        if(num1 <= num3 && num1 >= num2){
            System.out.println(num1);
            System.out.println(num3);
        } else {
            System.out.println(num3);
            System.out.println(num1);
        }
    } else {
        System.out.println(num3);
        if(num1 <= num2 && num1 >= num3){
            System.out.println(num1);
            System.out.println(num2);
        } else {
            System.out.println(num2);
            System.out.println(num1);
        }
    }

    
    teclado.close(); 
    }
}
