package Empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int idade = 10;
		String nome = "Mario";
		
		idade = idade +2;
		double peso = 72.5;
		 
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite idade, peso e nome:");
        idade = teclado.nextInt();
		peso = teclado.nextDouble();
		nome = teclado.next();
		
		System.out.println("Nome: " + nome);
		System.out.printf("Idade: %d\n" , idade);
		System.out.printf("Peso: %.2f\n",peso);
		
		if(idade< 18) {
		System.out.println("Acesso bloqueado");
		System.out.println("Acesso bloqueado");
		
		}
		else if (idade < 65) {
			System.out.println("Adulto");
		}
		else {
			System.out.println("Adulto idoso");
		}
		for(int i=0;i<10; i++) {
            System.out.println("Valor: " + i);
		}
         //array
		//lista
		//Arraylist
		int megaSena [] = {11,14,21,30,37,56};
		int numeros[] = new int[200];
		
		numeros [60]= 50;
		megaSena[0]= 10;
	}
}		
		