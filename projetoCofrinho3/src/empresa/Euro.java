package empresa;

public class Euro extends Moeda{

	public Euro(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("Euro: " + valor);
		
	}


	@Override
	public double converter() {
		return this.valor*5.40;
		
	}
	
	@Override
	public String toString() {
		return "Euro [valor=" + valor + ", converter()=" + converter() + "]";
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
