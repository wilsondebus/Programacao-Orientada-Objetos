package Trabalho;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("===== CADASTRO DE VEÍCULO - CLIENTE =====");

            System.out.print("Digite a placa: ");
            String placa = teclado.nextLine();

            System.out.print("Digite o modelo: ");
            String modelo = teclado.nextLine();

            System.out.print("Digite a marca: ");
            String marca = teclado.nextLine();

            System.out.print("Digite o ano de fabricação: ");
            int anoFabricacao = teclado.nextInt();

            System.out.print("Digite a quilometragem: ");
            double quilometragem = teclado.nextDouble();
            teclado.nextLine();

            // Cria o objeto veículo no cliente
            Veiculo veiculo = new Veiculo(placa, modelo, marca, anoFabricacao, quilometragem);

            // Conecta no servidor local pela porta 12345
            Socket socket = new Socket("localhost", 12345);

            // Envia o objeto para o servidor
            ObjectOutputStream saida = new ObjectOutputStream(socket.getOutputStream());
            saida.writeObject(veiculo);

            // Recebe a resposta do servidor
            ObjectInputStream entrada = new ObjectInputStream(socket.getInputStream());
            String resposta = (String) entrada.readObject();

            System.out.println("Resposta do servidor: " + resposta);

            entrada.close();
            saida.close();
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        teclado.close();
    }
}
