package empresa;

public class Real extends Moeda{

	public Real(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	void info() {
		System.out.println("Real: " + valor);
		
	}

	@Override
	double converter() {
		return this.valor;
		
	}

	@Override
	public String toString() {
		return "Real [valor=" + valor + ", converter()=" + converter() + "]";
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
