public class Principal {
    public static void main(String[] args) {

        double aumentoFixo = 210; 
            
        Funcionario [] funcionarios = new Funcionario[3];
        
        funcionarios[0] = new Gerente("Julino", 5000, 400); 
        funcionarios[1] = new Gerente("Liti", 6500,370);
        funcionarios[2] = new Desenvolvedor("Wilson", 1200, 5); 

        System.out.println("Salarios antes do aumento: ");
        for(Funcionario funcionario : funcionarios){
            System.out.println(funcionario);
            System.out.println("-----------------");
        }

        System.out.println();

        System.out.println("Depois do aumento: ");
        for(Funcionario funcionario : funcionarios){
            funcionario.aumentarSalario(aumentoFixo);

            System.out.println(funcionario);
            System.out.println("-----------------");
        }
    }
}
