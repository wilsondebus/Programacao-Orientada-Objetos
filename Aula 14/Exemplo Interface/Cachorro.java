public class Cachorro implements Animal{

    public String nome; 
    public String raca; 
    public int idade;

    @Override
    public void emitirSom() {
        System.out.println("au au au");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Cachorro: "+nome);
        System.out.println("Raça: "+raca);
        System.out.println("Idade: "+idade);
    }

    @Override
    public boolean verificarVacinacao() {
        System.out.println("verificando vacinação do cachorro");
        return true; 
    }
    
}
