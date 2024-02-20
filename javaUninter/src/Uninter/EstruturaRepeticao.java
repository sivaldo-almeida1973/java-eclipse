package Uninter;

import java.util.Scanner;

public class EstruturaRepeticao {

	public static void main(String[] args) {
		// 
		int idade;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade = teclado.nextInt();
		
		if(idade < 18) {
			System.out.println("Acesso bloqueado!");
			System.out.println("Menor idade!");
		}else if(idade < 65) {
			System.out.println("Maior idade!");
		}else {
			System.out.println("Terceira idade");
		}
		
		System.out.println("while-------------------");
		while(idade > 0) {
			System.out.println("idade: "+ idade);
			idade--;
			
		}
		System.out.println("For-------------------");
		//for------------------
		for(int i = 0; i < 10; i++) {
			System.out.println("Valor: " + i);
		}

	}

}
