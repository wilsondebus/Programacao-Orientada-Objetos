public class Principal {
    public static void main(String[] args) {
        
        FormaGeometrica formaGeometrica = new FormaGeometrica();
        Triangulo triangulo = new Triangulo(); 

        System.out.println("Area da base geometrica = "+formaGeometrica.calcularArea(4, 5));
        System.out.println("Area do Triangulo = "+triangulo.calcularArea(4,5));
    }
}
