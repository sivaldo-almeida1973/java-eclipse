package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		// criar os objeto conta corrente
		
		Conta cc1 = new Conta();
		cc1.setCliente("sivaldo vieira");
		cc1.setSaldo(10000);
		System.out.println("Cliente: "+ cc1.getCliente());
		cc1.exibirSaldo();
		cc1.sacar(1500);
		cc1.exibirSaldo();
		
		System.out.println("---------------------i-------------------");
		Conta cc2 = new Conta();
		cc2.setCliente("Eralice Moraes");
		cc2.setSaldo(15000);
		System.out.println("Cliente: "+ cc2.getCliente());
		cc2.exibirSaldo();
		cc2.depositar(15000);
		cc2.exibirSaldo();
		
		System.out.println("----------------------------------------");
		System.out.println("Transferencia: ");
		System.out.println("Cliente: " + cc1.getCliente());
		System.out.println("Favorecido: " + cc2.getCliente());
		cc1.tranferir(cc2, 7000);
		System.out.println("");
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibirSaldo();
		
		System.out.println("----------------------------------------");
		System.out.println("Relatorio Gerencial: ");
		Conta gerente = new Conta();
		double relatorio = gerente.soma(cc1.getSaldo(), cc2.getSaldo());
		System.out.println("Saldo total nas contas: R$ " + relatorio);
		
		
		
		
		
		
		//metodos 

	}

}


