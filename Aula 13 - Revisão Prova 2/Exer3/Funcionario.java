public class Funcionario{

    protected double salario; 

    public Funcionario(double salario){
        this.salario = salario; 
    }

    public void calcularSalario(){
        System.out.println("Empregado");
        System.out.println("Salário R$ "+salario);
    }
}