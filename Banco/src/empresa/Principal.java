package empresa;

public class Principal {

	public static void main(String[] args) {
		// como o obj ja esta com parametros precisa criar o contrutor na conta
		Conta c1 = new Conta(111,"Mario", 2000, 500);
		
		System.out.println("==========Saldo Incial============:");//
		c1.info();//imprimir na tela os dados 
		
		System.out.println("");//pular linha
		System.out.println("==========Saldo c/saque===========");
		if(!c1.sacar(3000)) {
			System.out.println("Problema ao sacar!");
		};
		c1.info();//imprimir na 
		
		
		if(!c1.deposito(-1000)) {
			System.out.println("Problema ao depositar!");
		};
		System.out.println("");//pular linha
		System.out.println("=============Saldo c/ Deposito======");
		
		c1.info();
		

	}

}
