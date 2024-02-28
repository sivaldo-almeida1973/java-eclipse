package empresa;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario f = new Funcionario("Mario","111.222.333-4");
		Carro c = new Carro("Fiat","cinza",4);
		Quadrado  q = new Quadrado(10);
		
		ArrayList<Imprimivel> lista = new ArrayList();
		
		//adicionar na lista
		lista.add(q);
		lista.add(c);
		lista.add(f);
		
		
		//ponteiro
		Imprimivel i = f;	
		i.imprimir();
		i=c;
		i.imprimir();
		i=q;
		i.imprimir();
		
		
		

	}

}
