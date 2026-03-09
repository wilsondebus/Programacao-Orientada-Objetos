import java.util.Scanner; 

public class exer5P2 {
    public void main(String[]args){

        Scanner teclado = new Scanner(System.in); 

        int numeros[] = new int[10]; 
        int maiorNumero = -9999, menorNumero = 9999; 

        for(int i = 0; i < 10; i++){
            System.out.println("Digite 10 valores: ");
            numeros[i] = teclado.nextInt(); 
            if(numeros[i] > maiorNumero){
                maiorNumero = numeros[i]; 
            }
            if(numeros[i] < menorNumero){
                menorNumero = numeros[i]; 
            }
        }
        System.out.println("O maior numero da lista é o: "+maiorNumero);
        System.out.println("O menor numero da lista é o: "+menorNumero);

        teclado.close(); 
    }
}
