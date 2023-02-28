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
import gui.TelaPrincipal;
import fachade.Fachada;

public class TelaLoginAdm extends JFrame {

	private JPanel contentPane;
	private JTextField loginTexto;
	private JPasswordField senhaTexto;

	/**
	 * Create the frame.
	 */
	public TelaLoginAdm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 345);
		setTitle("Lavanderia");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(232,232,232));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAcessoAdministrador = new JLabel("ACESSO ADM");
		lblAcessoAdministrador.setForeground(new Color(0, 191, 255));
		lblAcessoAdministrador.setFont(new Font("Serif", Font.ROMAN_BASELINE, 28));
		lblAcessoAdministrador.setBounds(197, 53, 300, 30);
		contentPane.add(lblAcessoAdministrador);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setForeground(new Color(47, 79 ,79));
		lblLogin.setBounds(154, 144, 61, 16);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(new Color(47, 79 ,79));
		lblSenha.setBounds(154, 181, 41, 16);
		contentPane.add(lblSenha);
		
		loginTexto = new JTextField();
		loginTexto.setBounds(207, 135, 153, 35);
		contentPane.add(loginTexto);
		loginTexto.setColumns(10);
		
		senhaTexto = new JPasswordField();
		senhaTexto.setBounds(207, 172, 153, 35);
		contentPane.add(senhaTexto);
		
		JButton btnEnter = new JButton("Entrar");
		btnEnter.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				
					String usuario = loginTexto.getText();
					String senha = senhaTexto.getText();
				
					try {
						if(Fachada.getInstance().loginGestor(usuario, senha)){
							setVisible(false);
							TelaAdm telaAdm = new TelaAdm();
							telaAdm.setVisible(true);
						}
					} catch (ConexaoException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
					}
			}
		});
		btnEnter.setForeground(new Color(46 ,139 ,87));
		btnEnter.setBounds(276, 234, 117, 29);
		contentPane.add(btnEnter);
		
		JButton btnCancelar = new JButton("Sair");
		btnCancelar.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaPrincipal telaPrincipal = new TelaPrincipal();
				telaPrincipal.setVisible(true);
			}
		});
		btnCancelar.setForeground(new Color(139, 0 ,0));
		btnCancelar.setBounds(149, 234, 117, 29);
		contentPane.add(btnCancelar);
		
	
	}
}
