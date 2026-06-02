public class Gato implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("miau");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Classe gato");
    }

    @Override
    public boolean verificarVacinacao() {
        System.out.println("Verificando vacinação do gato");
        return false; 
    }
    
}
