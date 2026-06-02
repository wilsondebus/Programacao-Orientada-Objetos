public class Circulo extends Forma{
    
    public double raio;

    public Circulo(double raio){
        super();
        this.raio = raio; 
    }


    @Override
    public double area() {
        return Math.PI * Math.pow(raio,2); 
    }

    @Override
    public double perimetro(){
        return 2 * Math.PI * raio; 
    }
    
}
