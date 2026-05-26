public class Gerente extends Funcionario{
    
    private double bonus;

    public Gerente(String nome, double salario, double bonus){
        super(nome, salario); 
        this.bonus = bonus;
    }

    public void aumentarSalario(double aumentoFixo){
        salario += aumentoFixo + bonus; 
        System.out.println("Salario Bruto Gerente:  "+salario);
    }

    @Override
    public String toString() {
        return "Gerente [nome=" + nome + ", bonus=" + bonus + ", salario=" + salario; 
    }  
}
