import java.util.Scanner; 

public class Principal {
    public static void main(String[]args){
        
        Scanner teclado = new Scanner(System.in); 

        Carro c1 = new Carro();
        Carro c2 = new Carro();

        System.out.println("\tCARRO 1");
        System.out.println("Digite a MARCA: ");
        c1.marca = teclado.nextLine(); 
        System.out.println("Digite o MODELO: ");
        c1.modelo = teclado.nextLine(); 
        System.err.println("Digite o ANO DE FABRICAÇÃO: ");
        c1.anoFabricacao = teclado.nextInt();
        teclado.nextLine(); 

        System.out.println("\tCARRO 2");
        System.out.println("Digite a MARCA: ");
        c2.marca = teclado.nextLine(); 
        System.out.println("Digite o MODELO: ");
        c2.modelo = teclado.nextLine(); 
        System.err.println("Digite o ANO DE FABRICAÇÃO: ");
        c2.anoFabricacao = teclado.nextInt();
        teclado.nextLine();

        teclado.close(); 
    }
}
