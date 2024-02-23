package empresa;

public class LivroDigital extends Livro{

	//Novo
	public String linkDowload;
	public int tamanhoMB;
	
	//chama const da classe Livro(mae)
	public LivroDigital(String autor, String titulo, String linkDowload) {
		super(autor, titulo);
		this.linkDowload = linkDowload;
	}
	
	//Mudou
	public float imposto() {
		return super.imposto() + 2;
		//return 0.2f * lucro() + 2;
	}
	

	//novo
	public float tamanhoPorPagina() {
		return tamanhoMB/(float)paginas;
	}
	
	//metodo
	public void imprimirImposto() {
		System.out.println("Imposto livro Fisico: " + super.imposto());
		System.out.println("Imposto livro Digital: " + this.imposto());
	}
	
	
}
