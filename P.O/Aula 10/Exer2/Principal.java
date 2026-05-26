package Exer2;

public class Principal {
    public static void main(String[] args) {
        
    Pessoa p = new Pessoa("Ricardo", 41); 
    p.exibirDados();

    PessoaJuridica pj = new PessoaJuridica("Wilson", 19, "00009999", "Henrique", "28/04/2026");

    pj.exibirDados();
    }
}
