package model.bean;

import java.sql.Date;
import java.util.ArrayList;

public class Construcao {
    private int Id;
    private String Nome;
    private java.sql.Date Data_Inicio;
    private java.sql.Date Data_Entrega;
    private String Endereco;

    @Override
    public String toString() {
        return "Construcao{" + "Id=" + Id + ", Nome=" + Nome + ", Data_Inicio=" + Data_Inicio + ", Data_Entrega=" + Data_Entrega + ", Endereco=" + Endereco +"\n"+ '}';
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

    public Date getData_Inicio() {
        return Data_Inicio;
    }

    public void setData_Inicio(Date Data_Inicio) {
        this.Data_Inicio = Data_Inicio;
    }

    public Date getData_Entrega() {
        return Data_Entrega;
    }

    public void setData_Entrega(Date Data_Entrega) {
        this.Data_Entrega = Data_Entrega;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }
}
