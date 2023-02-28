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
import javax.swing.border.EmptyBorder;

import excecao.ConexaoException;
import gui.TelaNumeroCartao;
import gui.TelaSaldo;
import fachade.Fachada;
import conexao.Cliente;

public class TelaCliente extends JFrame {

	private JPanel contentPane;
	private Cliente cliente;
	/**
	 * Create the frame.
	 */
	public TelaCliente(final Cliente cliente) {
		this.cliente = cliente;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 150, 550, 400);
		setTitle("Lavanderia");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(232,232,232));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel verificarsaldo = new JLabel("SEU SALDO É DE:");
		verificarsaldo.setLayout(null);
		verificarsaldo.setVisible(true);
		verificarsaldo.setBounds(70,13, 100,70);
		this.add(verificarsaldo);
		verificarsaldo.setText("Saldo:  " + this.cliente.getSaldo());
		
		JLabel lblSelecioneAOpo = new JLabel("SELECIONE A OPCAO DESEJADA:");
		lblSelecioneAOpo.setBackground(new Color(100, 149, 237));
		lblSelecioneAOpo.setForeground(new Color(100, 149, 237));
		lblSelecioneAOpo.setFont(new Font("Consolas", Font.BOLD, 18));
		lblSelecioneAOpo.setBounds(126, 13, 270, 36);
		contentPane.add(lblSelecioneAOpo);
		
		
		
		JButton btnTimer = new JButton("Máquina de Lavar 5KG (R$6.00)");
		btnTimer.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				try{
					
					Fachada.getInstance().debitar(cliente.getCardNumber(), 6.0);
					Fachada.getInstance().atualizarCliente(cliente);
					TelaSaldo telaSaldo = new TelaSaldo(cliente.getSaldo());
					setVisible(false);
					telaSaldo.setVisible(true);
				}catch(ConexaoException e2){
					JOptionPane.showMessageDialog(null, e2.getMessage(), "", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnTimer.setForeground(new Color(112, 128, 144));
		btnTimer.setBounds(30, 80, 230, 80);
		contentPane.add(btnTimer);
		
		JButton btnTimer1 = new JButton("Máquina de Lavar 10kg (R$7.50)");
		btnTimer1.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				try{
					Fachada.getInstance().debitar(cliente.getCardNumber(), 7.5);
					Fachada.getInstance().atualizarCliente(cliente);
					TelaSaldo telaSaldo = new TelaSaldo(cliente.getSaldo());
					setVisible(false);
					telaSaldo.setVisible(true);
				}catch(ConexaoException e2){
					JOptionPane.showMessageDialog(null, e2.getMessage(), "", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnTimer1.setForeground(new Color(112, 128, 144));
		btnTimer1.setBounds(30, 180, 230, 80);
		contentPane.add(btnTimer1);
		
		
		
	    JButton btnTimer2 = new JButton("Secadora 5Kg (R$5,50)");
		btnTimer2.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				try{
					Fachada.getInstance().debitar(cliente.getCardNumber(), 5.5);
					Fachada.getInstance().atualizarCliente(cliente);
					TelaSaldo telaSaldo = new TelaSaldo(cliente.getSaldo());
					setVisible(false);
					telaSaldo.setVisible(true);
			
				}catch(ConexaoException e2){
					JOptionPane.showMessageDialog(null, e2.getMessage(), "", JOptionPane.ERROR_MESSAGE);
				} 
				}
			}
		);
		btnTimer2.setForeground(new Color(112, 128, 144));
		btnTimer2.setBounds(280, 80, 230, 80);
		contentPane.add(btnTimer2);
		
		
		
		
		 JButton btnTimer3 = new JButton("Secadora 10Kg (R$7,00)");
			btnTimer3.addActionListener(new ActionListener() {
                                @Override
				public void actionPerformed(ActionEvent e) {
					try{
						Fachada.getInstance().debitar(cliente.getCardNumber(), 7.0);
						TelaSaldo telaSaldo = new TelaSaldo(cliente.getSaldo());
						setVisible(false);
						telaSaldo.setVisible(true);
				
					}catch(ConexaoException e2){
						JOptionPane.showMessageDialog(null, e2.getMessage(), "", JOptionPane.ERROR_MESSAGE);
					} 
					}
				}
			);
			btnTimer3.setForeground(new Color(112, 128, 144));
			btnTimer3.setBounds(280, 180, 230, 80);
			contentPane.add(btnTimer3);
		
			
		
		

		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaNumeroCartao telaNumeroCartao = new TelaNumeroCartao();
				telaNumeroCartao.setVisible(true);
			}
		});
		btnCancelar.setBounds(5, 320, 117, 29);
		contentPane.add(btnCancelar);
		
	}

	
	
}

