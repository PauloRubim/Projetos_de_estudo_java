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

import conexao.Cliente;

import excecao.ConexaoException;
import gui.TelaAdm;
import fachade.Fachada;
import conexao.Administrador;

public class TelaCadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField Nome;
	private JTextField Idade;
	private JPasswordField Senha;
        private JTextField CPF;
	private JLabel label;

	/**
	 * Create the frame.
	 */
	public TelaCadastroCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 130, 580, 450);
		setTitle("Lavanderia");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(232,232,232));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastrarNovoCliente = new JLabel("CADASTRAR NOVO CLIENTE");
		lblCadastrarNovoCliente.setForeground(new Color(100,149,237));
		lblCadastrarNovoCliente.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblCadastrarNovoCliente.setBounds(90, 8, 500, 16);
		contentPane.add(lblCadastrarNovoCliente);
		
		Nome = new JTextField();
		Nome.setBounds(125, 46, 359, 28);
		contentPane.add(Nome);
		Nome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(new Color(0, 0, 0));
		lblNome.setBounds(28, 52, 61, 16);
		contentPane.add(lblNome);
		
		CPF = new JTextField();
		CPF.setBounds(125, 84, 359, 28);
		contentPane.add(CPF);
		CPF.setColumns(10);

		JLabel lblIdade = new JLabel("Idade do cliente:");
		lblIdade.setBounds(28, 165, 132, 16);
		contentPane.add(lblIdade);
		
		Idade = new JTextField();
		Idade.setBounds(125, 160, 359, 28);
		contentPane.add(Idade);
		Idade.setColumns(10);
			
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(28, 235, 61, 16);
		contentPane.add(lblSenha);
		
                JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(28, 92, 61, 16);
		contentPane.add(lblCpf);
                
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaAdm telaAdm = new TelaAdm();
				telaAdm.setVisible(true);
			}
		});
		btnCancelar.setBounds(60, 320, 85, 29);
		contentPane.add(btnCancelar);

		label = new JLabel("");
		label.setBounds(171, 275, 304, 16);
		contentPane.add(label);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setBounds(157, 320, 75, 29);
		contentPane.add(btnLimpar);
	
		JButton btnGerarCdigo = new JButton("Gerar Codigo");
		btnGerarCdigo.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				 label.setText(String.valueOf(new Object().hashCode())); //transforma o codigo do cartao que tem retorno inteiro para String 
				 
			}
		});
		btnGerarCdigo.setBounds(247, 320, 109, 29);
		contentPane.add(btnGerarCdigo);
		
		JButton btnGerarCarto = new JButton("Cadastrar");
		btnGerarCarto.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				try {
					float data = 0;
					String dataString = Idade.getText();
					if(dataString.trim().equals("")){
						JOptionPane.showMessageDialog(null, "Digite a idade em numeros", "", JOptionPane.ERROR_MESSAGE);
					}else{
						data = Float.parseFloat(dataString);
						Cliente cliente = new Cliente(Nome.getText(), CPF.getText(),Integer.parseInt(Idade.getText()) ,Integer.parseInt(label.getText()), 0.0, Integer.parseInt(Senha.getText()));
						Fachada.getInstance().cadastrar(cliente);
						JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!", "Cadastro Aluno", JOptionPane.INFORMATION_MESSAGE);
						limpar();
					}
									
				} catch (ConexaoException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
				}				
			}
		});
		btnGerarCarto.setBounds(371, 320, 104, 29);
		contentPane.add(btnGerarCarto);
		
		JLabel lblC = new JLabel("CARD CODE:");
		lblC.setBounds(28, 275, 123, 16);
		contentPane.add(lblC);
		
	}
	private void limpar(){
		Nome.setText("");
		CPF.setText("");
		Idade.setText("");
		label.setText("");
		Senha.setText("");
	}
}

