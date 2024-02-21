package empresa;

public class Principal {

	public static void main(String[] args) {
		//Avaliacao avaliacaoA1 = new Avaliacao(10,9,8);
		
		Aluno a1 = new Aluno("Sivaldo", "Encanador",new Avaliacao(10,9,8));
		Aluno a2 = new Aluno("Lucas", "Encanador",new Avaliacao(4,1,10));
		
		
		a1.info();
		System.out.println("");
		a2.info();
	}

	
}
