package ex1;

public class NotBook extends Computador {
     //atributo
	int polegadasTela;
		
	//const
	public NotBook(int gbMemoria, int numProcessadores, int polegadasTela) {
		super(gbMemoria, numProcessadores);
		this.polegadasTela = polegadasTela;
	}



	@Override //calcular valor do NotBook
	double calculaValor() {
		double total = 250 * gbMemoria + numProcessadores * 500 + polegadasTela * 100;
		return total;
	}

}
