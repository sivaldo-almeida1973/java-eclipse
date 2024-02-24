package empresa;

enum Estacao{//cria constantes
	VERAO,
	OUTONO,
	INVERNO,
	PRIMAVERA
}

public class Roupa {
	String modelo;
	int tamaho;
	Estacao colecao; 
	
	public Roupa(String modelo, int tamaho, Estacao colecao) {
		super();
		this.modelo = modelo;
		this.tamaho = tamaho;
		this.colecao = colecao;
	}
	
	public void msg() {
		switch (colecao) {
		case VERAO:
			System.out.println("Arrase na praia!");
			break;
		case OUTONO:
		    System.out.println("Passe o outono com elegância!");
		    break;
		case INVERNO:
		    System.out.println("Se agasalhe bem e com estilo!!");
		    break;
		case PRIMAVERA:
		    System.out.println("Se vista na estção das flores!");
		    break;
		default:
			
			
		}
	}
	
	

}
