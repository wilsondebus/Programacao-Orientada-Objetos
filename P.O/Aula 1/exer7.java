import java.util.Scanner; 

public class exer7 {
    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in); 

        float num1, num2;

        System.out.println("Digite dois valores para verificar se são multiplos um do outro: ");
        num1 = teclado.nextFloat();
        num2 = teclado.nextFloat();

        if(num1 % num2 == 0){
            System.out.println("O numero "+num1+" é mulpliplo do numero "+num2);
        } else {
            System.out.println("O numero "+num1+" NÃO é mulpliplo do numero "+num2);
        }
        if(num2 % num1 == 0){
            System.out.println("O numero "+num2+" é mulpliplo do numero "+num1);
        } else {
            System.out.println("O numero "+num2+" é mulpliplo do numero "+num1);
        }

        teclado.close(); 
    }
}
