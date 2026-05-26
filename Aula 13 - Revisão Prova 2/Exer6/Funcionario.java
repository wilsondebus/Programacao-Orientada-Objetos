public class Funcionario{

    protected String nome; 
    protected double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome; 
        this.salario = salario;
    }

    public void aumentarSalario(double aumentoFixo){
        salario = salario + aumentoFixo; 
        System.out.println("Salario Bruto Funcionario: "+salario);
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", salario=" + salario
                + "]";
    }

    
}