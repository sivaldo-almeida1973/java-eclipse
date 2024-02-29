package ex1;

public abstract class Computador {
	int gbMemoria;
	int numProcessadores;
		
	//const
	public Computador(int gbMemoria, int numProcessadores) {
		super();
		this.gbMemoria = gbMemoria;
		this.numProcessadores = numProcessadores;
	}


	//metodo abstrato(obriga as classes filhas terem o mesmo)
	abstract double calculaValor();
		
	
	
	
	
	

}
