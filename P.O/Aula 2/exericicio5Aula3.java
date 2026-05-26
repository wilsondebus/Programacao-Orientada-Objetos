import java.util.Scanner; 


public class exericicio5Aula3 {
    public void main(String[]args){

        Scanner teclado = new Scanner(System.in);

        int n, fatorial = 1; 

        System.out.println("Digite um numero: ");
        n = teclado.nextInt();

        if(n < 0){
            System.out.println("Não existe fatorial negativa.");
        } else {
        for(int i = 1; i <= n; i++){
            fatorial = fatorial * i;
            }
        }

        System.out.println("Fatorial = "+fatorial);

        teclado.close();
    }
}
