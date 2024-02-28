package projetoBanco;

import javax.management.RuntimeErrorException;

public class Conta {
	String nome;
	double saldo;
	
	public Conta(String nome, double saldo) {
		super();
		this.nome = nome;
		this.saldo = saldo;
	}
	//não vai retornar nenhum valor, mas recebe parametro
	void depositar(double valor) {
		if(valor <= 0 ) {
			throw new RuntimeException("Valor inválido");
		}
		saldo += valor;
	}
	//não vai retornar nenhum valor, mas recebe parametro
	void sacar(double valor) {
		if(valor > saldo) {
			throw new RuntimeException("Saldo insuficiente");
		}
		if(valor <= 0 ) {
			throw new RuntimeException("Valor inválido");
		}
		saldo -= valor;
	}
	//sacar do c1(sacar) e depositar c2(destino)
	void transferir(double valor, Conta destino) {
		this.sacar(valor);
		destino.depositar(valor);
	}
	
	
	
	
	void info() {
		
		System.out.println("Nome:" + nome);
		System.out.println("Saldo:" + saldo);
		System.out.println("----------");
	}
	

}
