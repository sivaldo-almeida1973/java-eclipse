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
		
		
		//array-----------------
		int[] notas = new int[3];
		
		//preecher o array com valores
		notas[0]= 4;
		notas[1]= 6;
		notas[2]= 8;
		
		//for each percorrer
		for(int n : notas) {
			System.out.println("Notas:"+n);
		}
		
		System.out.println("-----------------");
		//pode ser assim tambem
        int[] notas2 = {43,53,63,73};
		
		//preecher o array com valores
		
		//for each percorrer
		for(int n2 : notas2) {
			System.out.println("Notas:"+n2);
		}
		
		// && -E, ||- ou ,!--diferente
		
		if(idade > 10 || idade < 20) {
			System.out.println("Esta no inervalo");
		}
		
		//verdadeiro(true) , falso(false) minusculo
		
		//funções (main) ja é uma funcao
		//void não retorna nada
		
		
		
		
		

	}
	

}
