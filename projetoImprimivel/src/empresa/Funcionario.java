package empresa;

public class Funcionario implements Imprimivel{
	String nome;
	String cpf;
	
	
	//const
	public Funcionario(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}



	@Override
	public void imprimir() {
		System.out.println("Funcionario!");
		System.out.println("Nome" + nome);
		System.out.println("CPF" + cpf);
		System.out.println("-------------");
		
	}

}
