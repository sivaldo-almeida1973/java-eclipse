package exercicios;

public class Principal {

	public static void main(String[] args) {
		// instancia de Livros
		LivroDigital ld = new LivroDigital("Senhor Aneis", "aventura",5,
				new Autor("Raimundo","raimundo@gmail.com","britanico"),
				500, 3500);
		
		LivroFisico livroB = new LivroFisico("Sherlok","aventura",2,
				              new Autor("sir Artur conan", "raimundo.com","Britanico")
				            		  , 500, 2500);
		
		ld.info();
		System.out.println();
		System.out.println("Livro fisico:");
		livroB.info();

	}

}
