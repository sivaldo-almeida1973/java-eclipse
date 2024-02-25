package designP;

public class Principal {

	public static void main(String[] args) {
		// Singleton(retorna sempre a mesma instancia)
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		s1.numero+=10;
		System.out.println(s1.numero);
		System.out.println(s2.numero);
		
		s2.numero+=50;
		
		System.out.println(s1.numero);
		System.out.println(s2.numero);
		
		

	}

}
