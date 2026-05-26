package Exemplo2;

public class Desenho2D extends Desenho {
    protected int largura;
    protected int altura;

    public Desenho2D(String nomeAutor, int largura, int altura) {
        super(nomeAutor); 
        this.largura = largura;
        this.altura = altura;
    }
}
