public class Teste2 {
    public static void main(String[] args) {

        int[] numeros = {10, 20, 30};

        try {
            System.out.println(numeros[5]); // erro

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: posição inválida no vetor!");
        }
    }
}