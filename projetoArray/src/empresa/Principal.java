package empresa;

public class Principal {
	
	//metodo
	public static int[] instanciaArray(int n) {
		return new int[n];
	}

	public static void main(String[] args) {
		int tam = -9;
		int arr[]=null;//array vazio
		
		
		try {
			int conta = 10/0;
			
			arr= instanciaArray(tam);
			for(int i = 0; i < tam ; i++) {
				System.out.println(arr[i]);
			}
		} catch (NegativeArraySizeException e) {
			System.out.println("Valor inválido, digite outro!");
			System.out.println(e.getMessage());
		}	
		catch(ArithmeticException e) {
			System.out.println("Divisão por zero!");
			System.out.println(e.getMessage());
		}
		

	}

}
