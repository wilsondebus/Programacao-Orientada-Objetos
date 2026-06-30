package Trabalho;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class Servidor {
    public static void main(String[] args) {

        ArquivoVeiculo arquivo = new ArquivoVeiculo("veiculos");

        try {
            // Cria o servidor na porta 12345
            ServerSocket servidor = new ServerSocket(12345);
            System.out.println("Servidor iniciado. Aguardando cliente...");

            while (true) {
                // Aguarda a conexão do cliente
                Socket cliente = servidor.accept();
                System.out.println("Cliente conectado!");

                // Recebe o objeto Veiculo enviado pelo cliente
                ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
                Veiculo veiculo = (Veiculo) entrada.readObject();

                // Lê a lista atual do arquivo
                List<Veiculo> listaVeiculos = arquivo.leArquivo();

                // Adiciona o veículo recebido e atualiza o arquivo
                listaVeiculos.add(veiculo);
                arquivo.gravaListaArquivo(listaVeiculos);

                // Envia uma resposta para o cliente
                ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
                saida.writeObject("Cadastro efetuado com sucesso!");

                entrada.close();
                saida.close();
                cliente.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
