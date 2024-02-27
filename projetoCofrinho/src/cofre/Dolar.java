package cofre;

public class Dolar extends Moeda{
	
	public Dolar(double valor) {
		this.valor = valor;
	}

	@Override
	public void info() {
		System.out.println("Dolar: " + valor);
		
		
	}

	@Override
	public double converter() {
		
		System.out.println("Covertido para Real:");
		return this.valor*4.91;
				
	}

}
