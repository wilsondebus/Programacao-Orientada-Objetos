public class Desenvolvedor extends Funcionario{
    
    private double horaExtra;

    public Desenvolvedor(String nome, double salario, double horaExtra){
        super(nome, salario);
        this.horaExtra = horaExtra; 
    }

    public void aumentarSalario(double aumentoFixo){
        salario += aumentoFixo + (horaExtra * 30); 
        System.out.println("Salario Bruto Dev: "+salario);
    }

    @Override
    public String toString() {
        return "Desenvolvedor [nome=" + nome + ", horaExtra=" + horaExtra + ", salario=" + salario
                +"]";
    }

    

}
