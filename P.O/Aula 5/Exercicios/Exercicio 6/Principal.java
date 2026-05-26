import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double premio = 1000; 
        double quantidade;

        System.out.println("Digite quantos candidaros irao dividir o premio: ");
        try{
            quantidade = teclado.nextInt();
            teclado.nextLine(); 

            System.out.println( "Cada candidato recebera R$"+(premio/quantidade));
        } catch (ArithmeticException e){
            System.out.println("Erro: "+e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("Erro: "+e.getMessage());
        }

        teclado.close(); 
    }
}