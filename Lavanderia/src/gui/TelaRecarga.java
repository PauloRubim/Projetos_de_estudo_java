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
import gui.TelaAdm;
import fachade.Fachada;
import conexao.Cliente;

public class TelaRecarga extends JFrame {

	private JPanel contentPane;
	private JTextField numeroCartao;
	private JTextField valor;
	private Cliente cliente;
	/**
	 * Create the frame.
	 */
	public TelaRecarga(final Cliente cliente) {
	    this.cliente = cliente;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 345);
		setTitle("Lavanderia");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(232, 232, 232));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRecarregarCarto = new JLabel("RECARREGAR CARTAO");
		lblRecarregarCarto.setForeground(new Color(100, 149, 237));
		lblRecarregarCarto.setFont(new Font("Georgia", Font.BOLD, 20));
		lblRecarregarCarto.setBounds(140, 60, 255, 25);
		contentPane.add(lblRecarregarCarto);
		
		numeroCartao = new JTextField();
		numeroCartao.setBounds(219, 114, 192, 25);
		contentPane.add(numeroCartao);
		numeroCartao.setColumns(10);
		
		JLabel lblNmeroCarto = new JLabel("Card Number:");
		lblNmeroCarto.setBounds(135, 118, 121, 16);
		contentPane.add(lblNmeroCarto);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setBounds(184, 147, 61, 16);
		contentPane.add(lblValor);
		
		valor = new JTextField();
		valor.setBounds(220, 142, 134, 26);
		contentPane.add(valor);
		valor.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaAdm telaAdm = new TelaAdm();
				telaAdm.setVisible(true);
			}
		});
		btnCancelar.setBounds(72, 215, 117, 29);
		contentPane.add(btnCancelar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setBounds(199, 215, 117, 29);
		contentPane.add(btnLimpar);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				int codigo = (int)Integer.parseInt(numeroCartao.getText());
				double valor1 = (double)Double.parseDouble(valor.getText());
				try{
					Fachada.getInstance().creditar(codigo, valor1);
		
				JOptionPane.showMessageDialog(null, "Recarga feita com sucesso!", "Recarga", JOptionPane.INFORMATION_MESSAGE);
				setVisible(false);
				TelaAdm telaAdm = new TelaAdm();
				telaAdm.setVisible(true);
				}catch(ConexaoException e1){
					JOptionPane.showMessageDialog(null, e1.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnConfirmar.setBounds(326, 215, 117, 29);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.add(btnConfirmar);
	}
	
	private void limpar(){
		numeroCartao.setText("");
		valor.setText("");
	}
}
