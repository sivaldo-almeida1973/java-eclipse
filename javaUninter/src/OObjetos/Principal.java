package OObjetos;

public class Principal {

	public static void main(String[] args) {
		// instancia de aluno
		Aluno a = new Aluno();
		//acessar atributos
		a.matricula = 1001;
		a.nome = "sivaldo";
		a.cpf = "44558766";
		
		// instancia de aluno
		Aluno b = new Aluno();
		//acessar atributos
		b.matricula = 1002;
		b.nome = "Alice";
		b.cpf = "99887744-00";
		
		//executar
		a.info();
		
		//alterar nome
		a.nome = "Almeida";
		
		a.info();
		
		b.info();

	}

}
