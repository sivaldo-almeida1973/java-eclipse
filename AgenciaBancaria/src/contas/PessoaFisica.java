package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		// criar os objeto conta corrente
		
		Conta cc1 = new Conta();
		cc1.cliente = "Sivaldo Vieira";
		cc1.saldo = 10000;
		System.out.println("Cliente: "+ cc1.cliente);
		cc1.exibirSaldo();
		
		System.out.println("----------------------------------------");
		Conta cc2 = new Conta();
		cc2.cliente = "Eralice Moraes";
		cc2.saldo = 330000;
		System.out.println("Cliente: "+ cc2.cliente);
		cc2.exibirSaldo();

	}

}


