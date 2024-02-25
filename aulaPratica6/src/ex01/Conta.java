package ex01;

public class Conta {
	String nome;
	double saldo;
	
	//construct
	public Conta(String nome, double saldo) {
		super();
		this.nome = nome;
		this.saldo = saldo;
	}
	
	//metodos(funcao)---------------------------------
	void depositar(double valor) {
		if(valor > saldo) {
			throw new RuntimeException("Saldo Insuficiente!");
		}
		if(valor <= 0) {
			throw new RuntimeException("Valor Inválido");
		}
		saldo += valor;
	}
	
	//metodo sacar------------------------------------
	void sacar(double valor) {
		
		if(valor > saldo) {
			throw new RuntimeException("Saldo Insuficiente!");
		}
		if(valor <= 0) {
			throw new RuntimeException("Valor Inválido");
		}
		saldo -= valor;
	}
	
	//metodo transfrir
	void transferir(double valor, Conta destino) {
		this.sacar(valor);
		destino.depositar(valor);
		
	}
	
	// imprimir informacoes
	void info() {
		System.out.println("-------------------");
		System.out.println("Nome: " + nome);
		System.out.println("Saldo: " + saldo);
	}
	
	

}
