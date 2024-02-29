package empresa;

public class Dolar extends Moeda{

	public Dolar(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	void info() {
		System.out.println("Dolar: " + valor);
		
	}

	@Override
	double converter() {
		return this.valor*4.91;
		
	}
	
	@Override
	public String toString() {
		return "Dolar [valor=" + valor + ", converter()=" + converter() + "]";
	}


	@Override
	public int hashCode() {
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	

}
