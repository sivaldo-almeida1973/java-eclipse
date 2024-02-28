package projetoBanco;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		Conta c1 = new Conta("Mario", 5000);
		Conta c2 = new Conta("Luigi", 1000);
		
		System.out.println("-----Saldo inicial Conta c1-----");
		c1.info();
		System.out.println("---Deposito feito!---");
		c1.depositar(300);
		c1.info();
		c1.sacar(500);
		System.out.println("---Saque feito!---");
		c1.info();
		System.out.println("-----Saldo inicial Conta c2-----");
		c2.info();
		
		System.out.print("Digite um valor /transferência c1 -> c2:");
		System.out.println("");
		double valorTransferir = teclado.nextDouble();
		boolean sucessoLeitura = false;
		
		while(!sucessoLeitura) {

			try {	
				c1.transferir(valorTransferir, c2);
				System.out.println("---Transferencia concluida!---");
				c1.info();
				c2.info();
				sucessoLeitura=true;
			
			} catch (Exception e) {
				System.out.println("---------------------:");
				System.out.println(e.getLocalizedMessage());
				System.out.print("Digite um valor /transferência c1 -> c2:");
				valorTransferir = teclado.nextDouble();
				
			}
			
		}
	}

}
