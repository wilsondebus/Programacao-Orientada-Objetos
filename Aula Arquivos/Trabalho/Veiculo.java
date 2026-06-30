package Trabalho;

import java.io.Serializable;

public class Veiculo implements Serializable {

    // Atributos privados do veículo
    private String placa;
    private String modelo;
    private String marca;
    private int anoFabricacao;
    private double quilometragem;

    // Construtor usado para criar um veículo
    public Veiculo(String placa, String modelo, String marca, int anoFabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    // Retorna a placa do veículo
    public String getPlaca() {
        return placa;
    }

    // Retorna o modelo do veículo
    public String getModelo() {
        return modelo;
    }

    // Retorna a marca do veículo
    public String getMarca() {
        return marca;
    }

    // Retorna o ano de fabricação
    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    // Retorna a quilometragem
    public double getQuilometragem() {
        return quilometragem;
    }

    // Altera somente a quilometragem
    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }
}
