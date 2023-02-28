package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import excecao.ConexaoException;
import gui.TelaAdm;
import gui.TelaDadosCliente;
import gui.TelaPrincipal;
import fachade.Fachada;
import conexao.Cliente;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaOpCliente extends JFrame {

	private JPanel contentPane;
	private JTextField numeroCartao;
	private JTextField valor;
	
	public TelaOpCliente() {
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 110, 512, 345);
		setTitle("Lavanderia");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(232,232,232));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRecarregarCarto = new JLabel("Informe cpf ou nome do cliente, ou número do cartão:");
		lblRecarregarCarto.setForeground(new Color(100, 149, 237));
		lblRecarregarCarto.setFont(new Font("Georgia", Font.BOLD, 17));
		lblRecarregarCarto.setBounds(10, 80, 500, 25);
		contentPane.add(lblRecarregarCarto);
		
		numeroCartao = new JTextField();
		numeroCartao.setBounds(20, 114, 200, 25);
		contentPane.add(numeroCartao);
		numeroCartao.setColumns(10);
		
		
		
		JButton btnSair = new JButton("Logout");
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				TelaPrincipal telaPrincipal = new TelaPrincipal();
				telaPrincipal.setVisible(true);
			}
		});
		btnSair.setForeground(new Color(112, 128, 144));
		btnSair.setBackground(UIManager.getColor("Button.background"));
		btnSair.setBounds(23, 200, 90, 27);
		contentPane.add(btnSair);
		
		
		
		
		
		JButton btnVoltar = new JButton("Cancelar");
		btnVoltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				TelaAdm telaAdm = new TelaAdm();
				telaAdm.setVisible(true);
			}
		});
		btnVoltar.setForeground(new Color(112, 128, 144));
		btnVoltar.setBackground(UIManager.getColor("Button.background"));
		btnVoltar.setBounds(230, 200, 100, 27);
		contentPane.add(btnVoltar);

		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {

				try{
					TelaDadosCliente<Cliente> telaDadosCliente = null;
                                    try {
                                        telaDadosCliente = new TelaDadosCliente<Cliente>
                                                (Fachada.getInstance().procurarPorParametro((numeroCartao.getText())));
                                    } catch (ConexaoException ex) {
                                        Logger.getLogger(TelaOpCliente.class.getName()).log(Level.SEVERE, null, ex);
                                    }
					telaDadosCliente.setVisible(true);
					setVisible(false);
				}catch(NumberFormatException e2){
					TelaDadosCliente<String> telaDadosCliente = new TelaDadosCliente<String>("nenhum resultado encontrado");
					telaDadosCliente.setVisible(true);
					setVisible(false);

				}
				}
			
		})
		
		;
		btnPesquisar.setBounds(250, 112, 95, 29);
		contentPane.add(btnPesquisar);

	
	}
	
	
	
	
}