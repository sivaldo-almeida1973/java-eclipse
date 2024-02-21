package OObjetos;

public class Aluno {
	//atributos de aluno
	int matricula;
	String nome;
	String cpf;
	
	//chamada obj aluno sem pararmetros
	Aluno() {
		System.out.println("Aluno criado sem parametros");
	};
	
	//construtor
	Aluno(int pMatricula, String pNome, String pCpf) {
		this.matricula = pMatricula;
		this.nome = pNome;
		this.cpf = pCpf;
	}
	
	//criar um metodo(imprimir)
	void info() {
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome: "+ nome);
		System.out.println("CPF: " + cpf);
		System.out.println("");
	}
	

}
