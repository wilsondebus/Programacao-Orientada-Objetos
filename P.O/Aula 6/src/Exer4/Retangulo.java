public class Retangulo {

    public double largura;
    public double altura;

    public Retangulo(){
        this.largura = 20;
        this.altura = 10;
    }

    public double calcularArea(){
        return largura * altura; 
    }

    public double calcularPerimetro(){
        return (2*largura) + (2*altura); 
    }

    public double calcularDiagonal(){
        return Math.sqrt((largura*largura)+(altura*altura)); 
    }

    public Boolean ehQuadrado(){
        if(altura  == largura){
            return true;
        } else {
            return false;
        }
    }

}
