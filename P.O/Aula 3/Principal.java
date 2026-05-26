import java.util.Scanner; 

public class Principal{

    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in);

        int n;
        aluno a1 = new aluno(); 
        a1.nome = "Wilson"; 
        a1.matricula = "1020300";
        a1.cpf = "04284945017"; 
        System.out.println("Aluno instanciado");
        System.out.println("Nome: "+a1.nome);
        System.out.println("Matricula: "+a1.matricula);
        System.out.println("CPF: "+a1.cpf);

        aluno a2 = new aluno(); 
        a2.nome = "Kaua"; 
        a2.matricula = "202020"; 
        a2.cpf = "11122233389"; 
        System.out.println("Aluno instanciado");
        System.out.println("Nome: "+a2.nome);
        System.out.println("Matricula: "+a2.matricula);
        System.out.println("CPF: "+a2.cpf);

        aluno a3 = new aluno();
        aluno a4 = new aluno();
        aluno a5 = new aluno(); 

        System.out.println("Difite o nome do aluno 3: ");
        a3.nome = teclado.nextLine();
        System.out.println("Digite a matricula do aluno 3: ");
        a3.matricula = teclado.nextLine();
        System.out.println("Digite o CPF do aluno 3: ");
        a3.cpf = teclado.nextLine(); 

        System.out.println("Difite o nome do aluno 4: ");
        a4.nome = teclado.nextLine();
        System.out.println("Digite a matricula do aluno 4: ");
        a4.matricula = teclado.nextLine();
        System.out.println("Digite o CPF do aluno 4: ");
        a4.cpf = teclado.nextLine();

        System.out.println("Difite o nome do aluno 5: ");
        a5.nome = teclado.nextLine();
        System.out.println("Digite a matricula do aluno 5: ");
        a5.matricula = teclado.nextLine();
        System.out.println("Digite o CPF do aluno 5: ");
        a5.cpf = teclado.nextLine(); 

        teclado.close();
    }
}