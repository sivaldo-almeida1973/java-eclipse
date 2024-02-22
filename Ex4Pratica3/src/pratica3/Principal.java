package pratica3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cofrinho c = new Cofrinho();
		
		//adicionar moeda
		c.add(new Moeda("Euro", 0.5));
		c.add(new Moeda("Euro", 1));
		c.add(new Moeda("Euro", 2));
		c.add(new Moeda("Euro", 0.05));
		
		
		System.out.printf("O total do cofrinho é: %.2f \n ", c.calcularTotal());

	}

}
