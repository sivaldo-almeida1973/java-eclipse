package empresa;

public class Nota {
	private double nota1;
	private double nota2;
	private int faltas;
	
	//construtor vazio
	public Nota() {
		
	}
	
	//construtor co parametros
	public Nota(double nota1, double nota2, int faltas) {
		setNota1(nota1);
		setNota2(nota2);
		setFalta(faltas);
		
	}
	
	public int getFalta() {	
		return faltas;
	}

	public void setFalta(int falta) {
		if(faltas > 40 || faltas < 0) {
			System.out.println("Numero de faltas inválido!");
			return;
		}
		this.faltas = falta;
	}

	public void setNota1(double nota) {
		//validacao nota
		if(nota < 0 || nota > 10) {
			System.out.println("Nota inválida!");
			return;
		}
		nota1 = nota;
	}
	
	public void setNota2(double nota) {
		//validar nota 
		if(nota < 0 || nota > 10) {
		  System.out.println("Nota inválida!");
		  return;
		}
		nota2 = nota;
	}
	

	public double getNota1() {
		return nota1;
	}
	
	public double getNota2() {
		return nota2;
	}
	
	void resultado() {
		double media = (nota1 + nota2)/2;
		
		System.out.println("Media: " + media);
		
		if(faltas > 7) {
			System.out.println("Reprovado por faltas!");
			
		}else if(media < 4) {
			System.out.println("Reprovado");
			
		}else if(media < 7) {
			System.out.println("Exame final");
			
		}else {
			System.out.println("Aprovado!");
		}
	}

}
