package cofre;

public abstract class Moeda {//não pode ser instanciada(mae)
	//filhas terao acesso(protectd)
	protected double valor;
	
	//metodos
    public abstract void info();
	public abstract double converter();
		
	

}
