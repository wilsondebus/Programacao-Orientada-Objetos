import java.util.Scanner;

public class Notebook extends Computador{

    public Notebook(String marca){
        super(marca); 
    }

    public void exibeMarca(){
        System.out.println("Marca: "+marca);
    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 

        System.out.println("Digte a marca do Notebook: ");
        String marca = teclado.nextLine(); 

        Notebook notebook = new Notebook(marca); 
        
        notebook.exibeMarca();
        notebook.exibeModelo();

        teclado.close(); 
    }
}
