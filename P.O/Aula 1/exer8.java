import java.util.Scanner; 

public class exer8 {
    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in); 
        
        int idade;

        System.out.println("Situação de Eleitor.");
        System.out.println("Diigte sua idade: ");
        idade = teclado.nextInt(); 

        if(idade < 16){
            System.out.println("Situação: NÃO APTO");
        } else if(idade >= 16 && idade < 18 || idade > 70){
            System.out.println("Situação: FACULTATIVO");
        } else{
            System.out.println("Situação: VOTO OBRIGATÓRIO");
        }
        
        teclado.close(); 
    }
}
