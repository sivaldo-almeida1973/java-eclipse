package exercicios2;

public class IngressoVip extends Ingresso {
	
	public double adicional;
	
	//const
	public IngressoVip(String nomeEvento, double valor, double adicional) {
		super(nomeEvento, valor);
		this.adicional = adicional;
		
	}

	@Override
	public void info() {
		super.info();
		System.out.println("valor Adiconal: " + adicional);
		System.out.println("Total do ingresso Vip: " + (valor +adicional));
		
	}

	
	
	

}
