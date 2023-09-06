package uninter;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Instanciando classe scanner para leitura de dados informados
		Scanner teclado = new Scanner(System.in);
		//Instanciando a classe cofrinho
		Cofrinho meuCofrinho = new Cofrinho();	
		
		//estrutura while para repetir o bloco de instrução
		while(true) {
			System.out.println("BEM-VINDO AO COFRINHO:");
			System.out.println("Escolha uma das opçoes: ");
			System.out.println("1 - Adicionar Moeda");
			System.out.println("2 - Remover Moeda");
			System.out.println("3 - Listar Moedas");
			System.out.println("4 - Calcular Total Convertido para Real");
			System.out.println("5 - Encerrar");
				
			int opcao;
			opcao = teclado.nextInt();
			
			//estrutura while para repetir o bloco de instrução
			while(opcao !=0 ) {
				//estrutura de decisão switch case para substituir vários ifs
				switch (opcao) {					
				case 1: 		
					int tipoMoeda = 0;
					while(tipoMoeda > 3 || tipoMoeda <= 0) {
						System.out.println("Escolha a sua moeda:");
						System.out.println("1 - Real");
						System.out.println("2 - Dólar");
						System.out.println("3 - Euro");
						tipoMoeda =  teclado.nextInt();
					}
					System.out.println("Digite o valor: ");
					double valorAdicionar = teclado.nextDouble();
					
					Moeda moeda = null;
					if(tipoMoeda == 1) {
						moeda = new Real(valorAdicionar);
						meuCofrinho.adicionar(moeda); // adicionando real
						opcao = 0;
					}
					else if(tipoMoeda == 2) {
						moeda = new Dolar(valorAdicionar);
						meuCofrinho.adicionar(moeda); // adicionando dólar
						opcao = 0;
					}
					else if(tipoMoeda == 3) {
						moeda = new Euro(valorAdicionar);
						meuCofrinho.adicionar(moeda); // adicionando euro
						opcao = 0;
					}
					else {
						System.out.println("Opção inválida!");
					}
					break;
					
				case 2:
					int tipoMoedaRemover = 0;
					while(tipoMoedaRemover > 3 || tipoMoedaRemover <= 0) {
						System.out.println("Escolha a moeda para remover:");
						System.out.println("1 - Real");
						System.out.println("2 - Dólar");
						System.out.println("3 - Euro");
						tipoMoedaRemover =  teclado.nextInt();
					}
					System.out.println("Digite o valor: ");
					double valorRemover = teclado.nextDouble();				
					
					if(tipoMoedaRemover == 1) {
						meuCofrinho.remover(valorRemover); //removendo real
						opcao = 0;
					}
					else if(tipoMoedaRemover == 2) {
						meuCofrinho.remover(valorRemover); //removendo dólar
						opcao = 0;
					}
					else if(tipoMoedaRemover == 3) {
						meuCofrinho.remover(valorRemover); //removendo euro
						opcao = 0;
					}
					else {
						System.out.println("Opção inválida!");
					}
					break;
					
				case 3:
					System.out.println("Listar Moedas:");
					meuCofrinho.listagemMoedas(); //chamando método da listagem das moedas
					break;
						
				case 4:
					meuCofrinho.totalConvertido(); // chamando método da conversão das moedas
					break;
				
				case 5:
					System.out.println("Encerrando...");
					teclado.close(); // fechando o objeto scanner
					return;
				default:
					System.out.println("Opção Inválida!");
				}
			break;
		}
	}
}

}
