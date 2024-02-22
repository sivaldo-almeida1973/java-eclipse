package empresa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//capitura a data de hoje
		LocalDate dataHoje = LocalDate.now();
		System.out.println("Original: " + dataHoje);
		
		//modificar formato da data
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy - EEEE");
        String dataForm = dataHoje.format(formatador);
        System.out.println("Formatado: " + dataForm);
	}

}
