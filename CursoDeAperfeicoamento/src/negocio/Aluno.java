package negocio;

import java.util.Date;

public class Aluno {
	private String nome;
	private int numID;
	private int CPF; 
	private Date dataNasc;
	private String endereco;
	private Telefone numTel;
	
	public Aluno(String n, Date d, String e) {
		nome = n;
		dataNasc = d;
		endereco = e;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumID() {
		return numID;
	}

	public void setNumID(int numID) {
		this.numID = numID;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Telefone getNumTel() {
		return numTel;
	}

	public void setNumTel(Telefone numTel) {
		this.numTel = numTel;
	}
	

}
