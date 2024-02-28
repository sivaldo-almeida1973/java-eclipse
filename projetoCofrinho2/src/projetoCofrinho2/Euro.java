package projetoCofrinho2;

public class Euro extends Moedas{
	double euro;
	
	public Euro(double valor, double euro) {
		super(valor);
		this.euro = euro;
	}


	@Override
	public void info() {
		System.out.println("Euro: " + euro);
		
	}

	@Override
	public double converter() {
		euro = euro * 5.35;
		return euro;
	}

	
}
