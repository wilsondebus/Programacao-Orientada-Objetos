import java.util.Scanner; 

public class Principal {
    public static void main(String[] args) {
        

        Scanner teclado = new Scanner(System.in); 

        Figura f1 = new Figura(null, null); 
        Retangulo r1 = new Retangulo(null, null, 0, 0); 

        System.out.println("Digite a cor da figura: ");
        String cor = teclado.nextLine(); 
        f1.setCor(cor);

        System.out.println("Digite a altura da figura: ");
        float altura = teclado.nextFloat(); 
        r1.setAltura(altura); 
        teclado.nextLine(); 

        System.out.println("Digite a largura da figura: ");
        float largura = teclado.nextFloat();
        r1.setLargura(largura); 
        teclado.nextLine(); 

        System.out.println("Area da Figura: "+r1.calcularArea());
        
        teclado.close(); 

    }
}
