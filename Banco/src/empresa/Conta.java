package empresa;

public class Conta {
	int numeroConta;
	String titular;
	double saldo;
	double limite;
	
	
	
	public Conta(int numero, String titular, double saldo, double limite) {
		super();
		this.numeroConta = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
	}

	//vai retornar false
	boolean sacar(double valor) {
		if(valor>limite || valor > saldo || valor <= 0) {
			return false;
		}
		saldo -= valor;  //saldo = saldo - valor sacado;
		return true;
	}
	
	boolean deposito(double valor) {
		if(valor <= 0) {
			return false;
		}
		saldo += valor;
		return true;
	}
	
	boolean transferir(double valor) {
		if(valor <= 0) {
			return false;
		}
		saldo += valor;
		return true;
	}
	
	
	
	
	void info() {
		System.out.println("Numero Conta: " + numeroConta);
		System.out.println("Titular: " + titular);
		System.out.println("Saldo: " + saldo);
		System.out.println("Limite: " + limite);
	}

}
