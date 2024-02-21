package empresa;

public class Aluno {

	String nome;
	String curso;
	Avaliacao notas;
	
	//construtor(source gera automaticamente)	
	public Aluno(String nome, String curso, Avaliacao notas) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.notas = notas;
	}

	//metodo info(que vai imprimir na tela os dados)
	void info() {
		System.out.println("Nome: " + nome);
		System.out.println("Curso: " + curso);
		System.out.println("Media A: " + notas.mediaAritimetica());
		System.out.println("Media P: " + notas.mediaPonderada());
		
	}
	
}
