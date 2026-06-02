public class Cachorro extends Animal{

    private String raca; 
    
    //adiciona os métodos implementados em Animal 
    @Override
    public void emiteSom() {
        System.out.println("au au au");

    }    

    public void mostrarNaTela(){
        System.out.println("Especie: "+especie);
        System.out.println("Idade: "+idade);
        System.out.println("Raça: "+raca);
    }

    public void cuidarPatio(){
        System.out.println("O cachorro esta cuidando do pátio");
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    
}
