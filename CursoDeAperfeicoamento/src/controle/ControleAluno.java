package controle;
import modelo.*;

public class ControleAluno {
	private Aluno[] a;
	private int qtdAlunos;
	
	public ControleAluno(ControleDados d) {
		this.a = d.getAlunos();
		this.qtdAlunos = d.getQtdAlunos();
	}
	
	public String[] getNomeAluno() {
		String[] s = new String[qtdAlunos];
		for(int i = 0; i < qtdAlunos; i++) {
			s[i] = a[i].getNome();
		}
		
		return s;
	}
	
	public boolean inserirAluno(String[] dadosAlunos) {
		int indice = Integer.parseInt(dadosAlunos[0]);
		if(!dadosAlunos[3].matches("[0-9]+") || !dadosAlunos[4].matches("[0-9]+") || 
				!dadosAlunos[5].matches("[0-9]+") || !dadosAlunos[6].matches("[0-9]+")) {
			return false;
		} else {
			if(indice == qtdAlunos) {
				a[indice] = new Aluno();
				qtdAlunos++;
			}
				a[indice].setNome(dadosAlunos[1]);
				a[indice].setEndereco(dadosAlunos[2]);
				a[indice].setCPF(Integer.parseInt(dadosAlunos[3]));
				a[indice].setNumID(Integer.parseInt(dadosAlunos[4]));
				a[indice].setNumTel(new Telefone(Integer.parseInt(dadosAlunos[5]),
						Integer.parseInt(dadosAlunos[6]))); 	
			return true;
		}
	}
	
	public int getQtd() {
		return qtdAlunos;
	}

	public void setQtd(int qtd) {
		this.qtdAlunos = qtd;
	}
	
	public String getNome(int i) {		
		return a[i].getNome();
	}
	
	public String getCPF(int i) {
		String numCPF = String.valueOf(a[i].getCPF());
		return numCPF;
	}
	
	public String getID(int i) {
		String numID = String.valueOf(a[i].getNumID());
		return numID;
	}
	
	public Telefone getTelefone(int i) {
		return a[i].getNumTel();
	}

	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}
	
	
	public String getEndereco(int i) {		
		return a[i].getEndereco();
	}
	
	
}
