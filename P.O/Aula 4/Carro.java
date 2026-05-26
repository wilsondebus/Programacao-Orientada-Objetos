public class Carro {

    public String marca;
    public String modelo;

    public Carro(String marcaCarro, String modeloCarro){
        System.out.println("Estou no construtor");
        marca = marcaCarro; 
        modelo = modeloCarro; 
    }

    public Carro(String marca){
        System.out.println("Estou no outro construtor");
        this.marca = marca;     //quando os nomes são iguais usa-se o this
    }

    public void alugar(String marca, String modelo){
        System.out.println("O carro "+marca+" - "+modelo+" foi alugado");
    }

    public void devolver(String marca, String modelo){
        System.out.println("O carro "+marca+" - "+modelo+" foi devolvido");
    }

    public void exibirCarros(String marca, String modelo){
        System.out.println("MARCA: "+marca);
        System.out.println("MODELO: "+modelo);
    }

}
