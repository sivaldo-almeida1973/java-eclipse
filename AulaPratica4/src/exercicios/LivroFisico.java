package exercicios;

public class LivroFisico extends Livro{
	private int tiragem;
	private int peso;
	
	
	public int getTiragem() {
		return tiragem;
	}
	public void setTiragem(int tiragem) {
		this.tiragem = tiragem;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	//const com param
	public LivroFisico(String titulo, String genero, int edicao, Autor autor, int tiragem, int peso) {
		super(titulo, genero, edicao, autor);
		this.tiragem = tiragem;
		this.peso = peso;
	}
	//const vazio
	public LivroFisico() {	}
	
	@Override  //(da um alerta de erro)
	public void info() {
		super.info();
		System.out.println("Tiragem: " + tiragem);
		System.out.println("Peso: " + peso);
	}
	
	

}
