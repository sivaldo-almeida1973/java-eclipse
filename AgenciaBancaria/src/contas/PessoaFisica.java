package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		// criar os objeto conta corrente
		
		Conta cc1 = new Conta();
		cc1.cliente = "Sivaldo Vieira";
		cc1.saldo = 10000;
		System.out.println("Cliente: "+ cc1.cliente);
		cc1.exibirSaldo();
		cc1.sacar(1500);
		cc1.exibirSaldo();
		
		System.out.println("----------------------------------------");
		Conta cc2 = new Conta();
		cc2.cliente = "Eralice Moraes";
		cc2.saldo = 330000;
		System.out.println("Cliente: "+ cc2.cliente);
		cc2.exibirSaldo();
		cc2.depositar(15000);
		cc2.exibirSaldo();
		
		System.out.println("----------------------------------------");
		System.out.println("Transferencia: ");
		System.out.println("Cliente: " + cc1.cliente);
		System.out.println("Favorecido: " + cc2.cliente);
		cc1.tranferir(cc2, 7000);
		System.out.println("");
		System.out.println("Cliente: " + cc1.cliente);
		cc1.exibirSaldo();
		System.out.println("Cliente: " + cc2.cliente);
		cc2.exibirSaldo();
		
		System.out.println("----------------------------------------");
		System.out.println("Relatorio Gerencial: ");
		Conta gerente = new Conta();
		double relatorio = gerente.soma(cc1.saldo, cc2.saldo);
		System.out.println("Saldo total nas contas: R$ " + relatorio);
		
		
		
		
		
		
		//metodos 

	}

}


