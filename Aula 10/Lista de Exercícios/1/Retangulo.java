public class Retangulo extends Figura{
    
    private float largura;
    private float altura; 

    public Retangulo(String cor, String preenchido, float largura, float altura) {
        super(cor, preenchido);
        this.largura = largura;
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calcularArea(){
        float area = largura * altura;
        return area; 
    }
}
