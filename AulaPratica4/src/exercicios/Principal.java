package exercicios;

public class Principal {

	public static void main(String[] args) {
		// instancia de Livros
		LivroDigital ld = new LivroDigital("Senhor Aneis", "aventura",5,
				new Autor("Raimundo","raimundo@gmail.com","britanico"),
				500, 3500);
		
		ld.info();

	}

}
