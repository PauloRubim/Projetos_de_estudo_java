package main;

import excecao.ConexaoException;
import fachade.Fachada;
import conexao.Cliente;
import conexao.Administrador;

public class Test {

	public static void main(String[] args) {
		Administrador gestor = new Administrador("Italo","1", "1");
		Cliente cliente1 = new Cliente("Fernando","45856882695","Rua Tal", "81988754517",20,1646041121,3,122);
	    
		try {
			Fachada.getInstance().cadastrar(cliente1);
			System.out.println("Cadastro com sucesso!");
			Fachada.getInstance().cadastrar(gestor);
		} catch (ConexaoException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
