import java.util.Scanner; 

public class exer3 {
    public static void main(String[]args){
        float num1, num2, num3, num4; 
        float media; 

        Scanner teclado = new Scanner(System.in); 
        
        System.out.println("Digite o primeiro numero: ");
        num1 = teclado.nextFloat();
        System.out.println("Digite o segundo numero: ");
        num2 = teclado.nextFloat();
        System.out.println("Digite o terceiro numero: ");
        num3 = teclado.nextFloat();
        System.out.println("Digite o quarto numero: ");
        num4 = teclado.nextFloat();

        media = (num1 + num2 + num3 + num4) / 4; 

        System.out.println("A media dos numeros é"+media);

        if(num1 > media){
            System.out.println("O numero "+num1+" é maior que a media");
        }
        if(num2 > media){
            System.out.println("O numero "+num2+" é maior que a media");
        }
        if(num3 > media){
            System.out.println("O numero "+num3+" é maior que a media");
        }
        if(num4 > media){
            System.out.println("O numero "+num4+" é maior que a media");
        }

        teclado.close();

    }
}
