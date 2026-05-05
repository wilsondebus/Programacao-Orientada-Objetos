public class Figura {
    
    protected String cor; 
    protected String preenchido;


    public Figura(String cor, String preenchido) {
        this.cor = cor;
        this.preenchido = preenchido;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getPreenchido() {
        return preenchido;
    }
    public void setPreenchido(String preenchido) {
        this.preenchido = preenchido;
    } 

    
}
