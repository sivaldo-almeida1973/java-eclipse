package teste;

public class javaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Ola mundo");
		
		for(int tabuada = 0;tabuada <= 10;tabuada++) {
			for(int valor = 0; valor <= 10;valor++) {
				System.out.println(tabuada + " X " + valor + " = "+ (tabuada * valor));
			}
		}
		
		int contador = 1;
		
		while(contador <= 10) {
			System.out.println(contador);
			contador ++;
		}
		
		char novoJogo;
		do {
			System.out.println("Deseja jogar novamente(s/n)?");
			novoJogo = 'n';
			novoJogo++;
		}while (novoJogo == 's');
		System.out.println("Game Over!!");
		
		

	}

}
