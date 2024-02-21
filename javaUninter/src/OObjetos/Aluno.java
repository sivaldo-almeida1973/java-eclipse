package OObjetos;

public class Aluno {
	//atributod
	int matricula;
	String nome;
	String cpf;
	
	Aluno() {};
	
	Aluno(int pMatricula, String pNome, String pCpf) {
		matricula = pMatricula;
		nome = pNome;
		cpf = pCpf;
	}
	
	//criar um metodo(imprimir)
	void info() {
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome: "+ nome);
		System.out.println("CPF: " + cpf);
		System.out.println("");
	}
	

}
