package cofre;

import java.util.ArrayList;

public class Cofrinho {
	
	//lista de moedas
	private ArrayList<Moeda> listaMoedas;

	//construtor(instanciar lista moeda vazia)
	public Cofrinho() {
		this.listaMoedas = new ArrayList<>();
	}
	
	//metodos adicionar moedas
	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);//adicionar moeda na lista
	}
	
	//metod remover moedas-----------------------------
	public boolean remover(Moeda moeda) {
		return this.listaMoedas.remove(moeda);	
	}
	
	//------------metodo listarMoedas----------------------
	//para cada moda detro de list, ira chamar o info
	public void listagemMoedas() {
		
		if (this.listaMoedas.isEmpty()) {//retorna v ou f
			System.out.println("Nao existe moedas no cofrinho!!");
			return;//se a lista estiver fazia para aqui!
		}
		
		//para cada moeda dentro da listaMoedas
		for (Moeda moeda : this.listaMoedas) {
			moeda.info();//executar
		}
		
	}
     //-------------meto total moedas no cofrinho-----------------
	public double totalConvertido() {
		if (this.listaMoedas.isEmpty()) { //se lista estiver vazia retorna 0
			return 0;
		}
		// var que vai aculalar as moedas convertidas
		double totalValorAcumulado = 0;
		
		for (Moeda moeda :this.listaMoedas) {
			totalValorAcumulado = totalValorAcumulado + moeda.converter();//novo valor acumlado + 1
		}
		return totalValorAcumulado; //total acumulado
	}

	
	
	
	

}
