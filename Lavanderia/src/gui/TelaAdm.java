package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import gui.TelaCadastroCliente;
import gui.TelaCadastroGestor;
import gui.TelaDesativarAdm;
import gui.TelaDesativarCliente;
import gui.TelaOpCliente;
import gui.TelaPrincipal;
import gui.TelaRecarga;
import conexao.Cliente;

public class TelaAdm extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public TelaAdm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 345);
		setSize(500,500);
		setTitle("Lavanderia");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(232,232,232));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastrarCliente = new JButton("CADASTRAR CLIENTE");
		btnCadastrarCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				TelaCadastroCliente telaCadastroCliente = new TelaCadastroCliente();
				telaCadastroCliente.setVisible(true);
			}
		});
		btnCadastrarCliente.setForeground(new Color(105, 105, 105));
		btnCadastrarCliente.setBounds(65, 84, 186, 83);
		contentPane.add(btnCadastrarCliente);
		
		

		JButton btnDadosCliente = new JButton("DADOS CLIENTE");
		btnDadosCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				TelaOpCliente telaOpCliente =  new TelaOpCliente();
				telaOpCliente.setVisible(true);
			}
		});
		btnDadosCliente.setForeground(new Color(105, 105, 105));
		btnDadosCliente.setBounds(261, 272, 186, 83);
		contentPane.add(btnDadosCliente);
		
		
		
		
		
		JButton btnCadastrarGestor = new JButton("CADASTRAR ADM");
		btnCadastrarGestor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
				TelaCadastroGestor telaCadastroGestor = new TelaCadastroGestor();
				telaCadastroGestor.setVisible(true);
			}
		});
		btnCadastrarGestor.setForeground(new Color(105, 105, 105));
		btnCadastrarGestor.setBounds(261, 84, 186, 83);
		contentPane.add(btnCadastrarGestor);
		
		JButton btnDesativarAdm = new JButton("DESATIVAR ADM");
		btnDesativarAdm.addMouseListener(new MouseAdapter() {
                @Override
		public void mouseClicked(MouseEvent e){
			setVisible(false);
			TelaDesativarAdm telaDesativarAdm = new TelaDesativarAdm();
			telaDesativarAdm.setVisible(true);
		}
		});
		btnDesativarAdm.setForeground(new Color(105,105,105));
		btnDesativarAdm.setBounds(65,272,186,83);
		contentPane.add(btnDesativarAdm);
		
		JButton btnDesativarCliente = new JButton("DESATIVAR CLIENTE");
		btnDesativarCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				TelaDesativarCliente telaDesativarCliente = new TelaDesativarCliente();
				telaDesativarCliente.setVisible(true);
			}
		});
		btnDesativarCliente.setForeground(new Color(105, 105, 105));
		btnDesativarCliente.setBounds(65, 178, 186, 83);
		contentPane.add(btnDesativarCliente);
		
	
		JButton btnRecarregamento = new JButton("RECARREGA");
		btnRecarregamento.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				Cliente cliente = null;
				TelaRecarga telaRecarga = new TelaRecarga(cliente);
				telaRecarga.setVisible(true);
			}
		});
		btnRecarregamento.setForeground(new Color(105, 105, 105));
		btnRecarregamento.setBounds(261, 178, 186, 83);
		contentPane.add(btnRecarregamento);
		
		JLabel lblPortalDoAdministrador = new JLabel("TELA ADMINISTRADOR");
		lblPortalDoAdministrador.setForeground(new Color(100, 149, 237));
		lblPortalDoAdministrador.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lblPortalDoAdministrador.setBounds(175, 42, 289, 16);
		contentPane.add(lblPortalDoAdministrador);
		
		
		
		JButton btnSair = new JButton("Sair");
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				TelaPrincipal telaPrincipal = new TelaPrincipal();
				telaPrincipal.setVisible(true);
			}
		});
		btnSair.setForeground(new Color(169, 169, 169));
		btnSair.setBackground(UIManager.getColor("Button.background"));
		btnSair.setBounds(23, 400, 109, 27);
		contentPane.add(btnSair);
		
		
	}
}

