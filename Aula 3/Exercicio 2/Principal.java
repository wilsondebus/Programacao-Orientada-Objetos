import java.util.Scanner;

public class Principal {
    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in); 

        Computador c1 = new Computador();
        Computador c2 = new Computador(); 
        
        System.out.println("\tCADASTRE OS DADOS:");
        System.out.println("MARCA: ");
        c1.marca = teclado.nextLine();
        System.out.println("MODELO: ");
        c1.modelo = teclado.nextLine();
        System.out.println("TIPO: ");
        c1.tipo = teclado.nextLine();
        System.out.println("PPREÇO: ");
        c1.preco = teclado.nextFloat(); 
        teclado.nextLine(); 

        System.out.println("\tDADOS ANTERIORES: ");
        System.out.println("MARCA: "+c2.marca);
        System.out.println("MODELO: "+c2.modelo);
        System.out.println("TIPO: "+c2.tipo);
        System.out.println("Preço: "+c2.preco);

        teclado.close(); 
    }
}
