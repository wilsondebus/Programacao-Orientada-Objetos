import java.util.Scanner; 

public class exer1 {
    public static void main(String[]args){
        

        Scanner teclado = new Scanner(System.in);
        float num1, num2; 

        System.out.println("Digite o primeiro numero: "); 
        num1 = teclado.nextFloat(); 

        System.out.println("Digite o segundo numero: ");
        num2 = teclado.nextFloat(); 

        float adicao, subtracao, multiplicacao, divisao; 

        adicao = num1 + num2; 
        subtracao = num1 - num2; 
        multiplicacao = num1 * num2; 
        divisao = num1 / num2; 

        System.out.println("A adição dos numeros é: "+adicao);
        System.out.println("A subtração dos numeros é: "+subtracao);
        System.out.println("A multiplicação dos numeros é: "+multiplicacao);
        System.out.println("A divisão dos numeros é: "+divisao);

        teclado.close();
    }
}
