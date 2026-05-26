package Exer5;

public class Principal {
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario();

        System.out.println("\tDados do Funcionario:");
        System.out.println(f1.nome);
        System.out.println(f1.salario);
        System.out.println(f1.horasExtras);

        f1.calcularValorHoraExtra();
        System.out.println("Salario Bruto do Funcionario: "+f1.calcularPagamentoTotal());
        f1.adicionarHorasExtras();
        System.out.println("Horas extras deste funcionario: "+f1.horasExtras);
        System.out.println("Salario liquido Anual: "+f1.calcularSalarioAnual());

    }
}
