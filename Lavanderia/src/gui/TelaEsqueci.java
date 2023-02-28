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
import fachade.Fachada;
import gui.TelaCliente;
import gui.TelaPrincipal;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaEsqueci extends JFrame{
	private JPanel contentPane;
	private JPasswordField senha;
	private JTextField numeroCartao;
	


public TelaEsqueci() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 512, 345);
	setTitle("Lavanderia");
	contentPane = new JPanel();
	contentPane.setBackground(new Color(255, 255, 255));
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
   


	JLabel lblCpf = new JLabel("DIGITE SUA SENHA:");
	lblCpf.setForeground(new Color(100, 149, 237));
	lblCpf.setBackground(new Color(255, 140, 0));
	lblCpf.setFont(new Font("Consolas", Font.PLAIN, 18));
	lblCpf.setBounds(30, 120, 288, 29);
	contentPane.add(lblCpf);
	
	senha = new JPasswordField();
	senha.setBounds(30, 140, 308, 28);
	contentPane.add(senha);
	senha.setColumns(10);

	JLabel lblNumeroCartao = new JLabel("DIGITE O NUMERO DE CONTATO:");
	lblNumeroCartao.setForeground(new Color(100, 149, 237));
	lblNumeroCartao.setBackground(new Color(255, 140, 0));
	lblNumeroCartao.setFont(new Font("Consolas", Font.PLAIN, 18));
	lblNumeroCartao.setBounds(30, 30, 288, 29);
	contentPane.add(lblNumeroCartao);
	
	numeroCartao = new JTextField();
	numeroCartao.setBounds(30, 60, 308, 28);
	contentPane.add(numeroCartao);
	numeroCartao.setColumns(10); 
	
	
	
	JButton btnEnter = new JButton("Entrar");
	btnEnter.addActionListener(new ActionListener() {
                @Override
		public void actionPerformed(ActionEvent e) {
                    int numero = (int) Integer.valueOf(senha.getText());
                    String numero1 = (numeroCartao.getText());
                    TelaCliente telaCliente = null;
                    try {
                        telaCliente = new TelaCliente(Fachada.getInstance().loginCliente1(numero,numero1));
                    } catch (ConexaoException ex) {
                        Logger.getLogger(TelaEsqueci.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    setVisible(false);
                    telaCliente.setVisible(true);
		}
	});
	btnEnter.setForeground(new Color(119, 136, 153));
	btnEnter.setBackground(Color.WHITE);
	btnEnter.setBounds(255, 205, 117, 29);
	contentPane.add(btnEnter);


	JButton btnCancelar = new JButton("Cancelar");
	btnCancelar.addActionListener(new ActionListener() {
                @Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			TelaPrincipal telaPrincipal = new TelaPrincipal();
			telaPrincipal.setVisible(true);
		}
	});
	btnCancelar.setForeground(new Color(119, 136, 153));
	btnCancelar.setBounds(128, 205, 117, 29);
	contentPane.add(btnCancelar);




}
}
