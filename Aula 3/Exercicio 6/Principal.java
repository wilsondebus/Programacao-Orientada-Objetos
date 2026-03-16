import java.util.Scanner; 

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 

        Aluno a1 = new Aluno();  

        System.out.print("Digite o nome do Aluno: ");
        a1.nome = teclado.nextLine();
        System.out.print("Digite o numero a matricula do Aluno: ");
        a1.matricula = teclado.nextInt();
        teclado.nextLine();

        System.out.print("NOTA 1: ");
        a1.nota1 = teclado.nextFloat();
        System.out.print("NOTA 2: ");
        a1.nota2 = teclado.nextFloat();
        System.out.print("NOTA 3: ");
        a1.nota3 = teclado.nextFloat();

        float mediaAluno = (a1.nota1 + a1.nota2 + a1.nota3) / 3; 
        float aprovado = 6;
        
        System.out.println("\t DADOS ALUNO: "); 
        System.out.println("Nome: "+a1.nome);
        System.out.println("Matricula: "+a1.matricula);
        System.out.println("Notas: "+a1.nota1 + " | " + a1.nota2 + " | " + a1.nota3);
        System.out.println("Media: "+mediaAluno);
        System.out.print("Situação: ");
        
        if(mediaAluno >= aprovado){
            System.out.println("APROVADO!");
        } else {
            System.out.println("REPROVADO!");
        }

        teclado.close(); 
    }
}
