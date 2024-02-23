package empresa;

public class Livro {

	// atributos
	public String autor;
	public float custoProducao;
	public float precoVenda;
	public String titulo;
	public int paginas;
	
	//criar construtor com parametros
	
	public Livro(String autor, String titulo) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
	
	public float lucro() {
		return precoVenda - custoProducao;
	}

	
	public void imprimirTitulo() {
		System.out.println("O titulo: " + titulo);
	}
	
	public float imposto() {
		return 0.2f * lucro();
	}
}
