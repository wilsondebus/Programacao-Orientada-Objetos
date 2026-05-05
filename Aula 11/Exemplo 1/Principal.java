public class Principal {
    public static void main(String[] args) {
        
        Animal animal = new Animal(); 
        System.out.println("Animal: ");
        animal.fazerSom();

        Cachorro cachorro = new Cachorro();
        System.out.println("Cachorro: ");
        cachorro.fazerSom();

        animal = new Cachorro();
        animal.fazerSom(); 

        Passarinho passarinho = new Passarinho();
        System.out.println("Passarinho: ");
        passarinho.fazerSom(); 

        Peixe peixe = new Peixe();
        System.out.println("Peixe: ");
        peixe.fazerSom(); 
    }
}
