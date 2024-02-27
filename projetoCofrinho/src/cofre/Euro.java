package cofre;

public class Euro extends Moeda {
	
	
	public Euro(double valor) {
		this.valor = valor;
	}

	@Override
	public void info() {
		System.out.println("Euro: " + valor);
		
		
	}

	@Override
	public double converter() {
		
		System.out.println("Covertido para Real:");
		return this.valor*5.40;
				
	}
	

}
