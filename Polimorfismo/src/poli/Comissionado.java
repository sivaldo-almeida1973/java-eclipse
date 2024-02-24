package poli;

public class Comissionado extends Funcionarios {
	float vendas;
	float comissao;
	
	public Comissionado(String nome, float vendas, float comissao) {
		super(nome);
		this.vendas = vendas;
		this.comissao = comissao;
	}
	
	public float pagamento() {
		return vendas*comissao;
	}
	
	

}
