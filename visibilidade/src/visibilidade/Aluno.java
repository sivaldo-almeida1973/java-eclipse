package visibilidade;

public class Aluno {
	private int matricula;//-4
	
	public String nome; //+
	public String cpf;  //+
	protected int notas[]; //#
	
	//construct
	public Aluno(int matricula, String nome, String cpf) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
	
	}
	
	//metodo(funcao)
	public void info() {
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("");
	}
	
	

}
