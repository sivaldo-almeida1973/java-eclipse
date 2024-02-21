package empresa;

public class Avaliacao {
	//variaveis
	double n1, n2, n3;
	
	Avaliacao(){//construtor para ojb sem parametro
		
	}
	
	Avaliacao(double n1, double n2, double n3){//construtor para obj com parametro
		this.n1 =n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
		
	//criar metodo(funcao)
	public double mediaAritimetica() {
		return (n1+n2+n3)/3;
	}
	public double mediaPonderada() {
		return (n1*2+n2*3+n3*4)/9;
	}
	

}
