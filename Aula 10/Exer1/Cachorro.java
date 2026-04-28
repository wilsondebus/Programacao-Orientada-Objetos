package Exer1;

public class Cachorro extends Animal {
    
    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    } 


    public void exibirDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Raca: "+raca);
        
    }

    public void latir(){
        System.out.println("Som do cachorro: "+som);
    }
    
}
