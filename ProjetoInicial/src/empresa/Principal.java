package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int idade = 20;
		String nome = "sivaldo";
		idade = idade + 2;
		double peso = 89.90;
	
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua idade,peso e nome: ");
		idade = teclado.nextInt();
		peso = teclado.nextDouble();
		nome = teclado.next();
		
		System.out.println();
		
		
		
		System.out.println("Nome: "+ nome);
		System.out.printf("Idade: %d\n",idade);
		System.out.printf("Peso: %.2f\n",peso);
		
		
		


		
		

	}

}
