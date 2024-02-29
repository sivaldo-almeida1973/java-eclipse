package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		//classe cofrinho/obj cofrinho
		Cofrinho cofrinho = new Cofrinho();
		
		System.out.println("---------------MENU---------------");
		System.out.println("1-ADICIONAR MOEDA");
		System.out.println("2-REMOVER MOEDA");
		System.out.println("3-LISTAR MOEDA");
		System.out.println("4-CALCULAR TOTAL CONVERTIDO R$: ");
		System.out.println("0-ENCERRAR PROGRAMA: ");
		System.out.println("Digite: ");
		opcao = teclado.nextInt();
		
		int tipoMoeda;
		while(opcao!=0) {//pra  sair digitar 0
			
			switch(opcao) {
			case 1:
				System.out.println("Escolha um opcao: ");
				tipoMoeda=0;
				while(tipoMoeda > 4 || tipoMoeda <=0) {
					System.out.println("1-Real");
					System.out.println("2-Euro");
					System.out.println("3-Dolar");
					tipoMoeda = teclado.nextInt();		
				}
				
				Moeda moed= null;
				if(tipoMoeda == 1) {
					System.out.println("Valor da moeda?");
					double valor = teclado.nextDouble();
					moed = new Real(valor);
				}
				if(tipoMoeda == 2) {
					System.out.println("Valor da moeda?");
					double valor = teclado.nextDouble();
					moed = new Dolar(valor);
				}
				if(tipoMoeda == 3) {
					System.out.println("Valor da moeda?");
					double valor = teclado.nextDouble();
					moed = new Euro(valor);
				}
				cofrinho.adicionar(moed);		
				break;
				//----------------------------------------------------
			case 2:
				System.out.println("Escolha um opcao: ");
				tipoMoeda=0;
				while(tipoMoeda > 4 || tipoMoeda <=0) {
					System.out.println("1-Real");
					System.out.println("2-Euro");
					System.out.println("3-Dolar");
					tipoMoeda = teclado.nextInt();		
				}
				
				Moeda moed1= null;
				if(tipoMoeda == 1) {
					System.out.println("Valor da moeda?");
					double valor = teclado.nextDouble();
					moed1 = new Real(valor);
				}
				if(tipoMoeda == 2) {
					System.out.println("Valor da moeda?");
					double valor = teclado.nextDouble();
					moed1 = new Dolar(valor);
				}
				if(tipoMoeda == 3) {
					System.out.println("Valor da moeda?");
					double valor = teclado.nextDouble();
					moed1 = new Euro(valor);
				}
				cofrinho.remover(moed1);		
				break;
			case 3:
				cofrinho.listar();
				break;
			case 4:
				double valorTotalConvertido = cofrinho.totalConvertido();
				System.out.println("Valor total convertido R$: " + valorTotalConvertido);
				break;
			default:
				System.out.println("Opção inválida!");		
				
			}
			
			System.out.println("---------------MENU---------------");
			System.out.println("1-ADICIONAR MOEDA");
			System.out.println("2-REMOVER MOEDA");
			System.out.println("3-LISTAR MOEDA");
			System.out.println("4-CALCULAR TOTAL CONVERTIDO R$: ");
			System.out.println("0-ENCERRAR PROGRAMA: ");
			opcao=teclado.nextInt();
			
			
		}	
		System.out.println("finalizando programa....");


	}

}
