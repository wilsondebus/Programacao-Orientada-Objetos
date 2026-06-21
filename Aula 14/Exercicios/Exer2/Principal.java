package Exer2;

public class Principal {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro(); 
 
        carro1.digitarInformacoes();
        carro1.acelerar();
        carro1.freiar();

        Moto moto1 = new Moto();

        moto1.digitarInformacoes();
        moto1.acelerar();
        moto1.freiar();
    }
}
