package empresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Reverso {

	public static void main(String[] args) {
		// Array não imprime completo
		//int megaSena[] = {10,20,30,40,50,60};
		
		//ArrayList
		//ArrayList<Integer> megaSena = new ArrayList<Integer>();
		
		int qtd;
		String nome;
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<String> listaNomes = new ArrayList<String>();
	    System.out.println("Digite a quantidade de nomes: ");
	    qtd = teclado.nextInt();
	    
	    for(int i = 0; i < qtd; i++) {
	    	nome = teclado.next();
	    	listaNomes.add(nome);
	    }
	    
	    //ordem reversa
	   /* 
	    for(int i=listaNomes.size()-1; i>=0;i--) {
	    	System.out.println(listaNomes.get(i));
	    }*/
		
	    //com uma funcao
	    
	    System.out.println("Ordem normal: ");
	    System.out.println(listaNomes);
	    
	    Collections.reverse(listaNomes);
	    
	    System.out.println("Ordem reversa: ");
	    System.out.println(listaNomes);
		
		
	
		
		

	}

}
