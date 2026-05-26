package Exemplo2;

public class Quadrado extends Desenho2D{
    protected String desc;

    public Quadrado(String nomeAutor, int largura, int altura, String desc) {
        super(nomeAutor, largura, altura);
        this.desc = desc;
    }

    public void exibirDados(){
        System.out.println("Largura: "+this.largura);
        System.out.println("Altura: "+this.altura);
        System.out.println("Descrição: "+this.desc);
        System.out.println("Autor: "+this.nomeAutor);
    }
}
