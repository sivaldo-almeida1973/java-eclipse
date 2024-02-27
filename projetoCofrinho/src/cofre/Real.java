package cofre;

public class Real extends Moeda{
    //filha de uma classe abstrata, não precisa repetir atributos
	
	
	
	public Real(double valor) {
		this.valor = valor;
	}

	@Override
	public void info() {
		System.out.println("Real: " + valor);
		
		
	}

	@Override
	public double converter() {
		return this.valor;
				
	}
	
	
	
}
