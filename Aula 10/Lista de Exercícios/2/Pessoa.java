public class Pessoa{

    protected String nome;
    
    public Pessoa(String nome){
        this.nome = nome; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void trabalhar(){
        System.out.println("O(a) "+nome+" esta trabalhando");
    }
}