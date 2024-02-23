package exercicios;

public class Autor {
	private String nome;
	private String email;
	private String nacionalidade;
	
	//metodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMensalidade() {
		return nacionalidade;
	}
	public void setMensalidade(String mensalidade) {
		this.nacionalidade = mensalidade;
	}
	
	//const com parametros
	public Autor(String nome, String email, String nacionalidade) {
		super();
		this.nome = nome;
		this.email = email;
		this.nacionalidade = nacionalidade;
	}
	//const sem parametros
	public Autor() {
		
	}
	 //iprimir dados de autor na tela
	public void info() {
		System.out.println("Nome Autor: " + nome);
		System.out.println("Email : " + email);
		System.out.println("Nacionalidade: " + nacionalidade);
	}
	
	
	
	

}
