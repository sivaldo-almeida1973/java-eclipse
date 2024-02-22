package pratica3;

public class Aluno {
	String nome;
	int matricula;
	double desconto;
	Curso curso;//classe Curso e obj curso
	
	//construt
	public Aluno(String nome, int matricula, double desconto, Curso curso) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.desconto = desconto;
		this.curso = curso;
	}
	
	
	//mostrar info (metodo)
	void info() {
		System.out.println("Nome Aluno : "+ nome );
		System.out.println("Matricula Aluno : "+ matricula );
		System.out.println("Desconto Aluno : "+ desconto );
		System.out.println("Pagamento Aluno : "+ pagamento() );
		
		curso.info();//chamar metodo info
	}
	
	double pagamento() {
		return curso.mensalidade*(1-desconto);
	}
	

	
}
