package model.dao;

import java.sql.Connection;
import model.bean.Construcao;
import model.bean.Funcionario;
import model.bean.Material;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConstrucaoDAO {
    
    private EstabelecerConexao con;

    public ConstrucaoDAO(EstabelecerConexao con) {
        this.con = con;
    }

    public ArrayList<Construcao> RecuperaTudo() {
        try {
            String SQL = "SELECT * FROM Construcao; ";
            PreparedStatement ps = con.getConnection().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            ArrayList<Construcao> lista = new ArrayList();
            while (rs.next()) {
            Construcao construcao = new Construcao();
            construcao.setId(rs.getInt("Id"));
            construcao.setData_Inicio(rs.getDate("Data_Inicio"));
            construcao.setData_Entrega(rs.getDate("Data_Entrega"));
            construcao.setNome(rs.getString("Nome"));
            construcao.setEndereco(rs.getString("Endereco"));
            lista.add(construcao);
            }
            System.out.println("Dados Recuperados.");
            rs.close();
            con.EncerrarConexao();
            return lista;
        }catch(SQLException ex){
            System.err.println("Erro SQLException:"+ ex.getMessage() );
        }catch(Exception ex){
            System.err.println("Erro Exception:"+ex.getMessage());
        }
        return null;
    }
    
    public void AdicionarConstrucao(Construcao construcao){
        try{
            String SQL = "INSERT INTO Construcao (Id,Nome,Data_Inicio,Data_Entrega,Endereco) VALUES (" +construcao.getId()+",'"+construcao.getNome()+"','"+construcao.getData_Inicio()+"','"+construcao.getData_Entrega()+"','"+construcao.getEndereco()+ "');";
            PreparedStatement ps = con.getConnection().prepareStatement(SQL);
            ps.executeUpdate();
            System.out.println("Construcao Inserida");
            ps.close();
            con.EncerrarConexao();
        }catch(Exception ex){
            System.err.println("Erro Exception:"+ex.getMessage());        
        }
    }
    
    public void AtualizarConstrucao(Construcao construcao){
        try{
        String SQL= "UPDATE Construcao SET Nome = ? , Data_Inicio = ? , Data_Entrega = ?, Endereco = ? WHERE Id = ? ";
        PreparedStatement ps = con.getConnection().prepareStatement(SQL);
        ps.setString(1,construcao.getNome());
        ps.setDate(2,construcao.getData_Inicio());
        ps.setDate(3,construcao.getData_Entrega());
        ps.setString(4,construcao.getEndereco());
        ps.setInt(5,construcao.getId());
        ps.executeUpdate();
        System.out.println("Atualizado com sucesso!");
        ps.close();
        con.EncerrarConexao();
    }catch(SQLException ex){
        System.err.println("Erro SQLException:"+ex.getMessage());
    }catch(Exception ex){
        System.err.println("Erro Exception"+ex.getMessage());
    }
     
    }
     public void DeletarConstrucao(int Id){
        try{
            String SQL = "DELETE FROM Construcao where Id = ?";
            PreparedStatement ps = con.getConnection().prepareStatement(SQL);
            ps.setInt(1,Id);
            ps.executeUpdate();
            ps.close();
            System.out.println("Deletado com Sucesso.");
            con.EncerrarConexao();
        }catch(SQLException ex){
            System.err.println("Erro SQLException:"+ex.getMessage());
        }catch(Exception ex){
            System.err.println("Erro Exception:"+ex.getMessage());
        }
    }
    
}
