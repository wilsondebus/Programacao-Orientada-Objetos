public class Pessoa {
    
    public void falar(String frase){
        System.out.println("A frase é: "+frase);
    }

    public void falar(String frase, int numeroRepeticoes){
        System.out.println("Repetindo a frase "+numeroRepeticoes+" vezes:");
        for(int i = 0; i < numeroRepeticoes; i++){
             System.out.println(frase);
        }
    }
}
