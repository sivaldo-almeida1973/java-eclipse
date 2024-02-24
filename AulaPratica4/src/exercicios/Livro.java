package exercicios;

public abstract class Livro {
	protected String titulo;
	protected int edicao;
	protected String genero;
	protected Autor autor;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	//const com param
	public Livro(String titulo, String genero, int edicao, Autor autor) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.edicao = edicao;
		this.autor = autor;
	}
	
	//const
	public Livro() {}
	
	public void info() {
		System.out.println("Titulo do Livro:" + titulo);
		System.out.println("Genero:" + genero);
		System.out.println("Edicao:" + edicao);
		autor.info();
	}
	
	
	

}
