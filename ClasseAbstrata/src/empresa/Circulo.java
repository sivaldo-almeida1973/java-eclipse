package empresa;

import java.util.Scanner;

public class Circulo extends FormaGeometrica{
	
	private static final double PI = 3.1416;

	public void calculaArea() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor do raio");
		double lado = teclado.nextDouble();
		area = teclado.nextFloat();
	    area = teclado.nextFloat();


	    area  = PI* (area*area);

	    System.out.print("O valor da area é " + area);  
	    System.out.print(area);
	}

}
