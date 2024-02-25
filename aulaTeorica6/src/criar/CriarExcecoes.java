package criar;

import java.util.Scanner;

public class CriarExcecoes {

	public static void main(String[] args) throws ValoInvalidoException {
		// Criar Excecoes
		
		System.out.print("Digite um valor entre 0 e 10: ");
		Scanner teclado = new Scanner(System.in);
		int valor = teclado.nextInt();
		
		//excecao do tipo na tratada
		if(valor > 10 || valor < 0) {
			throw new ValoInvalidoException();
		}
		
		
		
		//excecao do tipo tratada
		try {

			//verificar
			if(valor > 10 || valor < 0) {
				throw new Exception("Valor Inválido!");
			}
			
		} catch (Exception e) {
			System.out.println("Aconteceu um problema:" + e.getMessage());
		}

	}

}
