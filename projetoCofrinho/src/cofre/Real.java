package cofre;

public class Real extends Moeda{
    //filha de uma classe abstrata, não precisa repetir atributos
	
	
	//construtor
	public Real(double valor) {
		this.valor = valor;
	}
	
    //exibir na tela
	@Override
	public void info() {
		System.out.println("Real: " + valor);
		
		
	}
     //retorna alguma coisa
	@Override
	public double converter() {
		return this.valor;
				
	}
	
	
	
}
