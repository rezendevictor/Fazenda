package principal;

import java.util.Scanner;

public class Fazenda {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		CriacaoFazenda fazenda = new CriacaoFazenda();
		
		boolean controle = true;
		
		System.out.println("Ola, esse é um programa de Fazenda");
		
		while(controle) {
			try {
			System.out.printf("Voce tem duas opcoes de teste: \n"
				+ "1 - Voce ṕode entrar todos os dados manualmente para cada animal que voce quiser.\n"
				+ "2 - Voce pode rodar uma automacao ja pronta qe gera aleatoriamente os animais e os inclui e depois imprime."
				+ "Digite a opcao desejada: \n");
			int menu = in.nextInt();
		
			switch(menu){
			case 1:
				fazenda.criacao();
				controle = false;
				break;
			case 2:
				fazenda.auto();
				controle = false;
				break;
			default:
				System.out.println("Voce digitou um numero invalido.");
				break;
		
			}
			}catch(Exception e) {
				System.out.println("Parece que voce digitou um simbolo invalido! Voce Sera redirecionado ao menu principal.");
			}
		}
		System.out.println("\nAqui esta a sua fazenda:");
		fazenda.show_fazenda();
		
	}

}
