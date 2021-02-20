package controle;

import modelo.*;

public class ControleDados {
	public static Dados d = new Dados();
	
	public ControleDados() {
		d.fillWithSomeData();
	}
	
	public Aluno[] getAlunos() {
		return d.getAlunos();
	}
	
	public Professor[] getProfessores() {
		return d.getProfs();
	}
	
	public int getQtdAlunos() {
		return d.getQtdAlunos();
	}
	
	public int getQtdProfs() {
		return d.getQtdProfs();
	}
}
