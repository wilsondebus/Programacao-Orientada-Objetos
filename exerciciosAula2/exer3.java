import java.util.Scanner; 

public class exer3P2 {
    public void main(String[]args){
        
        Scanner teclado = new Scanner(System.in);

        float notas[] = new float[5]; 
        float soma = 0; 

        for(int i = 0; i < 5; i++){
            System.out.println("Digite a nota do aluno "+(i+1)+":");
            notas[i] = teclado.nextFloat(); 

            soma += notas[i];  
        }

        float media = soma / 5; 
        System.out.println("A media das notas dos alunos é: "+media);

        teclado.close();
    }
}

