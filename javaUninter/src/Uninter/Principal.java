package Uninter;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// var
		System.out.println("Alo mamãe");
		System.out.println("Alo papai");
		int idade;
		//numeros inteiros
		
		float peso;
		//numeros fracionados
		double velocidade;
		//numeros fracionados(ocupa mais espacos que o float na memoria)
		char inicial = 'f';
		//apenas uma letra(char)
		
		boolean maiorIdade = false;
		String nome = "Sivaldo";
		int tamanhoString = nome.length();
		System.out.println("O tamanho da string: " + tamanhoString);
		
		//operações aritiméticas
		//soma
		int resultado;
		resultado = 4+3;
		System.out.println("Soma:" + resultado);
		
		//divisao
		int resultado2 ;
		resultado2 = 4/3;
		System.out.println("Soma:" + resultado2);
		
		double resultado3 ;
	    resultado3 = 4/3d;
		System.out.println("Soma:" + resultado3);
		
		
		//raiz quadrada
		double resultado4;
		resultado4 = Math.pow(2, 3);
		System.out.println("Raiz quadrada:" + resultado4);
		
		//entrada de dados(Scanner é uma classe)
		System.out.println("==================");
		int idade1;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite sua idade:");
		idade1 = teclado.nextInt();
		
		System.out.print("Digite sua altura:");
		double altura;
		altura = teclado.nextDouble();
		
		System.out.print("Digite seu nome:");
		String nome2;
		nome2 = teclado.next();
		
		System.out.println("==================");
		System.out.println("Sua idade :" + idade1 + "anos");
		System.out.println("Sua altura :" + altura + "M");
		System.out.println("Seu nome: :" + nome2);
		
		
		
		
		
		
		
		
		

	}

}
