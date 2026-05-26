public class Principal {
    public static void main(String[]args) {

        Retangulo r1 = new Retangulo();

        System.out.println("Valor da area: "+r1.calcularArea());
        System.out.println("Valor do perimetro: "+r1.calcularPerimetro());
        System.out.println("valor da diagonal: "+r1.calcularDiagonal());
        System.out.println("É quadrado? "+r1.ehQuadrado());
    }
}
