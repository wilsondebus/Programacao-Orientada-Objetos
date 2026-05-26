package Exer1;

public class Principal {
    public static void main(String[] args) {
         
        Cachorro c1 = new Cachorro(); 
        c1.setNome("Dexter");
        c1.setIdade(7);
        c1.setRaca("BullDog Ingles");
        c1.setSom("AUAUAU");

        c1.exibirDados();
        c1.latir();
        
    }
}