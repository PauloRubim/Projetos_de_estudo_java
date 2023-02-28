package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import excecao.ConexaoException;
import gui.TelaAdm;
import fachade.Fachada;
import conexao.Administrador;

public class TelaCadastroGestor extends JFrame {

	private JPanel contentPane;
	private JTextField nome;
	private JTextField cpf;
	private JPasswordField senha;

	/**
	 * Create the frame.
	 */
	public TelaCadastroGestor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 345);
		setTitle("Lavanderia");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(232,232,232));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastrarNovoGestor = new JLabel("CADASTRAR NOVO ADM");
		lblCadastrarNovoGestor.setForeground(new Color(100, 149, 237));
		lblCadastrarNovoGestor.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 20));
		lblCadastrarNovoGestor.setBounds(157, 44, 298, 25);
		contentPane.add(lblCadastrarNovoGestor);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(110, 115, 61, 16);
		contentPane.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(120, 142, 61, 32);
		contentPane.add(lblCpf);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(110, 185, 61, 16);
		contentPane.add(lblSenha);
		
		nome = new JTextField();
		nome.setBounds(156, 109, 292, 28);
		contentPane.add(nome);
		nome.setColumns(10);
		
		cpf = new JTextField();
		cpf.setBounds(156, 145, 134, 28);
		contentPane.add(cpf);
		cpf.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaAdm telaAdm = new TelaAdm();
				telaAdm.setVisible(true);
			}
		});
		btnCancelar.setBounds(64, 234, 117, 29);
		contentPane.add(btnCancelar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent arg0) {
				limpar();
			}
		});
		btnLimpar.setBounds(191, 234, 117, 29);
		contentPane.add(btnLimpar);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				try{
					float data = 0;
					String senhaString = senha.getText();
					if(senhaString.trim().equals("")){
						JOptionPane.showMessageDialog(null, "Digite uma senha", "", JOptionPane.ERROR_MESSAGE);
					}else{
					Administrador gestor = new Administrador(nome.getText(), cpf.getText(), String.copyValueOf(senha.getPassword()));
					Fachada.getInstance().cadastrar(gestor);
					JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!", "Cadastro Gestor", JOptionPane.INFORMATION_MESSAGE);
					limpar();
					}
				} catch(ConexaoException e2){
					JOptionPane.showMessageDialog(null, e2.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnConfirmar.setBounds(318, 234, 117, 29);
		contentPane.add(btnConfirmar);
		
		senha = new JPasswordField();
		senha.setBounds(156, 183, 134, 25);
		contentPane.add(senha);
	}
	private void limpar(){
		nome.setText("");
		cpf.setText("");
		senha.setText("");
	}
}
