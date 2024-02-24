package empresa;

public class Gato implements Animal {
     //anotation
	
	@Override
	public void emitirSom() {
		System.out.println("Miuau!!");
		
	}

	@Override
	public void dormir() {
		System.out.println("zzzz");
		
	}
	

}
