package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;


public class ViewPessoa implements ActionListener, ListSelectionListener {		
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastro;
	private JButton botaoSalvarAluno;
	private JButton botaoSalvarProf;
	private JFrame detalhe;
	private ControleDados dados;
	private JList<String> listaAlunosCadastrados;
	private JList<String> listaProfsCadastrados;
	private String[] novoDado = new String[7];
	private int tipo;
	
	public void mostrarDados(ControleDados d, int i){
		dados = d;
		tipo = i;
		
		switch (i) {
		case 1:
			listaAlunosCadastrados = new JList<String>(new ControleAluno(dados).getNomeAluno());
			janela = new JFrame("Alunos");
			titulo = new JLabel("Alunos Cadastrados");
			cadastro = new JButton("Cadastrar Novo Aluno");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaAlunosCadastrados.setBounds(20, 50, 350, 120);
			listaAlunosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaAlunosCadastrados.setVisibleRowCount(10);


			cadastro.setBounds(90, 177, 200, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaAlunosCadastrados);
			janela.add(cadastro);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastro.addActionListener(this);
			listaAlunosCadastrados.addListSelectionListener(this);
			
			break;

		case 2:
			listaProfsCadastrados = new JList<String>(new ControleProfessor(dados).getNomeProf());
			janela = new JFrame("Professores");
			titulo = new JLabel("Professores Cadastrados");
			cadastro = new JButton("Cadastrar Novo Professor");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaProfsCadastrados.setBounds(20, 50, 350, 120);
			listaProfsCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaProfsCadastrados.setVisibleRowCount(10);


			cadastro.setBounds(90, 177, 200, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaProfsCadastrados);
			janela.add(cadastro);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastro.addActionListener(this);
			listaProfsCadastrados.addListSelectionListener(this);
			break;

		default:
			JOptionPane.showMessageDialog(null,"Opção não encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
		}

	}

	private void mostrarDetalhesAluno(int i) {

		ControleAluno alunos = new ControleAluno(dados);

		this.detalhe = new JFrame("Detalhe de Aluno");

		JLabel labelNome = new JLabel("Nome do aluno: ");
		JTextField valorNome = new JTextField(alunos.getNome(i), 200);
		JLabel labelEnd = new JLabel("Endereco: ");
		JTextField valorEnd = new JTextField(alunos.getEndereco(i),200);
		JLabel labelCPF = new JLabel("CPF: ");
		JTextField valorCPF = new JTextField(alunos.getCPF(i), 200);
		JLabel labelID = new JLabel("Numero da Identidade: ");
		JTextField valorID = new JTextField(alunos.getID(i), 200);
		JLabel labelTelefone = new JLabel("Telefone");
		JTextField valorDDD = new JTextField(
				String.valueOf(alunos.getTelefone(i).getDDD()), 3);
		JTextField valorTelefone = new JTextField(
				String.valueOf(alunos.getTelefone(i).getNumero()), 10);
		JButton exclusao = new JButton("Excluir Aluno");
		botaoSalvarAluno = new JButton("Salvar Edição");


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
		botaoSalvarAluno.setBounds(120, 175, 115, 30);
		exclusao.setBounds(245, 175, 115, 30);

		this.detalhe.add(labelNome);
		this.detalhe.add(valorNome);
		this.detalhe.add(labelEnd);
		this.detalhe.add(valorEnd);
		this.detalhe.add(labelCPF);
		this.detalhe.add(valorCPF);
		this.detalhe.add(labelID);
		this.detalhe.add(valorID);
		this.detalhe.add(labelTelefone);
		this.detalhe.add(valorDDD);
		this.detalhe.add(valorTelefone);
		this.detalhe.add(exclusao);
		this.detalhe.add(botaoSalvarAluno);
		this.detalhe.setLayout(null);
		this.detalhe.setSize(400, 250);
		this.detalhe.setVisible(true);

		botaoSalvarAluno.addActionListener(this);
		novoDado[0] = Integer.toString(i);
		novoDado[1] =  valorNome.getText();
		novoDado[2] =  valorEnd.getText();
		novoDado[3] =  valorCPF.getText();
		novoDado[4] =  valorID.getText();
		novoDado[5] =  valorDDD.getText();
		novoDado[6] =  valorTelefone.getText();
	}
	
	
	private void mostrarDetalhesProfessor(int i) {

		ControleProfessor professores = new ControleProfessor(dados);

		this.detalhe = new JFrame("Detalhe de Professor");

		JLabel labelNome = new JLabel("Nome do aluno: ");
		JTextField valorNome = new JTextField(professores.getNome(i), 200);
		JLabel labelHoraAula = new JLabel("Valor Hora/Aula (R$): ");
		JTextField valorHoraAula = new JTextField(String.valueOf(professores.getValorHoraAula(i)),200);
		JLabel labelCPF = new JLabel("CPF: ");
		JTextField valorCPF = new JTextField(professores.getCPF(i), 200);
		JLabel labelID = new JLabel("Numero da Identidade: ");
		JTextField valorID = new JTextField(professores.getID(i), 200);
		JLabel labelTelefone = new JLabel("Telefone");
		JTextField valorDDD = new JTextField(
				String.valueOf(professores.getNumTel(i).getDDD()), 3);
		JTextField valorTelefone = new JTextField(
				String.valueOf(professores.getNumTel(i).getNumero()), 10);
		JButton exclusao = new JButton("Excluir Professor");
		botaoSalvarProf = new JButton("Salvar Edição");


		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelHoraAula.setBounds(30, 50, 150, 25);
		valorHoraAula.setBounds(180, 50, 180, 25);
		labelCPF.setBounds(30, 80, 150, 25);
		valorCPF.setBounds(180, 80, 180, 25);
		labelID.setBounds(30, 110, 150, 25);
		valorID.setBounds(180, 110, 180, 25);
		labelTelefone.setBounds(30, 140, 150, 25);
		valorDDD.setBounds(180, 140, 28, 25);
		valorTelefone.setBounds(210, 140, 65, 25);
		botaoSalvarProf.setBounds(120, 175, 115, 30);
		exclusao.setBounds(245, 175, 115, 30);

		this.detalhe.add(labelNome);
		this.detalhe.add(valorNome);
		this.detalhe.add(labelHoraAula);
		this.detalhe.add(valorHoraAula);
		this.detalhe.add(labelCPF);
		this.detalhe.add(valorCPF);
		this.detalhe.add(labelID);
		this.detalhe.add(valorID);
		this.detalhe.add(labelTelefone);
		this.detalhe.add(valorDDD);
		this.detalhe.add(valorTelefone);
		this.detalhe.add(exclusao);
		this.detalhe.add(botaoSalvarProf);
		this.detalhe.setLayout(null);
		this.detalhe.setSize(400, 250);
		this.detalhe.setVisible(true);

		botaoSalvarProf.addActionListener(this);
		novoDado[0] = Integer.toString(i);
		novoDado[1] =  valorNome.getText();
		novoDado[2] =  valorHoraAula.getText();
		novoDado[3] =  valorCPF.getText();
		novoDado[4] =  valorID.getText();
		novoDado[5] =  valorDDD.getText();
		novoDado[6] =  valorTelefone.getText();
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == cadastro)
			new ViewCadastro().inserir(tipo, dados);
		
	}

	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		
		if(src == listaAlunosCadastrados)
			mostrarDetalhesAluno(listaAlunosCadastrados.getSelectedIndex());
		
		if(src == listaProfsCadastrados)
			mostrarDetalhesProfessor(listaProfsCadastrados.getSelectedIndex());
	}

}




