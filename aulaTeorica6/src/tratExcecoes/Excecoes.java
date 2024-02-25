package tratExcecoes;

public class Excecoes {

	public static void main(String[] args) {
		// Excecoes
		int[] numeros = {1,2,3};
		
        
		//tentar executar
		try {
			numeros[0] = numeros[0]/0;
			System.out.println(numeros[10]);
			
		} 
		catch(ArrayIndexOutOfBoundsException e) {//erro classe epecifica	
			System.out.println("Fora do limite");
			return;
		}	
		catch (Exception e) { //Erro generico
			System.out.println("Ocorreu um problema:" + e.getMessage());
			
		}
		finally {  //sempre vai executar
			System.out.println("Final do programa!");
		}
	}

}
