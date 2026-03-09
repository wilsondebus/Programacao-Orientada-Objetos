import java.util.Scanner; 

public class exer7P2 {
    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in); 

        float notas[][] = new float[3][4]; 
        float notaMaisAlta[] = new float[4]; 
        float notaMaisBaixa[] = new float[4]; 

        for(int j = 0; j < 4; j++){
            notaMaisAlta[j] = 0; 
            notaMaisBaixa[j] = 20; 
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.println("Digite a nota do aluno "+(i+1)+" na disciplina "+(j+1)+":"); 
                notas[i][j] = teclado.nextFloat(); 

                if(notas[i][j] > notaMaisAlta[j]){
                    notaMaisAlta[j] = notas[i][j]; 
                }
                if(notas[i][j] < notaMaisBaixa[j]){
                    notaMaisBaixa[j] = notas[i][j]; 
                }
                
            }
        }
        for(int j = 0; j < 4; j++){
            System.out.println("Disciplina "+(j+1));
            System.out.println("A nota mais alta é: "+notaMaisAlta[j]);
            System.out.println("A nota mais baixa é: "+notaMaisBaixa[j]);
        }


        teclado.close(); 
    }
}
