public class Principal {
    public static void main(String[] args) {
        
        Carro c1 = new Carro(); 

        System.out.println("\t Dados do carro: ");
        System.out.println(c1.modelo);
        System.out.println(c1.velocidadeAtual);
        System.out.println(c1.velocidadeMaxima);

        c1.acelerar();
        c1.frear();
        System.out.println("O carro esta na velocidade maxima? "+c1.atingiuVelocidadeMaxima());
        float tempoViagem = c1.tempoViagem(); 
        System.out.println("A viagem vai demorar "+tempoViagem+" horas");

    }
}
