public class Onibus extends Carro{
    
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    } 

    public void exibirMensagem(){
        System.out.println("Estou na classe Onibus");
        System.out.println("O onibus é "+nome);
        System.out.println("O modelo é "+modelo);
    }

}
