package empresa;

import java.util.ArrayList;

import cofre.Moeda;

public class Cofrinho {
	
	ArrayList<Moeda> listaMoeda = new ArrayList<Moeda>();
	
	public void adicionar(Moeda moeda) {
		listaMoeda.add(moeda);
		
	}
	
	public void remover(Moeda moeda) {
		listaMoeda.remove(moeda);
	}
	
	public void listar() {
		for (Moeda moeda : listaMoeda) {
			System.out.println(moeda);
		}
	}
	
  //-------------meto total moedas no cofrinho-----------------
	public double totalConvertido() {
		if (this.listaMoeda.isEmpty()) { //se lista estiver vazia retorna 0
			return 0;
		}
		// var que vai aculalar as moedas convertidas
		double totalValorAcumulado = 0;
		
		for (Moeda moeda :this.listaMoeda) {
			totalValorAcumulado = totalValorAcumulado + moeda.converter();//novo valor acumlado + 1
		}
		return totalValorAcumulado; //total acumulado
	}
	

	@Override
	public String toString() {
		return "Cofrinho [listaMoeda=" + listaMoeda + "]";
	}
	
	
	

}
