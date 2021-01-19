package negocio;

import java.util.*;

public class Curso {
	
	private String nome;
	private Date dtInicio;
	private Date dtTermino;
	private int horaInicio;
	private int horaTermino;
	private int cargaHoraria;
	private String conteudoProg;
	private double valor;
	private Aluno[] alunos = new Aluno[40];
	private int numAlunos = 0;
	
	public Curso(String n, String cont, double val, int total) {
		nome = n;
		conteudoProg = cont;
		valor = val;
		numAlunos = total;
	}
	
	public String toString() {
		return "Nome do curso: " + nome + ", valor do Curso:" + valor;
	}

	public Aluno[] getAlunosMatriculados() {
		return this.alunos;
	}
	
	public void setArrayAlunos(Aluno[] a) {
		this.alunos = a;
	}

	public Aluno getAluno(int i) {
		return alunos[i];
	}

	public void setAluno(Aluno aluno, int i) {
		this.alunos[i] = aluno;
	}

	public int getNumAlunos() {
		return numAlunos;
	}

	public void setNumAlunos(int numAlunos) {
		this.numAlunos = numAlunos;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	public Date getDtTermino() {
		return dtTermino;
	}

	public void setDtTermino(Date dtTermino) {
		this.dtTermino = dtTermino;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	public int getHoraTermino() {
		return horaTermino;
	}

	public void setHoraTermino(int horaTermino) {
		this.horaTermino = horaTermino;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getConteudoProg() {
		return conteudoProg;
	}

	public void setConteudoProg(String conetudoProg) {
		this.conteudoProg = conetudoProg;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String consultarAlunosMatriculados() {
		String saida = "***** Lista de Alunos ***** \n" ;
		for(int i = 0; i < numAlunos; i++) {
			System.out.println(i);
			saida = saida + "\n"+ alunos[i].toString();
		}
		return saida;
	}
	
}
