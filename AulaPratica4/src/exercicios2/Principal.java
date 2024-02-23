package exercicios2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IngressoVip vp = new IngressoVip("Rock in Rio", 200, 300);
		
		vp.info();
		
		Ingresso ic = new Ingresso("Rock in Rio", 200);
		ic.info();

	}

}
