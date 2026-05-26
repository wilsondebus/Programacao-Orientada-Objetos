import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int adicao;
        int subtracao;
        float multiplicacao;
        float divisao; 

        System.out.println("Digite dois valores inteiros para somar");
        try{
            int num1 = teclado.nextInt();
            teclado.nextLine();
            int num2 = teclado.nextInt();
            teclado.nextLine();

            System.out.println("Adicao = "+(adicao=num1+num2));
        } catch (Exception e){
            System.out.println("Erro: "+e.toString());
        }

        System.out.println("Digite dois valores inteiros para subtrair");
        try{
            int num1 = teclado.nextInt();
            teclado.nextLine();
            int num2 = teclado.nextInt();
            teclado.nextLine();

            System.out.println("Subtracao = "+(adicao=num1-num2));
        } catch (Exception e){
            System.out.println("Erro: "+e.toString());
        }

         System.out.println("Digite dois valores para multiplicar");
         try{
            float num1 = teclado.nextFloat();
            float num2 = teclado.nextFloat();

            System.out.println("Mutiplicacao = "+(multiplicacao=num1*num2));
         } catch (Exception e){
            System.out.println("Erro: "+e.toString());
         }

         System.out.println("Digite dois valores para dividir");
         try{
            float num1 = teclado.nextFloat();
            float num2 = teclado.nextFloat(); 

            System.out.println("Divisao = "+(divisao=num1/num2));
         } catch (Exception e){
            System.out.println("Erro: "+e.toString());
         }

         teclado.close(); 
    }
}
