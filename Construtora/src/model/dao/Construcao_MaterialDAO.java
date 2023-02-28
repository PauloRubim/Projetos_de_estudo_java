package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Construcao_Material;
import model.dao.EstabelecerConexao;

public class Construcao_MaterialDAO {

    private EstabelecerConexao con;

    public Construcao_MaterialDAO(EstabelecerConexao con) {
        this.con = con;
    }

    public ArrayList<Construcao_Material> RecuperarTudo() {
        try {
            String SQL = "SELECT * FROM Construcao_Material;";
            PreparedStatement ps = con.getConnection().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            ArrayList<Construcao_Material> lista = new ArrayList<Construcao_Material>();
            while (rs.next()) {
                Construcao_Material construcao_mat = new Construcao_Material();
                construcao_mat.setId(rs.getInt("Id"));
                construcao_mat.setId_Construcao(rs.getInt("Id_Construcao"));
                construcao_mat.setId_Material(rs.getByte("Id_Material"));
                lista.add(construcao_mat);
            }
            ps.close();
            con.EncerrarConexao();
            return lista;
        } catch (SQLException ex) {
            System.err.println("ERRO SQLException:" + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("ERRO Exception" + ex.getMessage());
        }
        return null;
    }

    public void AdicionaConstrucao_Material(Construcao_Material construcao_mat) {
        try {
            String SQL = "INSERT INTO Construcao_Material(Id_Construcao,Id_Material) Values (" + construcao_mat.getId_Construcao() + "," + construcao_mat.getId_Material() + ");";
            PreparedStatement ps = con.getConnection().prepareStatement(SQL);
            ps.executeUpdate();
            System.out.println("Construcao_Material inserido com sucesso.");
            con.EncerrarConexao();
        } catch (Exception ex) {
            System.err.println("Erro Exception:" + ex.getMessage());
        }
    }
    
    public void AtualizarConstrucao_Material(Construcao_Material construcaomat){
        try{
            String SQL = "UPDATE Construcao_Material SET Id_Construcao = ?, Id_Material = ? WHERE Id = ?";
            PreparedStatement ps = con.getConnection().prepareStatement(SQL);
            ps.setInt(1,construcaomat.getId_Construcao());
            ps.setInt(2,construcaomat.getId_Material());
            ps.setInt(3,construcaomat.getId());
            ps.executeUpdate();
            ps.close();
            System.out.println("Atualizado com sucesso.");
            con.EncerrarConexao();
        }catch(SQLException ex){
            System.err.println("Erro SQLException:"+ex.getMessage());
        }catch(Exception ex){
            System.err.println("Erro Exception:"+ex.getMessage());
        }
    }
     public void DeletarConstrucao_Material(int Id){
        try{
            String SQL = "DELETE FROM Construcao_Material where Id = ?";
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
