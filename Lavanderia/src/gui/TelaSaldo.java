package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import gui.TelaTempo;

public class TelaSaldo extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public TelaSaldo(double saldo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 345);
		setTitle("Fast Laundry");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBoaRefeio = new JLabel("Pronto Para Começar!");
		lblBoaRefeio.setForeground(new Color(100, 149, 247));
		lblBoaRefeio.setFont(new Font("Consolas", Font.BOLD, 25));
		lblBoaRefeio.setBounds(90, 68, 600, 66);
		contentPane.add(lblBoaRefeio);
		
		JLabel lblSaldo = new JLabel("SALDO DISPONIVEL:");
		lblSaldo.setFont(new Font("Consolas", Font.BOLD, 25));
		lblSaldo.setForeground(new Color(46, 139, 87));
		lblSaldo.setBounds(53, 162, 238, 31);
		contentPane.add(lblSaldo);
		
		JTextPane infoSaldo = new JTextPane();
		infoSaldo.setForeground(new Color(0, 100, 0));
		infoSaldo.setFont(new Font("Consolas", Font.PLAIN, 30));
		infoSaldo.setEditable(false);
		infoSaldo.setBackground(new Color(255, 255, 255));
		infoSaldo.setBounds(301, 151, 200, 40);
		contentPane.add(infoSaldo);
		infoSaldo.setText(String.valueOf(saldo));
		
		JButton btnSair = new JButton("Iniciar");
		btnSair.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaTempo telaTempo = new TelaTempo();
				telaTempo.setVisible(false);
			}
		});
		btnSair.setForeground(new Color(169, 169, 169));
		btnSair.setBounds(194, 244, 138, 42);
		contentPane.add(btnSair);
		
		
		
		}
	}
