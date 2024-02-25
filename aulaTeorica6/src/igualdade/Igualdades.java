package igualdade;

public class Igualdades {

	public static void main(String[] args) {
		Usuario u1 = new Usuario(111,"Mario", "111222333-4");
		Usuario u2 = new Usuario(111,"Mario", "111222333-4");
		Usuario u3 = u1;
		
		System.out.println(u1==u2);//end diferente
		System.out.println(u1==u3);//mesmo end
		System.out.println();
		
		//meto equals(faz comparacao)
		System.out.println(u1.equals(u2));
		System.out.println(u1.equals(u3));
		
		//metodo toSring
		
		System.out.println(u1);
		
	
		

	}

}
