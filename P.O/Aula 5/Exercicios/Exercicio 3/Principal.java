import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int inteiro;
        double decimal; 
        String caracter; 

        System.out.print("Digite um numero inteiro: ");
        try {
            inteiro = teclado.nextInt();
            teclado.nextLine();
        } catch (Exception e){
            System.out.println("Erro: "+e.toString());
        }

        System.out.print("Digite um numero decimal: ");
        try{
            decimal = teclado.nextDouble();
            teclado.nextLine();
        } catch (Exception e){
            System.out.println("Erro: "+e.toString());
        }

        System.out.print("Digite um caracter: ");
        try{
            caracter = teclado.nextLine();
        } catch (Exception e){
            System.out.println("Erro: "+e.toString());
        }

        teclado.close(); 
    }
}
