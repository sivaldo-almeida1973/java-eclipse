package ex01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		// criar uma conta
		Conta c1 = new Conta("Mario", 5000);	
		Conta c2 = new Conta("Luigi", 10000);
		c1.info();
		c2.info();
		
		System.out.println("Digite um valor para Transferir c1 -> c2: ");
		double valorTransferir = teclado.nextDouble();
		boolean sucessoLeitura = false;
		
	    while(!sucessoLeitura) {
	    	  try {
	    			
	  			c1.transferir(valorTransferir, c2);
	  			c1.info();
	  			c2.info();
	  			sucessoLeitura=true;
	  		
	  		} catch (Exception e) {
	  			System.out.println("Ocrreu um problema , digite outro valor!");
	  			System.out.println(e.getMessage());
	  			System.out.println("Digite um valor para Transferir c1 -> c2: ");
	  			valorTransferir = teclado.nextDouble();
	  			
	  		}
	  		
	    }

	}

}
