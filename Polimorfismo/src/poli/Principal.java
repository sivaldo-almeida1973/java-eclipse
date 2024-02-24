
package poli;

public class Principal {

	public static void main(String[] args) {
		// Polimorfismo
		Funcionarios funcionarios[] = {new Assalariado("Mario", 3500),
				                  new Horista("Luigi", 100,40.5f),
				                  new Comissionado("Yoshi", 50000,0.05f)};
		
		Funcionarios f;
		float total = 0;
		for(int i = 0; i < funcionarios.length; i++) {
			f = funcionarios[i];
			System.out.println(f.nome + " Salario: " + f.pagamento());
			total += f.pagamento();
			
		}
		System.out.println("Total Pagamento:" + total);
		
	}
	

}
