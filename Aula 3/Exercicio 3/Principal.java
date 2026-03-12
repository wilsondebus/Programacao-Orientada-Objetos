public class Principal {
    public static void main(String[]args){

        Pessoa p1 = new Pessoa(); 
        p1.nome = "Wilson";
        p1.idade = 19; 
        p1.genero = "Masculino";

        System.out.println("\t INFORMAÇÕES DA PESSOA: ");
        System.out.println("NOME: "+p1.nome);
        System.out.println("IDADE: "+p1.idade);
        System.out.println("GENERO: "+p1.genero);
    }
}
