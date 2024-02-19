package empresa;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		// var
		double peso, altura, imc;
		//entrada de dados
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite seu peso:");
		peso = teclado.nextDouble();
		System.out.print("Digite sua altura:");
		altura = teclado.nextDouble();
		//processamento
		imc = peso /(altura * altura);
		//saida
		System.out.printf("O IMC: %.2f", imc);

	}

}
