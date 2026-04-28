package Exer2;

public class PessoaJuridica extends Pessoa{
    
    private String cnpj;
    private String socio;
    private String dataAbertura;

    public PessoaJuridica(String nome, int idade, String cnpj, String socio, String dataAbertura){
        super(nome, idade);
        this.cnpj = cnpj;
        this.socio = socio;
        this.dataAbertura = dataAbertura; 
    }

    public void exibirDados(){
         System.out.println("Nome: "+nome);
         System.out.println("Idade: "+idade);
         System.out.println("CNPJ: "+cnpj);
         System.out.println("Socio: "+socio);
         System.out.println("Data Abertura: "+dataAbertura);
    }

    
}
