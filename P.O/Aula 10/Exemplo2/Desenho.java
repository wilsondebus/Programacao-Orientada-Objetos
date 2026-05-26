package Exemplo2;

public class Desenho {
    protected String nomeAutor; 

    public Desenho(String nomeAutor){
        this.nomeAutor = nomeAutor;
    }

    public String getNomeAutor(){
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor){
        this.nomeAutor = nomeAutor; 
    }
}
