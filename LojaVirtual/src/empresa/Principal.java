package empresa;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop compA = new Desktop(8, 4, 600);
		NoteBook compB = new NoteBook(8, 4, 15);
		
		Computador comp;//ponteiro
		
		//criar lista
		ArrayList<Computador> listaComputadores = new ArrayList();
		
		listaComputadores.add(compA);
		listaComputadores.add(compB);
		listaComputadores.add(new Desktop(16, 8, 1200));
		listaComputadores.add(new NoteBook(16,8,18));
		
		//criar var
		double total =0;
		
		for(Computador c : listaComputadores) {
			total += c.calculaValor();
		}
		
		System.out.println("Total valor:"+total);
	}

}
