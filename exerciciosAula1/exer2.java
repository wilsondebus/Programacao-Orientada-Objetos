import java.util.Scanner;

public class exer2 {
    public static void main(String[]args){
    float precoCombustivel = 4.90f; 
    //leitura
    float marcacaoOdometroInicial, marcacaoOdometroFinal, numeroLitrosGastos, valorRecebido; 
    //calcular 
    float quilometragemTotal, media, lucroLiquido;

    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite a marcação do odômetro inicial: "); 
    marcacaoOdometroInicial = teclado.nextFloat(); 
    System.out.println("Digite a marcação do odôpometro final: "); 
    marcacaoOdometroFinal = teclado.nextFloat(); 
    System.out.println("Digite o número de litros gastos: "); 
    numeroLitrosGastos = teclado.nextFloat(); 
    System.out.println("Digite o valor recebido pelo taxista: ");
    valorRecebido = teclado.nextFloat(); 

    quilometragemTotal = marcacaoOdometroFinal - marcacaoOdometroInicial; 
    media = quilometragemTotal / numeroLitrosGastos; 
    lucroLiquido = valorRecebido - (numeroLitrosGastos * precoCombustivel); 

    System.out.println("A media do consumo em Km/l é: "+media);
    System.out.println("O lucro líquido do dia foi: "+lucroLiquido);

    teclado.close();
    }

}
