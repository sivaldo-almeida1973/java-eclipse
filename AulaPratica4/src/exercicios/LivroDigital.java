package exercicios;

public class LivroDigital extends Livro{
	private int download;
	private double tamanho;
	
	
	public int getDownload() {
		return download;
	}
	public void setDownload(int download) {
		this.download = download;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	//const
	public LivroDigital(String titulo, String genero, int edicao, Autor autor, int download, double tamanho) {
		super(titulo, genero, edicao, autor);
		this.download = download;
		this.tamanho = tamanho;
	}
	//const vazio
	public LivroDigital() {
		
	}
	
	
	@Override           //metodo info
	public void info() {
		super.info();
		System.out.println("Download: " + download);
		System.out.println("Tamanho : " + tamanho);
	}
	

	
	
	

}
