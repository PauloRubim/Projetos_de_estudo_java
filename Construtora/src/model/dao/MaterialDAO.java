package model.dao;

import java.sql.Connection;
import model.bean.Material;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MaterialDAO {
   private EstabelecerConexao con;

    public MaterialDAO(EstabelecerConexao con) {
        this.con = con;
    }
    
    public ArrayList<Material> RecuperaTudo(){
        
        try{
            String SQL = ("SELECT * FROM Material;");
            PreparedStatement ps = con.getConnection().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            ArrayList<Material> lista = new ArrayList();
            while(rs.next()){
                Material mat = new Material();
                mat.setId(rs.getInt("Id"));
                mat.setNome(rs.getString("Nome"));
                mat.setEstoque(rs.getInt("Estoque"));
                mat.setFornecedor(rs.getString("Fornecedor"));
                mat.setPreco(rs.getDouble("Preco"));
                lista.add(mat);
            }
            System.out.println("Dados Recuperados");
            rs.close();
            con.EncerrarConexao();
            return lista;
        }catch(SQLException ex){
            System.err.println("Erro SQLException" + ex.getMessage());
        }catch(Exception ex){
            System.err.println("Erro Exception" + ex.getMessage());
        }
        
        return null;
    }

    public void AdicionaMaterial(Material mat){
        try{
            String SQL = "INSERT INTO Material (Nome,Fornecedor,Estoque,Preco) VALUES ("+"'"+ mat.getNome() +"','"+ mat.getFornecedor() +"'," + mat.getEstoque()+"," + mat.getPreco()    +     ")";
            PreparedStatement ps = con.getConnection().prepareStatement(SQL);
            ps.executeUpdate();
            System.out.println("Material Inserido.");
            con.EncerrarConexao();
            ps.close();
        }catch(Exception ex){
            System.err.println("Erro Exception:"+ex.getMessage());
        }
    }
    public void AtualizarMaterial(Material mat){
        try{
            String SQL = "UPDATE Material SET Nome = ?, Fornecedor= ?, Estoque = ?, Preco = ? WHERE Id = ?";
            PreparedStatement ps = con.getConnection().prepareStatement(SQL);
            ps.setString(1,mat.getNome());
            ps.setString(2,mat.getFornecedor());
            ps.setInt(3,mat.getEstoque());
            ps.setDouble(4,mat.getPreco());
            ps.setInt(5,mat.getId());
            ps.executeUpdate();
            System.out.println("Atualizado com sucesso.");
            ps.close();
            con.EncerrarConexao();
        }catch(SQLException ex){
            System.err.println("Erro SQLException:"+ex.getMessage());
        }catch(Exception ex){
            System.err.println("Erro Exception:"+ex.getMessage());
        }
    } 
     public void DeletarMaterial(int Id){
        try{
            String SQL = "DELETE FROM Material where Id = ?";
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
