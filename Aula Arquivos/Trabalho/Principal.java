package Trabalho;

/*
Atividade de arquivos

Utilizando Java, manipulação de arquivos e orientação a objetos,
desenvolva um sistema de cadastro de veículos.

O sistema deverá exibir um menu em laço infinito com as opções:
1 - Cadastrar veículo
2 - Alterar quilometragem do veículo
3 - Excluir veículo pelo número da placa
4 - Sair do sistema

A manipulação deve ser feita através de objetos da classe Veiculo
e de uma lista de veículos.

Antes de gravar os dados no arquivo, o veículo deve ser instanciado
como objeto, adicionado à lista e a lista deve ser atualizada no arquivo.
*/

import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArquivoVeiculo arquivo = new ArquivoVeiculo("veiculos");

        // Carrega os veículos que já estão no arquivo
        List<Veiculo> listaVeiculos = arquivo.leArquivo();

        int opcao = 0;

        // Menu principal do sistema
        while (opcao != 4) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Alterar quilometragem do veículo");
            System.out.println("3 - Excluir veículo pelo número da placa");
            System.out.println("4 - Sair do sistema");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine();

            if (opcao == 1) {
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

                // Instancia o veículo antes de salvar
                Veiculo veiculo = new Veiculo(placa, modelo, marca, anoFabricacao, quilometragem);

                // Adiciona na lista e atualiza o arquivo
                listaVeiculos.add(veiculo);
                arquivo.gravaListaArquivo(listaVeiculos);

                System.out.println("Veículo cadastrado com sucesso!");

            } else if (opcao == 2) {
                System.out.print("Digite a placa do veículo: ");
                String placa = teclado.nextLine();

                boolean encontrou = false;

                // Procura o veículo pela placa
                for (Veiculo v : listaVeiculos) {
                    if (v.getPlaca().equalsIgnoreCase(placa)) {
                        System.out.print("Digite a nova quilometragem: ");
                        double novaQuilometragem = teclado.nextDouble();
                        teclado.nextLine();

                        // Atualiza apenas a quilometragem
                        v.setQuilometragem(novaQuilometragem);
                        encontrou = true;
                    }
                }

                if (encontrou) {
                    arquivo.gravaListaArquivo(listaVeiculos);
                    System.out.println("Quilometragem alterada com sucesso!");
                } else {
                    System.out.println("Veículo não encontrado!");
                }

            } else if (opcao == 3) {
                System.out.print("Digite a placa do veículo que deseja excluir: ");
                String placa = teclado.nextLine();

                Veiculo veiculoRemover = null;

                // Procura o veículo que será removido
                for (Veiculo v : listaVeiculos) {
                    if (v.getPlaca().equalsIgnoreCase(placa)) {
                        veiculoRemover = v;
                    }
                }

                if (veiculoRemover != null) {
                    listaVeiculos.remove(veiculoRemover);
                    arquivo.gravaListaArquivo(listaVeiculos);
                    System.out.println("Veículo excluído com sucesso!");
                } else {
                    System.out.println("Veículo não encontrado!");
                }

            } else if (opcao == 4) {
                System.out.println("Saindo do sistema...");

            } else {
                System.out.println("Opção inválida!");
            }
        }

        teclado.close();
    }
}
