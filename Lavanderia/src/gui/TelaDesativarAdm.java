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
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaDesativarAdm extends JFrame {

	private JPanel contentPane;
	private JTextField cpf;

	/**
	 * Create the frame.
	 */
	public TelaDesativarAdm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 463, 301);
		setTitle("Lavanderia");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(232,232,232));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDesativarAdm = new JLabel("DESATIVAR ADM");
		lblDesativarAdm.setForeground(new Color(100, 149, 237));
		lblDesativarAdm.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 20));
		lblDesativarAdm.setBounds(125, 60, 212, 33);
		contentPane.add(lblDesativarAdm);
		
		JLabel lblDigiteOCpf = new JLabel("Digite o CPF do Adm:");
		lblDigiteOCpf.setBounds(73, 129, 157, 16);
		contentPane.add(lblDigiteOCpf);
		
		cpf = new JTextField();
		cpf.setBounds(200, 123, 170, 28);
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
		btnCancelar.setBounds(113, 196, 117, 29);
		contentPane.add(btnCancelar);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
                            try {
                                Fachada.getInstance().desativarGestor(cpf.getText());
                            } catch (ConexaoException ex) {
                                Logger.getLogger(TelaDesativarAdm.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            JOptionPane.showMessageDialog(null, "Administrador Removido!", "Desativar Administrador", JOptionPane.INFORMATION_MESSAGE);
                            limpar();
			}
		});
		btnConfirmar.setBounds(235, 196, 117, 29);
		contentPane.add(btnConfirmar);
	}
	private void limpar(){
		cpf.setText("");
	}

}
