package pratica3;

public class Moeda {
	
	private String nome;
	private double valor;
	
	
	//const--------------------
	public Moeda(String nome, double valor) {
		super();
		this.valor = valor;
		this.nome = nome;
	}
		
	

	//metodos para poder acessar os private-------------------
	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	

}
