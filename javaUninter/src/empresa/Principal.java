package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 10;
		String nome = "sivaldo";
		idade = idade + 2;
		double peso = 67.9;
		
		//leitura entrada de dados
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		idade = teclado.nextInt();
		System.out.print("Digite seu peso: ");
		peso = teclado.nextDouble();
		System.out.print("Digite seu nome: ");
		nome = teclado.next();
		
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade:" + idade);
		System.out.printf("Idade: %.2f\n", peso);
		
		if(idade < 18) {
			System.out.println("Acesso bloquedo!");
		}else if (idade > 18) {
			System.out.println("Acesso liberado!");
		}else {
			System.out.println("Opção Inválida! ");
		}
		
		
		for(int i = 0;i < 10; i++) {
			System.out.println("Valor de i:" + i);
		}
		
		//array = lista
		//ArrayList
		
		int megaSena[] = {11,12,33,44,55,66,77,88,99};
		int numeros[] = new int[200];
		megaSena[0] = 10;//alterar valor no indice 0
		
		System.out.println(megaSena[0]);
		System.out.println(numeros[3]);
		
		

	}

}
