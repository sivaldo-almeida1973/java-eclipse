package ex1;

public class DeskTop extends Computador{
	double acessorios;
	
	//const
	public DeskTop(int gbMemoria, int numProcessadores, double acessorios) {
		super(gbMemoria, numProcessadores);
		this.acessorios = acessorios;
	}



	@Override
	double calculaValor() {
		double total = 200 * gbMemoria + numProcessadores * 400 + acessorios;
		return total;
	}

}
