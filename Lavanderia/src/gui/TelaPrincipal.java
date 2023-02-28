package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import gui.TelaLoginAdm;
import gui.TelaNumeroCartao;
import gui.TelaPrincipal;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
                        @Override
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 345);
		setTitle("Lavanderia");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(232,232,232));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFastLaundry = new JLabel("Lavanderia");
		lblFastLaundry.setForeground(new Color(100, 149, 237));
		lblFastLaundry.setFont(new Font("Georgia", Font.PLAIN, 25));
		lblFastLaundry.setBounds(180, 37, 411, 56);
		contentPane.add(lblFastLaundry);
		
		JButton btnCliente = new JButton("Cliente");
		btnCliente.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaNumeroCartao telaNumeroCartao =  new TelaNumeroCartao();
				telaNumeroCartao.setVisible(true);
			}
		});
		btnCliente.setForeground(new Color(244, 164, 96));
		btnCliente.setBackground(UIManager.getColor("Button.background"));
		btnCliente.setBounds(101, 159, 155, 72);
		contentPane.add(btnCliente);
		
		JButton btnAdministrador = new JButton("Administrador");
		btnAdministrador.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
				TelaLoginAdm telaLoginAdm = new TelaLoginAdm();
				telaLoginAdm.setVisible(true);
			}
		});
		btnAdministrador.setForeground(new Color(178, 34, 34));
		btnAdministrador.setBounds(258, 159, 160, 72);
		contentPane.add(btnAdministrador);
		

        }
}