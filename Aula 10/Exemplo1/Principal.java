public class Principal {
    public static void main(String[] args) {
        
        Carro c1 = new Carro(); 
        c1.nome = "Fusca";
        c1.exibrMensagem();

        System.out.println();

        Onibus o1 = new Onibus();
        o1.nome = "Marcopolo";
        o1.setModelo("OM-1519"); 
        o1.exibirMensagem();
    }
}
