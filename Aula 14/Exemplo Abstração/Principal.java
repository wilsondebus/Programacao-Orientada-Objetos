import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        /*não pode ser instanciada, pois é algo generico(é um animal, mas que animal?)
        Animal animal = new Animal();*/

        Cachorro cachorro = new Cachorro();
        cachorro.emiteSom();
        cachorro.especie = "Cachorro";
        cachorro.idade = 10; 
        cachorro.setRaca("BullDog"); 
        cachorro.mostrarNaTela();
        cachorro.cuidarPatio();

        Tigre tigre = new Tigre();
        tigre.emiteSom();
        tigre.especie = "Tigre Siberiano";
        tigre.idade = 20; 
        tigre.mostrarNaTela();

        System.out.println("Digite 1 para instancia outro cachorro ou 2 para instanciar outro tigre: ");
        int opcao = teclado.nextInt(); 

        Animal animal; 

        if(opcao == 1){
            animal = new Cachorro(); 
            cachorro.especie = "Cachorro";
            cachorro.idade = 6; 
            cachorro.setRaca("Cocker"); 
            animal = cachorro;
            animal.mostrarNaTela();
            cachorro.cuidarPatio();
        } else if(opcao == 2){
            animal = new Tigre();
            tigre.especie = "Tigre Branco"; 
            tigre.idade = 10; 
            animal = tigre; 
            animal.mostrarNaTela();
        }
        
        teclado.close(); 
    }
}
