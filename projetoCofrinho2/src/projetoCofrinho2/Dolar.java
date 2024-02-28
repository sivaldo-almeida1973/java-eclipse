package projetoCofrinho2;

public class Dolar extends Moedas {
	public Dolar(double valor, double dolar) {
		super(valor);
		this.dolar = dolar;
	}

	double dolar;

	@Override
	public void info() {
		System.out.println("Dolar: " + dolar);
		
	}

	@Override
	public double converter() {
		dolar = dolar * 4.91;
		return dolar;
	}

	
	

}
