package empresa;

public class Principal {

	public static void main(String[] args) {
		// 
		Nota mario = new Nota();
		
		Nota luigi = new Nota(9,8,5);
		
		System.out.println("Media Luigi: ");
		luigi.resultado();
		System.out.println();
		
		mario.setNota1(9);
		mario.setNota2(10);
		mario.setFalta(0);
		
		mario.resultado();
		
		mario.setNota1(2);
		mario.setFalta(11);
		
		mario.resultado();

	}

}
