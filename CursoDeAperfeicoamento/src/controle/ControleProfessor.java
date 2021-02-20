package controle;

import modelo.*;

public class ControleProfessor {
	private Professor[] p;
	private int qtdProfs;

	public ControleProfessor(ControleDados d) {
		this.p = d.getProfessores();
		this.qtdProfs = d.getQtdProfs();
	}

	public String[] getNomeProf() {
		String[] s = new String[qtdProfs];
		for(int i = 0; i < qtdProfs; i++) {
			s[i] = p[i].getNome();
		}

		return s;
	}

	public boolean inserirProfessor(String[] dados) {
		int indice = Integer.parseInt(dados[0]);
		if(dados[3].matches("[a-zA-Z]") || dados[4].matches("[a-zA-Z]") || 
				dados[5].matches("[a-zA-Z]") || dados[6].matches("[a-zA-Z]")) {
			return false;
		} else {
			p[indice].setNome(dados[1]);
			p[indice].setValorHoraAula(Double.parseDouble(dados[2]));
			p[indice].setCPF(Integer.parseInt(dados[3]));
			p[indice].setNumID(Integer.parseInt(dados[4]));
			p[indice].setNumTel(new Telefone(Integer.parseInt(dados[5]), 
					Integer.parseInt(dados[6])));

			if(indice == qtdProfs) qtdProfs++;	
			return true;
		}
	}

	public int getQtd() {
		return qtdProfs;
	}

	public void setQtd(int qtd) {
		this.qtdProfs = qtd;
	}

	public String getNome(int i) {		
		return p[i].getNome();
	}

	public String getCPF(int i) {
		String numCPF = String.valueOf(p[i].getCPF());
		return numCPF;
	}

	public String getID(int i) {
		String numID = String.valueOf(p[i].getNumID());
		return numID;
	}

	public Telefone getNumTel(int i) {
		return p[i].getNumTel();
	}

	public void setQtdAlunos(int qtdProfs) {
		this.qtdProfs = qtdProfs;
	}
	
	public double getValorHoraAula (int i) {
		return p[i].getValorHoraAula();
	}
}
