package pratica3;

public class Curso {
	String nome;
	double mensalidade;
	
	//construtor
	public Curso(String nome, double mensalidade) {
		super();
		this.nome = nome;
		this.mensalidade = mensalidade;
	}


    //mostra as informacoes(metodo ou funcao)
	void info() {
		System.out.println("Nome Curso: " + nome);
		System.out.println("Menaslidade Curso: " + mensalidade);
	}

}
