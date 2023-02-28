package conexao;

import java.sql.Date;

public class Administrador {
    private int Id;
    private String Nome;
    private int Idade;
    private String Cpf;

    public Administrador(String text, String text0, String copyValueOf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Administrador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Funcionario{" + "Id=" + Id + ", Nome=" + Nome + ", Idade=" + Idade +  ", Cpf=" + Cpf + "\n"+ '}';
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

    public int getIdade() {
	return Idade;
    }

    public void setIdade(int Idade) {
	this.Idade = Idade;
    }
    
    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }


}
