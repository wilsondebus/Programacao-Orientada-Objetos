public abstract class Animal{

    protected String especie;
    protected int idade; 

    public abstract void emiteSom();

    public void mostrarNaTela() {System.out.println("Especie: "+especie);
        System.out.println("Idade: "+idade);
        
    }

}
    