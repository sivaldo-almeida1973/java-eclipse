package cofre;

import java.util.Scanner;

public class Menu {
	
	private Scanner teclado;
	private Cofrinho cofrinho;//atributos
	
	//metodo construtor
	public Menu() {
		teclado = new Scanner(System.in);
		cofrinho = new Cofrinho();//instancia de cofrino
		
	}
	//metodo para exibir menu------------------------------
	public void exibirMenuPrincipal() {
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		System.out.println("======Cofrinho======");
		System.out.println("Escolha uma Opção!");
		System.out.println("1-Adicionar: ");//---
		System.out.println("2- Remover: ");
		System.out.println("3-Listar: ");
		System.out.println("4-Total Convertido: ");
		System.out.println("0-Encerrar: ");
		System.out.print("Digite:");
		String opcaoSelecionada = teclado.next();//variavel para guarda opcao
        System.out.println("Opcao Selecionada: " +opcaoSelecionada);
        System.out.println(" ");
		
		switch(opcaoSelecionada) {
		case "0":
			System.out.println("Finalizando programa..");
			break;
		case "1"://escolher moeda
			System.out.println("Escolha Moeda:");
			System.out.println("1 - Real:");
			System.out.println("2 - Dolar:");
			System.out.println("3 - Euro:");
			System.out.print("Digite:");
			
			int opcaoMoeda = teclado.nextInt();//onde vai guardar moeda
			System.out.print("Digite um valor:");
			String valorTextualMoeda = teclado.next();//String guarda escolha
			valorTextualMoeda = valorTextualMoeda.replace(",", ".");//trocar (,/.)
			double valorMoeda = Double.parseDouble(valorTextualMoeda);//converter /double
			
			//escolher tipo de moeda
			Moeda moeda = null;
			if (opcaoMoeda == 1) {
				moeda = new Real(valorMoeda);
				
				
			}else if(opcaoMoeda == 2) {
				moeda = new Dolar(valorMoeda);
				
			}else if(opcaoMoeda == 3) {
				moeda = new Euro(valorMoeda);
				
			}else {
				System.out.println("Moeda Inválida!");
				exibirMenuPrincipal();//menu 
			}
			cofrinho.adicionar(moeda);//adicionar moeda no cofrinho
			
			System.out.println("Valor da moeda depositado R$:" + valorTextualMoeda);
			System.out.println(" ");//espaço
			
			exibirMenuPrincipal();//recursão(chamar metodo dentro dele mesmo)
			break;
			//----------------------Exibir lista de moedas----------------------------------------------------
		case "3":
			cofrinho.listagemMoedas();
			exibirMenuPrincipal();//recursão(chamar metodo dentro dele mesmo)
			break;
	
		default:
			System.out.println("Opção Invalida!");
			exibirMenuPrincipal();
			break;
			
		}
			
	}
		
}


