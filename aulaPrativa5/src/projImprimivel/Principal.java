package projImprimivel;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// criar objetos(instan)
		Funcionario f = new Funcionario("Sivaldo","111.222.333-4");
		Carro c = new Carro("Palio","Cinza",4);
		Quadrado q = new Quadrado(10);
		
		ArrayList<Imprimivel> lista = new ArrayList();
		
		lista.add(q);
		lista.add(c);
		lista.add(f);
		
		Imprimivel i = f;	
		i.imprimir();
		i=c;
		i.imprimir();
		i=q;
		i.imprimir();


	}

}
