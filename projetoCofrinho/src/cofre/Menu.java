package cofre;

import java.util.Scanner;

public class Menu {
	
	private Scanner teclado;
	private Cofrinho cofrinho;//atributos
	
	public Menu() {
		teclado = new Scanner(System.in);
		cofrinho = new Cofrinho();//instancia de cofrino
		
	}
	//metodo------------------------------
	public void exibirMenuPrincipal() {
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		System.out.println("======Cofrinho======");
		System.out.println("1-Adicionar: ");//---
		System.out.println("2- Remover: ");
		System.out.println("3-Listar: ");
		System.out.println("4-Total Convertido: ");
		System.out.println("0-Encerrar: ");
	
		String opcaoSelecionada = teclado.next();
		
		switch(opcaoSelecionada) {
		case "0":
			System.out.println("Finalizando programa..");
			break;
		case "1"://escolher moeda
			System.out.println("Escolha Moeda:");
			System.out.println("1 - Real:");
			System.out.println("2 - Dolar:");
			System.out.println("3 - Euro:");
			
			int opcaoMoeda = teclado.nextInt();//onde vai guardar moeda
			System.out.println("Digite um valor:");
			String valorTextualMoeda = teclado.next();
			valorTextualMoeda = valorTextualMoeda.replace(",", ".");//trocar 
			
			System.out.println("O valor da moeda é:" + valorTextualMoeda);
			
			
			exibirMenuPrincipal();//recursão(chamar metodo dentro dele mesmo
			break;
		default:
			System.out.println("Opção Invalida!");
			exibirMenuPrincipal();
			break;
			
		}
			
	}
		
}


