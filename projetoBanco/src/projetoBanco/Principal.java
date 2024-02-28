package projetoBanco;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta c1 = new Conta("Mario", 5000);
		Conta c2 = new Conta("Luigi", 1000);
		
		try {
			System.out.println("-----Conta c1-----");
			c1.info();
			System.out.println("---Deposito feito!---");
			c1.depositar(300);
			c1.info();
			c1.sacar(500);
			System.out.println("---Saque feito!---");
			c1.info();
			c2.info();
			c1.transferir(4400, c2);
			System.out.println("---Transferencia feito!---");
			c1.info();
			c2.info();
		
		} catch (Exception e) {
			System.out.println("Ocorreu um erro!!,");
			System.out.println(e.getLocalizedMessage());
			
		}
		finally {
			System.out.println("Finalizando programa!");
		}
	}

}
