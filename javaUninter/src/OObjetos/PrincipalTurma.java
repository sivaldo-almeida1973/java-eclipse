package OObjetos;

import java.util.ArrayList;

public class PrincipalTurma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Turma nova = new Turma();
		
		Aluno a = new Aluno();
		a.cpf="111.222.333.-4";
		a.nome="Super lucas";
		a.matricula=1001;
		
		a.info();
		Aluno b = new Aluno(1002,"Super Luigi", "222.333.444.5");
		
	    b.info();
				
				
				
				
				
		nova.prof = new Professor();
		nova.prof.nome="Sivaldo";
		nova.alunos= new ArrayList();
		nova.alunos.add(new Aluno());
		nova.alunos.get(0).nome="super Lucas";
		
		
		

	}

}
