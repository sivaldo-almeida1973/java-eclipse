package OObjetos;

import java.util.ArrayList;

public class PrincipalTurma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Turma nova = new Turma();
		
		nova.prof = new Professor();
		nova.prof.nome="Sivaldo";
		nova.alunos= new ArrayList();
		nova.alunos.add(new Aluno());
		nova.alunos.get(0).nome="super Lucas";
		

	}

}
