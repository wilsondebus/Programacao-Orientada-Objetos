package Exer2;

public abstract class Veiculo {

    protected String marca;
    protected String modelo;
    protected int ano; 

    abstract void digitarInformacoes(); 
    abstract void acelerar();
    abstract void freiar();

}