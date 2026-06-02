import java.util.Scanner; 

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); 

        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Dexter";
        cachorro.raca = "BullDog"; 
        cachorro.idade = 10; 
        
        cachorro.emitirSom();
        cachorro.exibirInfo();
        System.out.println(cachorro.verificarVacinacao());

        Gato gato = new Gato(); 
        gato.emitirSom();
        gato.exibirInfo();
        System.out.println(gato.verificarVacinacao()); 

        teclado.close(); 
    }
}
