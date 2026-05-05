public class Funcionario extends Pessoa{
    
    public Funcionario(String nome){
        super(nome);  
    }

    public void trabalhar(){
        System.out.println("O(a) "+nome+" esta trabalhando");
    }
}
