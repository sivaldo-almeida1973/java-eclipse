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
		return this.valor*4.91;
				
	}
	
	//complemento de remover
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		//cast
		Dolar objetodeDolar = (Dolar) objeto;
		
		if (this.valor != objetodeDolar.valor) {
			return false;
		}
		return true;//igual
	}

}
