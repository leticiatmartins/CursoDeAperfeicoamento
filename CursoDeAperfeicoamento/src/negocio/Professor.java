package negocio;

public class Professor {
	private String nome;
	private double valorHoraAula;
	private Telefone tel;
	
	public Professor(String n, double v, Telefone t) {
		nome = n;
		valorHoraAula = v;
		tel = t;
	}
	
		public String toString() {
		return "Nome d@ professor@: " + nome + ", valor da hora/aula: R$" + valorHoraAula;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorHoraAula() {
		return valorHoraAula;
	}

	public void setValorHoraAula(double valorHoraAula) {
		this.valorHoraAula = valorHoraAula;
	}

	public Telefone getTel() {
		return tel;
	}

	public void setTel(Telefone tel) {
		this.tel = tel;
	}

	
}
