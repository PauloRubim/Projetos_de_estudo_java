package conexao;

import java.util.ArrayList;

public class Cliente {
    private int Id;
    private String Nome;
    private String Cpf;
    private String Endereco;
    private int Idade;
    private int Contato;
    private int Senha;
    private int CardNumber;
    private double Saldo;
    
    private ArrayList<Cliente> listaDeCliente;

    public Cliente(String text, String text0, int parseInt, int parseInt0, double d, int parseInt1) {
       
    }

    Cliente() {
       
    }

      
    @Override
    public String toString() {
        return "Cliente{" + "Id=" + Id + ", Nome=" + Nome + ", Cpf=" + Cpf + ", Endereco=" + Endereco + ", Idade=" + Idade + ", Contato=" + Contato + ", Senha=" + Senha +  ", CardNumber=" + CardNumber +", Saldo=" + Saldo +"\n"+ '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    public String getCpf() {
        return Cpf;
    }
    
    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }
    
    public void setEnderco(String Endereco) {
        this.Endereco = Endereco;
    }
    
    public String getEndereco() {
        return Endereco;
    }
    
    public int getIdade() {
	return Idade;
    }

    public void setIdade(int Idade) {
	this.Idade = Idade;
    }
    
    public int getContato() {
	return Contato;
    }

    public void setContato(int Contato) {
	this.Contato = Contato;
    }

    public int getSenha(){
        return Senha;
    }

    public void setSenha(int Senha) {
	this.Senha = Senha;
    }
    
    public int getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.CardNumber = cardNumber;
    }
    
    public double getSaldo() {
	return Saldo;
    }

    public void setSaldo(double Saldo) {
	this.Saldo = Saldo;
    }
    
    public ArrayList<Cliente> listarClientes() {
	return this.listaDeCliente;
    }

    public boolean existe(Cliente cliente) {
	boolean resultado = false;
	for(int i = 0; i < this.listaDeCliente.size(); i++){
		if(this.listaDeCliente.get(i).getCpf().equals(cliente.getCpf())){
			resultado = true;
	}
	} return resultado;
    }
    
    /**
     *
     * @return
     */
	public void inserirCliente(Cliente cliente) {
		this.listaDeCliente.add(cliente);
		
	}

	public void remover(Cliente cliente) {
		this.listaDeCliente.remove(cliente);
		
	}
	
	private int procurarIndice(Cliente cliente){
		int resultado =-1;
		for(int i = 0; i < this.listaDeCliente.size(); i++){
			if(listaDeCliente.get(i).getCpf().equals(cliente.getCpf())){
				resultado = i;
			}
		}
		return resultado;
	}
		
	public boolean equals(Cliente a, Cliente B) {
		// TODO Auto-generated method stub
		return false;
	}

	public void atualizar(Cliente cliente) {
		this.listaDeCliente.set(procurarIndice(cliente), cliente);
		
	}    
}
