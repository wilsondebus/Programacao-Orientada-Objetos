import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double num1; 

        System.out.println("CALCULAR RAIZ QUADRADA");
        System.out.println("Digite um numero: ");
        try{
            num1 = teclado.nextFloat();

            double raizQuadrada = Math.sqrt(num1); 
            System.out.println("Raiz quadrada de "+num1+" = "+raizQuadrada);
        } catch (Exception e){
            System.out.println("Erro: "+e.toString());
        }

        teclado.close(); 
    }
}
