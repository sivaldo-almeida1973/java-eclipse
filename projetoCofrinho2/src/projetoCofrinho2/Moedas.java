package projetoCofrinho2;

public abstract class Moedas {
	double valor;
	
	public Moedas(double valor) {
		this.valor = valor;
	}
	
	public abstract void info();
	public abstract double converter();
	
	

}
