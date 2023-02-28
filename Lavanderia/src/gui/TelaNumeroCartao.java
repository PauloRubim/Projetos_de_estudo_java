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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import excecao.ConexaoException;
import gui.TelaCliente;
import gui.TelaEsqueci;
import gui.TelaPrincipal;
import fachade.Fachada;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaNumeroCartao extends JFrame {

	private JPanel contentPane;
	private JTextField numeroCartao;


	public TelaNumeroCartao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 345);
		setTitle("Lavanderia");		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDigiteONmero = new JLabel("DIGITE O NUMERO DO CARTAO:");
		lblDigiteONmero.setForeground(new Color(100, 149, 237));
		lblDigiteONmero.setBackground(new Color(255, 140, 0));
		lblDigiteONmero.setFont(new Font("Consolas", Font.PLAIN, 18));
		lblDigiteONmero.setBounds(113, 96, 288, 29);
		contentPane.add(lblDigiteONmero);
		
		numeroCartao = new JTextField();
		numeroCartao.setBounds(93, 149, 308, 28);
		contentPane.add(numeroCartao);
		numeroCartao.setColumns(10);
		
		JButton btnEnter = new JButton("Entrar");
		btnEnter.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
                            int numero = (int) Integer.parseInt(numeroCartao.getText());
                            TelaCliente telaCliente = null;
                            try {
                                telaCliente = new TelaCliente(Fachada.getInstance().loginCliente(numero));
                            } catch (ConexaoException ex) {
                                Logger.getLogger(TelaNumeroCartao.class.getName()).log(Level.SEVERE, null, ex);
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
		
		JButton btnEsqueci = new JButton("Esqueci");
		btnEsqueci.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaEsqueci telaesqueci = new TelaEsqueci();
				telaesqueci.setVisible(true);
			}
		});
		btnEsqueci.setForeground(new Color(119, 136, 153));
		btnEsqueci.setBounds(375, 270, 117, 29);
		contentPane.add(btnEsqueci);
	}
}
