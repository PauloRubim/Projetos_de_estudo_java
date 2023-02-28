package conexao;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;

public class AdministradorDAO {

    private EstabelecerConexao con;

    public AdministradorDAO(EstabelecerConexao con) {
        this.con = con;
    }

    public ArrayList<Administrador> RecuperarTudo() {
        try {
            String SQL = "SELECT * FROM Funcionario;";
            PreparedStatement ps = con.getConnection().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            ArrayList<Administrador> lista = new ArrayList<Administrador>();
            while (rs.next()) {
                Administrador fun = new Administrador();
                fun.setId(rs.getInt("Id"));
                fun.setNome(rs.getString("Nome"));
                fun.setIdade(rs.getInt("Idade"));
                fun.setCpf(rs.getString("Cpf"));
                lista.add(fun);
            }
            System.out.println("Dados Recuperados.");
            rs.close();
            con.EncerrarConexao();
            return lista;
        } catch (SQLException ex) {
            System.err.println("Erro SQLException:" + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("Erro Exception:" + ex.getMessage());
        }
        return null;
    }
    
    public Administrador PesquisaFuncionario(String s){
        try {
            String SQL = "SELECT * FROM Funcionario WHERE Id = ?;";
            Administrador f = new Administrador();
            PreparedStatement ps = con.getConnection().prepareStatement(SQL);
            ps.setInt(1, Integer.parseInt(s));
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
           
            f.setId(rs.getInt("Id"));
            f.setNome(rs.getString("Nome"));
            f.setIdade(rs.getInt("Idade"));
            f.setCpf(rs.getString("Cpf"));
            }
            con.EncerrarConexao();
            return f;
        } catch (SQLException ex) {
            System.err.println("Erro Exception:" + ex.getMessage());
        }
        return null;
    }

    public void AdicionaFuncionario(Administrador fun) {
        try {
            String SQL = "INSERT INTO Funcionario (Nome,"
                    + "Idade,"
                    + ",Cpf) VALUES('" + fun.getNome() + "','" + fun.getIdade() + "',"
                    + ",'" + fun.getCpf() + ");";
            PreparedStatement ps = con.getConnection().prepareStatement(SQL);
            ps.executeUpdate();
            System.out.println("Inserido.");
            con.EncerrarConexao();
        } catch (Exception ex) {
            System.err.println("Erro Exception:" + ex.getMessage());
        }
    }
    public void AtualizarFuncionario(Administrador fun){
        try{
            String SQL = "UPDATE Funcionario SET Nome = ?, Idade=?, Cpf=?, WHERE Id=?";
            PreparedStatement ps = con.getConnection().prepareStatement(SQL);
            ps.setString(1,fun.getNome());
            ps.setInt(2,fun.getIdade());
            ps.setString(3,fun.getCpf());
            ps.setInt(4,fun.getId());
            ps.executeUpdate();
            ps.close();
            con.EncerrarConexao();
            System.out.println("Atualizado com sucesso.");
        }catch(SQLException ex){
            System.err.println("Erro SQLException:"+ex.getMessage());
        }catch(Exception ex){
            System.err.println("Erro Exception:"+ex.getMessage());
        }
    }  
    public void DeletarFuncionario(int Id){
        try{
            String SQL = "DELETE FROM Funcionario where Id = ?";
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

    public Object listarGestores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
