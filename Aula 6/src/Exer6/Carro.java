import java.util.Scanner;

public class Carro {

    Scanner teclado = new Scanner(System.in); 

    public String modelo;
    public float velocidadeAtual;
    public float velocidadeMaxima; 

    public Carro(){
        this.modelo = "GOL";
        this.velocidadeAtual = 60;
        this.velocidadeMaxima = 160; 
    }

    public void acelerar(){
        System.out.print("Digite quantos km o carro acelerou: ");
        float acelerou = teclado.nextFloat();

        if((velocidadeAtual + acelerou) < velocidadeMaxima){
            velocidadeAtual += acelerou;
            System.out.println("O carro esta a "+velocidadeAtual+"km/h");
        } else {
            System.out.println("O carro não pode Ultrapassar a velocidade maxima");
        }
    }

    public void frear(){
        System.out.println("Digite quantos km o carro freiou");
        float freiou = teclado.nextFloat(); 

        if((velocidadeAtual - freiou) > 0){
            velocidadeAtual -= freiou;
            System.out.println("O carro esta a "+velocidadeAtual+"km/h");
        } else {
            System.out.println("O carro não pode estar em uma velocidde negativa");
        }
    } 

    public Boolean atingiuVelocidadeMaxima(){
        if(velocidadeAtual >= velocidadeMaxima){
            return true;
        } else {
            return false;
        }
    }

    public float tempoViagem(){
        System.out.print("Quanto km de distancia voce quer chegar? ");
        float distancia = teclado.nextFloat(); 
        teclado.nextLine();

        float tempoViagem = (distancia / velocidadeAtual); 
        return tempoViagem;  
    }


}