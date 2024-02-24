package empresa;

import java.util.Scanner;

public class Circulo extends FormaGeometrica{
	
	

	public void calculaArea() {
		
		System.out.println("Digite o valor do raio :");
		Scanner teclado = new Scanner(System.in);
		raio = teclado.nextFloat();
	    area = teclado.nextFloat();


	    area  = PI* (raio*raio);

	    System.out.print("O valor da area é " + area);  
	    System.out.print(area);
	    teclado.close();
	}

}
