package empresa;

public class LivroDigitalEX {
	public String autor;
	public float custoProducao;
	public float precoVenda;
	public String titulo;
	public int paginas;
	
	//Novo
	public String linkDowload;
	public int tamanhoMB;
	
	
	public float lucro() {
		return precoVenda - custoProducao;
	}
	
	public void imprimirTitulo() {
		System.out.println("O titulo: " + titulo);
	}
	
	//Mudou
	public float imposto() {
		return 0.2f * lucro() + 2;
	}
	
	//novo
	public float tamanhoPorPagina() {
		return tamanhoMB/(float)paginas;
	}
	


}
