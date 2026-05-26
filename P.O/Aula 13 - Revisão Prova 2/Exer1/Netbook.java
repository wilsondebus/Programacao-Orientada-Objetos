import java.util.Scanner;

public class Netbook extends Computador{

    public Netbook(String marca){
        super(marca); 
    }

    public void exibeMarca(){
        System.out.println("Marca: "+marca);
    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 

        System.out.println("Digite a marca do Netbook: ");
        String marca = teclado.nextLine(); 

        Netbook netbook = new Netbook(marca); 

        netbook.exibeMarca(); 
        netbook.exibeModelo(); 

        teclado.close(); 
    }
}