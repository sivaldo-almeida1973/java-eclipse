package empresa;

public class Carro implements Imprimivel {
	String marca;
	String cor;
	int porta;
	
	//const
	public Carro(String marca, String cor, int porta) {
		super();
		this.marca = marca;
		this.cor = cor;
		this.porta = porta;
	}

	@Override
	public void imprimir() {
		System.out.println("Carro!");
		System.out.println("Marca" + marca);
		System.out.println("Cor:" + cor);
		System.out.println("Porta:" + porta);
		System.out.println("-------------");
		
	}
	
	

}
