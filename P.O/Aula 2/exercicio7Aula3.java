import java.util.Scanner;

public class exercicio7Aula3{
    public void main(String[]args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a nota dos alunos ");
        float notas; 

        int i = 0;
        do{
            System.out.println("Digite a nota do aluno "+(i+1)+": ");
            notas = teclado.nextFloat(); 
            i++;
        }while(notas != -1); 

        System.out.println("PROGRAMA ENCERRADO!");
        
        teclado.close(); 
    }
}