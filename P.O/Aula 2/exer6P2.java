import java.util.Scanner;

public class exer6P2 {
    public static void main (String[]args){

        Scanner teclado = new Scanner(System.in);

        String cidade[] = new String[5]; 
        float populacao[] = new float[5]; 
        float maiorPopulacao = 0;  
        String cidadeMaisPopulosa = ""; 

        for(int i = 0; i < 5; i++){
            System.out.println("Digite o nome da cidade "+(i+1)+": ");
            cidade[i] = teclado.nextLine();
            System.out.println("Digite a população de "+cidade[i]+": ");
            populacao[i] = teclado.nextFloat(); 
            teclado.nextLine(); // limpar o buffer 

            if(populacao[i] > maiorPopulacao){
                maiorPopulacao = populacao[i]; 
                cidadeMaisPopulosa = cidade[i]; 
            }
        }

        System.out.println("A cidade mais populosa é a de: "+cidadeMaisPopulosa+" com: "+maiorPopulacao+" habitantes");



        teclado.close();
    }
}
