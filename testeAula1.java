package pkg;

import java.util.Scanner; //import para o scanner 

public class projeto {

	public static void main(String[] args) {
		System.out.print("Ola Mundo! \n");
		//println quebra a linha automaticamente, sem precisar do \n 
		
		int idade;
		idade = 18; 
		
		//mostrar idade 
		System.out.println("Eu tenho "+idade+" anos"); 
		//enves do %i usa-se o + para mostrar a variavel no meio de uma frase 
		//Sysout + ctrl space enter 
		
		//testando variaveis 
		char c = 'r'; 
		System.out.println("O char: "+c); 
		
		float f = 3.5f; //tem que declarar que é float no final se não ele declara um double 
		System.out.println("Valor do float: "+f); 
		
		double d = 3.333333; 
		System.out.println("Valor do double: "+d); 
		
		//adicionar final antes de uma variavel deixa a variavel sem poder ser alterada. ex: final double 
		
		String nome; 
		Scanner teclado = new Scanner(System.in);  //precisa importar um biblioteca para ler a variavel 
		System.out.println("Digite o nome: ");
		nome = teclado.nextLine(); //faz o papel do scanf 
		System.out.println("O nome diigtado é "+nome); 
		
		//Ler um inteiro 
		/*int num;
		System.out.println("Digite um numero inteiro: "); 
		num = teclado.nextInt(); 
		System.out.println("O numero digitado é: "+num); 
		
		//Ler um float 
		float numF; 
		System.out.println("Digite um float: ");
		numF = teclado.nextFloat(); 
		System.out.println("O float digitado é: "+numF); 
		
		//ler um double
		double numD; 
		System.out.println("Digite um double: ");
		numD = teclado.nextDouble();
		System.out.println("O double digitado é: "+numD); */
		
		int idadeNova;
		System.out.println("Digite sua nova idade: ");
		idadeNova = teclado.nextInt(); 
		System.out.println("A sua idade é: "+idadeNova); 
		
		if(idadeNova >= 18) {
			System.out.println("Voce é maior de idade."); 
		}
		else {
			System.out.println("Voce é menor de idade"); 
		}
		
		int opcao ;
		System.out.println("Digite uma opção");
		System.out.println("Digite 1 para cadastrar: ");
		System.out.println("Digite 2 para consultar");
		System.out.println("Digite 3 para sair");
		
		opcao = teclado.nextInt(); 
		switch(opcao) {
		case 1: 
			System.out.println("Aqui vou cadastrar...");
			break;
		
		case 2: 
			System.out.println("Aqui vou consultar...");
			break; 
			
		case 3:
			System.out.println("Aqui vou sair...");
			break; 
			
		default:
			System.out.println("Digite uma operação valida");
		}
		
		
		
	}

}
