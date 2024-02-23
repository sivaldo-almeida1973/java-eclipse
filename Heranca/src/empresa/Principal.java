package empresa;

public class Principal {

	public static void main(String[] args) {
		Livro L1 = new Livro("Sherlock Holmes","Sir Artur conan Doyle");
		L1.imposto();
		
		
		LivroDigital L2 = new LivroDigital("Sherlock Holmes","Sir Artur conan Doyle","http://sherlock");
		L2.imposto();
		//comparacao
		System.out.println(L1 instanceof Livro);//true
		System.out.println(L2 instanceof Livro);//true
		System.out.println(L1 instanceof LivroDigital);//false
		System.out.println(L2 instanceof LivroDigital);//true

	}

}
