package empresa;

public class funcoes {
	//funcoes não podem ficar dentro de outra
	//para passar parametros tem que indica o tipo(int)
	public static void alo(int horario) {
		System.out.println("Alo pessoal");
		if(horario >=6 && horario <= 12) {
			System.out.println("Bom dia!");
			
		}else if (horario > 12 && horario <=18) {
			System.out.println("Bom tarde!");
			
		}else {
			System.out.println("Bom noite!");
		}
	}
	
	//funcao com retorno
	public static float media3(float a,float b,float c) {
		float resultado = (a+b+c)/3;
		return resultado;
	}

	public static void main(String[] args) {
		// chamada
		alo(10);
		alo(22);
		alo(18);
		
		//chamada
		System.out.println("Media: " + media3(10,30,20));
		

	}

}
