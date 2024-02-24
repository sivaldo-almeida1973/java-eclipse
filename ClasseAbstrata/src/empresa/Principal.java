package empresa;

public class Principal {

	public static void main(String[] args) {
		FormaGeometrica forma;
		
		
		//forma agora é um quadrado
		forma = new Quadrado();
		forma.calculaArea();
		System.out.println(forma.area);
		

	}

}
