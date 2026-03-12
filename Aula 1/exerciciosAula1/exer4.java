import java.util.Scanner; 

public class exer4{
    public static void main(String[]args){

        int x, y; 

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o ponto x do Plano Cartesiano: ");
        x = teclado.nextInt(); 
        System.out.println("Digite o ponto y do Plano Cartesiano: ");
        y = teclado.nextInt(); 

        if(x > 0 && y > 0){
            System.out.println("O ponto informado esta no PRIMEIRO quadrante.");
        }
        else if(x < 0 && y > 0){
            System.out.println("O ponto informado esta no SEGUNDO quadrante.");
        }
        else if(x < 0 && y < 0){
            System.out.println("O ponto informado esta no TERCEIRO quadrante");
        }
        else if(x > 0 && y < 0){
            System.out.println("O ponto informado esta no QUARTO quadrante");
        }
        else if(x == 0 && y != 0){
            System.out.println("O ponto informado esta sobre o eixo y");
        }
        else if(y == 0 && x != 0){
             System.out.println("O ponto informado esta sobre o eixo x");
        }
        else {
            System.out.println("O ponto informado esta na origem (0,0)");
        }

        teclado.close(); 
    }
}
