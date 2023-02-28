package fachade;

import java.util.ArrayList;

import excecao.ConexaoException;
import fachade.Fachada;
import conexao.Cliente;
import conexao.Administrador;
import conexao.ClienteDAO;
import conexao.AdministradorDAO;

public class Fachada {

	private static Fachada instance = null;
	private ClienteDAO cliente;
	private AdministradorDAO gestor;
	
	private Fachada(){
		this.cliente = new ControladorCliente();
		this.gestor = new ControladorGestor();
	}

	public static Fachada getInstance(){
		if (instance == null){
			instance = new Fachada();
		}
		return instance;
	}
	
	public void cadastrar(Cliente cliente) throws ConexaoException{
		this.cliente.AdicionarCliente(cliente);
	}
	
	public void creditar(int codigo, double valor) throws ConexaoException{
		this.cliente.creditar(codigo, valor);
	}
	
	public void debitar(int codigo, double valor)throws ConexaoException{
		this.cliente.debitar(codigo, valor);
	}
  
	
	public void cadastrar(Administrador gestor) throws ConexaoException{
		this.gestor.AdicionaFuncionario(gestor);
	}
	
	public boolean loginGestor(String login, String senha) throws ConexaoException{
		boolean resultado = false;
				for(int i = 0; i < gestor.listarGestores.size(); i++){
						if(gestor.listarGestores.get(i).getCpf().equals(login) && gestor.listarGestores().get(i).getSenha().equals(senha)){
							resultado = true;
						}
				}
		if(resultado == true){
			return true;
		}else{
			throw new ConexaoException("LOGIN/SENHA INCORRETOS!");
		}
			
	}
	
	public Cliente loginCliente(int codigo) throws ConexaoException{
		Cliente cliente = null;
		for(int i = 0; i <this.cliente.listarClientes().size(); i++){
			if(this.cliente.listarClientes().get(i).getCardNumber()==codigo){
				cliente = this.cliente.listarClientes().get(i);
			}
		}
		if(cliente != null){
			return cliente;
		}else{
			throw new ConexaoException("VOCE NAO ESTA CADASTRADO!");
		}
	}
	

	public Cliente loginCliente1(int codigo, String numContato) throws ConexaoException{
		Cliente cliente = null;
		for(int i = 0; i <this.cliente.listarClientes().size(); i++){
			if(this.cliente.listarClientes().get(i).getSenha()==codigo && this.cliente.listarClientes().get(i).getNumContato().equals(numContato)){
				cliente = this.cliente.listarClientes().get(i);
			}
		}
		if(cliente != null){
			return cliente;
		}else{
			throw new ConexaoException("VOCE NAO ESTA CADASTRADO!");
		}
	}
	
	
	
	public void desativar(String cpf) throws ConexaoException{
		this.cliente.desativar(cpf);
	}
	public void desativarGestor(String cpf) throws ConexaoException{
		this.gestor.desativar(cpf);
	}
	
	public void atualizarGestor(Administrador gestor) throws ConexaoException{
		this.gestor.atualizarGestor(gestor);
	}
	
	public void atualizarCliente(Cliente cliente) throws ConexaoException{
		this.cliente.AtualizarCliente(cliente);
	}
	public ArrayList<Cliente> listarClientes(){
		return this.cliente.listarClientes();
	}
   
	public Cliente procurarPorParametro(String parametro) throws ConexaoException{
		Cliente resultado = null;
		if(this.cliente.recebenome(parametro) != null){
			return this.cliente.recebenome(parametro);
		}
		if(this.cliente.recebecpf(parametro) != null){
			return this.cliente.recebecpf(parametro);
		}
		if(this.cliente.recebeint((int) Integer.parseInt(parametro)) != null){
				
				return this.cliente.recebeint((int) Integer.parseInt(parametro));
		}
		
		
		if(resultado != null){
			return resultado;
		}
		else
			throw new ConexaoException("Nenhum resultado encontrado");
	}
	
	
	
	
	



}	


