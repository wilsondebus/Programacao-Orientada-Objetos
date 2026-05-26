public class Carro{

    protected String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibrMensagem(){
        System.out.println("Estou dentro da classe Carro");
        System.out.println("O carro é "+nome);
    }

    }
