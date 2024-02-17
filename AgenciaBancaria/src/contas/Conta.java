package contas;

public class Conta {
	//atributos
	protected String cliente;
	protected double saldo;
	
	//construtor(tem que ter mesmo nome da classe)
	public Conta() {
		System.out.println("Agencia 0261");		
	}
	
	//metodos(funcao)
	
	protected void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);
	}
}
