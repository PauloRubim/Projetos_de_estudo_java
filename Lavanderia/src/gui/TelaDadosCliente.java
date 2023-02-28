package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

import fachade.Fachada;

public class TelaDadosCliente <T> extends JFrame {
	
	

	
	
	
	
	private JList listaDeClientes;
	private JPanel contentPane;
	
	public TelaDadosCliente() {
		
		this.setLayout(null);
		this.setSize(1000,600);
		listaDeClientes = new JList();
		listaDeClientes.setLayout(null);
		listaDeClientes.setSize(null);
		listaDeClientes.setListData(Fachada.getInstance().listarClientes().toArray());
		this.add(listaDeClientes);
		
	}
	
	public TelaDadosCliente(T objeto ){
		
	
			this.setLayout(null);
			this.setSize(1000,600);
			listaDeClientes = new JList();
			listaDeClientes.setLayout(null);
			listaDeClientes.setSize(1200,1200);
			DefaultListModel modelo = new DefaultListModel<T>();
			modelo.addElement(objeto);
			listaDeClientes.setModel(modelo);
			this.add(listaDeClientes);
	}
	


	
	
	
	
	
	
}
