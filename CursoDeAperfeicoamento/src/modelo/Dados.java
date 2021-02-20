package modelo;

import java.util.*;

public class Dados {
	private static  Aluno[] alunos = new Aluno[50];
	private static int qtdAlunos = 0;
	private static Curso [] cursos = new Curso[50];
	private static int qtdCursos = 0;
	private static Professor[] profs = new Professor[50];
	private static int qtdProfs = 0;
	private static Telefone[] tels = new Telefone[50];
	private static int qtdTels = 0;
	private static Matricula[] matr = new Matricula[50];
	private static int qtdMatriculados = 0;
	
	
	public void fillWithSomeData() {
		Date d = Calendar.getInstance().getTime();
		for(int i = 0; i < 5; i++) {
			tels[i] = new Telefone((i+1)*100, (i+1)*1000000);
			alunos[i] = new Aluno("Aluno"+i, "Endereco"+i, d, (i+1)*123456, (i+1)*112233, 
					tels[i]);
			profs[i] = new Professor("Professor"+i, (i+1)*1000, tels[i], (i+1)*654321, 
					(i+1)*332211);
			cursos[i] = new Curso("Curso"+1, d, d, 8, 10, 40, "Orientacao a Objetos", 
					profs[i], (i+1)*400, 0);
			matr[i] = new Matricula(alunos[i], d, (i+1)*400, cursos[0], "Turma A");			
		}
		
		qtdAlunos = 5;
		qtdCursos = 5;
		qtdProfs = 5;
		qtdTels = 5;
		qtdMatriculados = 5;
	}
	
	public static Aluno[] getAlunos() {
		return alunos;
	}
	
	public static void setAlunos(Aluno[] alunos) {
		Dados.alunos = alunos;
	}
	public int getQtdAlunos() {
		return qtdAlunos;
	}
	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}
	public static Curso[] getCursos() {
		return cursos;
	}
	public static void setCursos(Curso[] cursos) {
		Dados.cursos = cursos;
	}
	public int getQtdCursos() {
		return qtdCursos;
	}
	public void setQtdCursos(int qtdCursos) {
		this.qtdCursos = qtdCursos;
	}
	
	public static Professor[] getProfs() {
		return profs;
	}
	
	public static void setProfs(Professor[] profs) {
		Dados.profs = profs;
	}
	public int getQtdProfs() {
		return qtdProfs;
	}
	public void setQtdProfs(int qtdProfs) {
		this.qtdProfs = qtdProfs;
	}
	public static Telefone[] getTels() {
		return tels;
	}
	public static void setTels(Telefone[] tels) {
		Dados.tels = tels;
	}
	public int getQtdTels() {
		return qtdTels;
	}
	public void setQtdTels(int qtdTels) {
		this.qtdTels = qtdTels;
	}
	public static Matricula[] getMatr() {
		return matr;
	}
	public static void setMatr(Matricula[] matr) {
		Dados.matr = matr;
	}
	public int getQtdMatriculados() {
		return qtdMatriculados;
	}
	public void setQtdMatriculados(int qtdMatriculados) {
		this.qtdMatriculados = qtdMatriculados;
	}
	
	/* Criar métodos de incluir, excluir e alterar dados
	 * presentes em cada um dos arrays
	 */
	
	

}
