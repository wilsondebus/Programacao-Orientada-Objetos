import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String [] listaNomes = {"Ana", "Carlos", "Wilson", "Herique", "Pedro"}; 
        int opcao; 

        System.out.print("Digite um numero pra ver quem esta nesta posicao: ");
        try{
            opcao = teclado.nextInt();
            teclado.nextLine();
            System.out.println(listaNomes[opcao]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: "+e.getMessage());
        } catch (Exception e){
            System.out.println("Erro: "+e.toString());
        }

        teclado.close();
    }
}