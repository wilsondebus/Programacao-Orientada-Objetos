import java.util.Scanner; 

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Funcionario funcionario = new Funcionario(1500); 
        funcionario.calcularSalario();

        System.out.println("Digite o bonus salarial do Gerente: ");
        double bonus = teclado.nextDouble();

        Gerente gerente = new Gerente(1500, bonus); 
        gerente.calcularSalario();

        teclado.close(); 
    }
}
