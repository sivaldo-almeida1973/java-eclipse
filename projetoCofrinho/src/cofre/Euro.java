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
		return this.valor*5.40;
				
	}
	
	//complemento de remover
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		//cast
		Euro objetodeEuro = (Euro) objeto;
		
		if (this.valor != objetodeEuro.valor) {
			return false;
		}
		return true;//igual
	}

}
