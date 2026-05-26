public class Produto{

    protected double preco; 

    public Produto(double preco){
        this.preco = preco; 
    }

    public double calcularPrecoFinal(double preco){
        return preco; 
    }

    public double calcularPrecoFinal(double preco, Cliente cliente){
        return preco - (preco * cliente.getDescontoCliente() / 100); 
    }
}