package poli;

public class Assalariado extends Funcionarios{
	float salario;

	public Assalariado(String nome, float salario) {
		super(nome);
		this.salario = salario;
	}
	
	public float pagamento() {
		return salario;
	}

}
