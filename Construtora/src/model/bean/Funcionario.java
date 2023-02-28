package model.bean;

import java.sql.Date;

public class Funcionario {
    private int Id;
    private String Nome;
    private String Sexo;
    private java.sql.Date DataNascimento;
    private double Salario;
    private String Cpf;
    private boolean Disponibilidade;
    private int Id_Construcao;

    @Override
    public String toString() {
        return "Funcionario{" + "Id=" + Id + ", Nome=" + Nome + ", Sexo=" + Sexo + ", DataNascimento="
                + DataNascimento + ", Salario=" + Salario + ", Cpf=" + Cpf + ", Disponibilidade="
                + Disponibilidade + ", Id_Construcao=" + Id_Construcao + "\n"+ '}';
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

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public Date getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(Date DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public boolean isDisponibilidade() {
        return Disponibilidade;
    }

    public void setDisponibilidade(boolean Disponibilidade) {
        this.Disponibilidade = Disponibilidade;
    }

    public int getId_Construcao() {
        return Id_Construcao;
    }

    public void setId_Construcao(int Id_Construcao) {
        this.Id_Construcao = Id_Construcao;
    }
}
