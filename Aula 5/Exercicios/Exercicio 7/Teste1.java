/*
ArithmeticException → divisão por zero
NullPointerException → variável nula
ArrayIndexOutOfBoundsException → índice inválido
NumberFormatException → erro ao converter número
InputMismatchException → tipo errado no Scanner
IOException → erro de entrada/saída
*/


import java.util.Scanner;

public class Teste1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();

            int resultado = 10 / num;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero!");
        }

        sc.close();
    }
}