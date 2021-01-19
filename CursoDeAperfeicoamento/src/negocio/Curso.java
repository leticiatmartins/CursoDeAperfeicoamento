package negocio;

import java.util.Date;

public class Curso {
	
	private String nome;
	private Date dtInicio;
	private Date dtTermino;
	private int horaInicio;
	private int horaTermino;
	private int cargaHoraria;
	private String conteudoProg;
	private double valor;
	private Aluno[] alunos;
	private int numAlunos;
	
	public Curso(String n, String cont, double val) {
		nome = n;
		conteudoProg = cont;
		valor = val;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
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
	
	

}
