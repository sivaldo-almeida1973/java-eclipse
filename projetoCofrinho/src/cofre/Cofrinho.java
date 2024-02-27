package cofre;

import java.util.ArrayList;

public class Cofrinho {
	
	//lista de moedas
	private ArrayList<Moeda> listaMoedas;

	public Cofrinho() {
		this.listaMoedas = new ArrayList<>();//atencao----------------
	}
	
	//metodos adicionar moedas
	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}
	
	//------------metodo listarMoedas----------------------
	//para cada moda detro de list, ira chamar o info
	public void listagemMoedas() {
		
		if (this.listaMoedas.isEmpty()) {
			System.out.println("Nao existe moedas");
			return;
		}
		
		
		for (Moeda moeda : this.listaMoedas) {
			moeda.info();
		}
	}
	
	
	
	

}
