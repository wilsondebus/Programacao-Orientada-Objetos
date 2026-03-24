import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 

        String temperatura; 

        System.out.println("Digite uma temperatura em graus");
        try{
            temperatura = teclado.nextLine();

           double temp = Double.parseDouble(temperatura); 

            double fahrenheit = (temp * 1.8) + 32; 
            System.out.println("COnversao para fahrenheit = "+fahrenheit);
        } catch(NumberFormatException e){
            System.out.println("Erro: "+e.getMessage());
        }

        teclado.close(); 
    }
}