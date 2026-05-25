public class Gerente extends Funcionario{
    
    private double bonus; 

    public Gerente(double salario, double bonus){
        super(salario);
        this.bonus = bonus; 
    }

    public void calcularSalario(){
        double salarioGerente = salario + bonus; 
        System.out.println("Gerente");
        System.out.println("Salário R$ "+salarioGerente);
    }

}
