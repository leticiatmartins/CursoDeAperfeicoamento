package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.ControleAluno;
import controle.ControleDados;

public class ViewCadastro implements ActionListener {

	private JFrame cadastro;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome = new JTextField(200);
	private JLabel labelEnd = new JLabel("Endereco: ");
	private JTextField valorEnd = new JTextField(200);
	private JLabel labelCPF = new JLabel("CPF: ");
	private JTextField valorCPF = new JTextField(200);
	private JLabel labelID = new JLabel("Numero da Identidade: ");
	private JTextField valorID = new JTextField(200);
	private JLabel labelTelefone = new JLabel("Telefone");
	private JTextField valorDDD = new JTextField(3);
	private JTextField valorTelefone = new JTextField(10);
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private ControleDados dados;
	private String s;
	
	public void inserir(int i, ControleDados d) {
		if (i == 1) s = "Aluno";
		else s = "Professor";
		
		dados = d;
		cadastro = new JFrame("Cadastro de" + s);
		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelEnd.setBounds(30, 50, 150, 25);
		valorEnd.setBounds(180, 50, 180, 25);
		labelCPF.setBounds(30, 80, 150, 25);
		valorCPF.setBounds(180, 80, 180, 25);
		labelID.setBounds(30, 110, 150, 25);
		valorID.setBounds(180, 110, 180, 25);
		labelTelefone.setBounds(30, 140, 150, 25);
		valorDDD.setBounds(180, 140, 28, 25);
		valorTelefone.setBounds(210, 140, 65, 25);
		botaoSalvar.setBounds(245, 175, 115, 30);

		this.cadastro.add(labelNome);
		this.cadastro.add(valorNome);
		this.cadastro.add(labelEnd);
		this.cadastro.add(valorEnd);
		this.cadastro.add(labelCPF);
		this.cadastro.add(valorCPF);
		this.cadastro.add(labelID);
		this.cadastro.add(valorID);
		this.cadastro.add(labelTelefone);
		this.cadastro.add(valorDDD);
		this.cadastro.add(valorTelefone);
		this.cadastro.add(botaoSalvar);

		this.cadastro.setLayout(null);

		this.cadastro.setSize(400, 250);
		this.cadastro.setVisible(true);
		botaoSalvar.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
			try {
				novoDado[0] = Integer.toString(dados.getQtdAlunos());
				novoDado[1] =  valorNome.getText();
				novoDado[2] =  valorEnd.getText();
				novoDado[3] =  valorCPF.getText();
				novoDado[4] =  valorID.getText();
				novoDado[5] =  valorDDD.getText();
				novoDado[6] =  valorTelefone.getText();
				boolean res = new ControleAluno(dados).inserirAluno(novoDado); 
				if(res) mensagemSucesso();
				else mensagemErroCadastro();	
			} catch (NullPointerException exc){
				System.out.println("Entrou aqui!");
				mensagemErroCadastro();
			}
		}
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
						+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
						+ "1. Nem todos os campos foram preenchidos \n"
						+ "2. CPF, identidade, DDD e telefone não contém apenas números", null, 
						JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemSucesso() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
	}


}
