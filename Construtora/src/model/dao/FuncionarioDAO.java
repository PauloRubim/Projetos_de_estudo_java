package model.dao;

import java.sql.Connection;
import model.bean.Funcionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FuncionarioDAO {
    
    private EstabelecerConexao con;

    public FuncionarioDAO(EstabelecerConexao con) {
        this.con = con;
    }

    public ArrayList<Funcionario> RecuperarTudo() {
        try {
            String SQL = "SELECT * FROM Funcionario;";
            PreparedStatement ps = con.getConnection().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
            while (rs.next()) {
                Funcionario fun = new Funcionario();
                fun.setId(rs.getInt("Id"));
                fun.setNome(rs.getString("Nome"));
                fun.setSexo(rs.getString("Sexo"));
                fun.setDataNascimento(rs.getDate("Data_Nascimento"));
                fun.setSalario(rs.getDouble("Salario"));
                fun.setCpf(rs.getString("Cpf"));
                fun.setDisponibilidade(rs.getBoolean("Disponibilidade"));
                fun.setId_Construcao(rs.getInt("Id_Construcao"));
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

    public void AdicionaFuncionario(Funcionario fun) {
        try {
            String SQL = "INSERT INTO Funcionario (Nome,"
                    + "Sexo,Data_Nascimento,Salario"
                    + ",Cpf,Disponibilidade,Id_Construcao) VALUES('" + fun.getNome() + "','" + fun.getSexo() + "',"
                    + "'" + fun.getDataNascimento() + "'," + fun.getSalario() + ",'" + fun.getCpf() + "'," + fun.isDisponibilidade() +","+ fun.getId_Construcao() + ");";
            PreparedStatement ps = con.getConnection().prepareStatement(SQL);
            ps.executeUpdate();
            System.out.println("Funcionario Inserido.");
            con.EncerrarConexao();
        } catch (Exception ex) {
            System.err.println("Erro Exception:" + ex.getMessage());
        }
    }
    public void AtualizarFuncionario(Funcionario fun){
        try{
            String SQL = "UPDATE Funcionario SET Nome = ?, Sexo=?, Data_Nascimento=?,Salario=?, Cpf=?,Disponibilidade= ?,Id_Construcao=? WHERE Id=?";
            PreparedStatement ps = con.getConnection().prepareStatement(SQL);
            ps.setString(1,fun.getNome());
            ps.setString(2,fun.getSexo());
            ps.setDate(3,fun.getDataNascimento());
            ps.setDouble(4,fun.getSalario());
            ps.setString(5,fun.getCpf());
            ps.setBoolean(6,fun.isDisponibilidade());
            ps.setInt(7,fun.getId_Construcao());
            ps.setInt(8,fun.getId());
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
}