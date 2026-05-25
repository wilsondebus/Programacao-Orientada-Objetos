public class Computador{

    protected String marca;
    protected String modelo;

    public Computador(String marca){
        this.marca = marca;
        this.modelo = "Portátil";
    }

    public void exibeModelo(){
        System.out.println("Modelo do Computador: "+modelo);
    }
    
}