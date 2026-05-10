import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        

        Scanner teclado = new Scanner(System.in);
        
        int tamanho; 

        System.out.println("Digite o tamanho da casa em metros quadrados: ");
        tamanho = teclado.nextInt();
        teclado.nextLine(); 

        Casa casa = new Casa();
        
        System.out.println("Preço da casa com "+tamanho+ " metros quadrados sem quartos R$ "+casa.calcularPreco(tamanho)); 

        System.out.println("Quantos quartos gostaria de adicionar: ");
        int quartos = teclado.nextInt();
        teclado.nextLine(); 

        System.out.println("Preço da mesma casa com "+quartos+" quartos: "+casa.calcularPreco(tamanho, quartos));
        
        teclado.close();
        
    }
}
