package Trabalho;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArquivoVeiculo {

    private FileWriter arqw;
    private BufferedWriter escritor;
    private FileReader arqr;
    private BufferedReader leitor;
    private List<Veiculo> listaVeiculos;
    public String nomeArquivo;

    // Recebe o nome do arquivo que será usado
    public ArquivoVeiculo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.listaVeiculos = new ArrayList<>();
    }

    // Grava a lista completa de veículos no arquivo
    public void gravaListaArquivo(List<Veiculo> lista) {
        try {
            // O false faz o arquivo ser reescrito com os dados atualizados
            arqw = new FileWriter(nomeArquivo + ".txt", false);
            escritor = new BufferedWriter(arqw);

            for (Veiculo v : lista) {
                escritor.write(v.getPlaca() + "," + v.getModelo() + "," + v.getMarca() + "," + v.getAnoFabricacao() + "," + v.getQuilometragem());
                escritor.newLine();
            }

            escritor.close();
            arqw.close();

            System.out.println("Arquivo atualizado com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Lê o arquivo e retorna uma lista de veículos
    public List<Veiculo> leArquivo() {
        listaVeiculos = new ArrayList<>();

        try {
            File arquivo = new File(nomeArquivo + ".txt");

            // Se o arquivo ainda não existe, retorna a lista vazia
            if (!arquivo.exists()) {
                return listaVeiculos;
            }

            arqr = new FileReader(nomeArquivo + ".txt");
            leitor = new BufferedReader(arqr);

            String linha;

            while ((linha = leitor.readLine()) != null) {
                String[] campos = linha.split(",");

                String placa = campos[0];
                String modelo = campos[1];
                String marca = campos[2];
                int anoFabricacao = Integer.parseInt(campos[3]);
                double quilometragem = Double.parseDouble(campos[4]);

                // Cria o objeto com os dados lidos do arquivo
                Veiculo veiculo = new Veiculo(placa, modelo, marca, anoFabricacao, quilometragem);
                listaVeiculos.add(veiculo);
            }

            leitor.close();
            arqr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaVeiculos;
    }
}
