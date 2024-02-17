package contas;

public class Conta {
	//atributos
	private String cliente;
	//criar metodos publico para acessar a var cliente(encapsulamento)
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	private double saldo;
	//criar metodos publico para acessar a var cliente(encapsulamento)
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//construtor(tem que ter mesmo nome da classe)
	public Conta() {
		System.out.println("Agencia 0261");		
	}
	
	//metodos(funcao)sem parametro
	
	protected void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);
	}
	
	//metodo com parametros
	void sacar(double valor) {
		saldo -= valor;
		System.out.println("Débito: R$ " + valor);
		
	}
	
	//metodo com parametros
	void depositar(double valor) {
		saldo += valor;
		System.out.println("Crédito: R$ " + valor);		
	}
	//metodo com objeto
	void tranferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transferencia: R$ " + valor);
	}
	
	//metodo com retorno não usa (void)
	double soma(double cc1, double cc2) {
		double total = cc1 + cc2;
		return total;
		
	}
	
	    
		
		
}
