public class Principal {
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(3.4);
        System.out.println("Área do circulo = "+circulo.area());
        System.out.println("Perímetro do círiculo = "+circulo.perimetro());

        Retangulo retangulo = new Retangulo(3.7,8.3);
        System.out.println("Área do retangulo = "+retangulo.area());
        System.out.println("Perímetro do retangulo = "+retangulo.perimetro());

    }
}
