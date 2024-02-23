package exercicios2;

public class Ingresso {
	public String NomeEvento;
	public double valor;
	
	
	//const
	public Ingresso(String nomeEvento, double valor) {
		super();
		NomeEvento = nomeEvento;
		this.valor = valor;
	}



	//metodo
	public void info() {
		System.out.println("Nome Evento: " + NomeEvento);
		System.out.println("Valor Ingresso Comum: " + valor);
	}
	
	
	
	

}
