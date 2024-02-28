package projetoCofrinho2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// 
		Scanner teclado = new Scanner(System.in);
		int opcao;
		System.out.println("--------Cofrinho----------");
		System.out.println("1-Adicionar Moeda");
		System.out.println("2-Remover Moeda");
		System.out.println("3-Lista Moeda");
		System.out.println("4-Calcular Moeda");
		System.out.println("0-Finalizar Programa!");
		opcao = teclado.nextInt();
		double tipoMoeda;
		double moeda;
		
		while(opcao != 0) {
			switch(opcao) {
				case 1:
					tipoMoeda=0;
					while(tipoMoeda > 3 || tipoMoeda <= 0) {
						System.out.println("Escolha a moeda!");
						System.out.println("1-Dolar!");
						System.out.println("2-Euro!");
						System.out.println("3-Real!");
						tipoMoeda = teclado.nextDouble();
					}
					System.out.println("Digite o valor?");
					moeda = teclado.nextDouble();
					break;
				case 2:
					tipoMoeda=0;
					while(tipoMoeda > 3 || tipoMoeda <= 0) {
						System.out.println("Escolha a moeda para remover!");
						System.out.println("1-Dolar");
						System.out.println("1-Euro");
						System.out.println("1-Real");
						tipoMoeda = teclado.nextDouble();
					}
					System.out.println("Digite o valor!");
					moeda = teclado.nextDouble();
					break;	
				case 3:
					System.out.println("Listar moedas adicionadas");
					moeda = teclado.nextDouble();
					break;
				case 4:
					System.out.println("Converter valores");
					break;
				default:
					System.out.println("Opação inválida!");
			
			}
			System.out.println("--------Cofrinho----------");
			System.out.println("1-Adicionar Moeda");
			System.out.println("2-Remover Moeda");
			System.out.println("3-Lista Moeda");
			System.out.println("4-Calcular Moeda");
			System.out.println("0-Finalizar Programa!");
			opcao = teclado.nextInt();
		}

	}

}
