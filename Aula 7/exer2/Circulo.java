package exer2;

public class Circulo {
    public static final double PI = 3.14; 
    
    private double raio; 

    public Circulo(double raio){
        this.raio = raio; 
    }

    public double getRaio(){
        return raio; 
    }

    public void setRaio(double raio){
        this.raio = raio; 
    }

    public double calcularArea(double raio){
        double area = (Math.pow(raio, 2)) * PI; 
        return area; 
    }
}
