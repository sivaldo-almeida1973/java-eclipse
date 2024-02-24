package empresa;

public class Principal {

	public static void main(String[] args) {
		FormaGeometrica forma;
		
		forma = new Circulo();
		forma.calculaArea();
		System.out.println(forma.area);
		
		
		//forma agora é um quadrado
		//forma.calculaArea();
		//System.out.println(forma.area);
		

	}

}
