import java.util.Scanner; 

public class exer8P2 {
    public static void main(String[]args){
        
        Scanner teclado = new Scanner(System.in);

        int numero[] = new int[10]; 
        int pares = 0;
        int impares = 0; 

        for(int i = 0; i < 10; i++){
            System.out.println("Digite 10 numeros: ");
            numero[i] = teclado.nextInt(); 

            if(numero[i] % 2 == 0){
                pares++; 
            } else {
                impares++; 
            }
        }

        System.out.println("Quantidade de numeros PARES: "+pares);
        System.out.println("Quantidade de numeros IMPARES: "+impares);

        teclado.close(); 
    }
}
