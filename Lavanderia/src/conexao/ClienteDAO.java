package conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {

    public static Object getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private EstabelecerConexao con;

    public ClienteDAO(EstabelecerConexao con) {
        this.con = con;
    }

    public ArrayList<Cliente> RecuperaTudo() {
        try {
            String SQL = "SELECT * FROM Cliente; ";
            PreparedStatement ps = con.getConnection().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            ArrayList<Cliente> lista = new ArrayList();
            while (rs.next()) {
            Cliente cliente = new Cliente();
            cliente.setId(rs.getInt("Id"));
            cliente.setNome(rs.getString("Nome"));
            cliente.setIdade(rs.getInt("Idade"));
            cliente.setCardNumber(rs.getInt("CardNumber"));
            cliente.setCpf(rs.getString("Cpf"));
            lista.add(cliente);
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
    
    public Cliente PesquisaCliente(String s){
        try {
            String SQL = "SELECT * FROM Cliente WHERE Id = ?;";
            Cliente cliente = new Cliente();
            PreparedStatement ps = con.getConnection().prepareStatement(SQL);
            ps.setInt(1, Integer.parseInt(s));
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
           
            cliente.setId(rs.getInt("Id"));
            cliente.setNome(rs.getString("Nome"));
            cliente.setIdade(rs.getInt("Idade"));
            cliente.setCardNumber(rs.getInt("CardNumber"));
            cliente.setCpf(rs.getString("Cpf"));
            }
            con.EncerrarConexao();
            return cliente;
        } catch (SQLException ex) {
            System.err.println("Erro Exception:" + ex.getMessage());
        }
        return null;
    }
    
    public void AdicionarCliente(Cliente cliente){
        try{
            String SQL = "INSERT INTO Cliente (Nome,Cpf,Endereco,Idade,Contato,Senha) VALUES('"+cliente.getNome()+"','"+cliente.getCpf()+"','"+cliente.getEndereco()+"','"+cliente.getIdade()+"','"+cliente.getContato()+"','"+cliente.getSenha()+"');";
            PreparedStatement ps = con.getConnection().prepareStatement(SQL);
            ps.executeUpdate();
            System.out.println("Inserido");
            ps.close();
            con.EncerrarConexao();
        }catch(Exception ex){
            System.err.println("Erro Exception:"+ex.getMessage());        
        }
    }
    
    public void AtualizarCliente(Cliente cliente){
        try{
        String SQL= "UPDATE Cliente SET Nome = ?, Cpf = ?, Endereco = ? , Idade = ?, Contato = ? , Senha = ? WHERE Id = ? ";
        PreparedStatement ps = con.getConnection().prepareStatement(SQL);
        ps.setString(1,cliente.getNome());
        ps.setString(2,cliente.getCpf());
        ps.setString(3,cliente.getEndereco());
        ps.setInt(4,cliente.getIdade());
        ps.setInt(5,cliente.getContato());
        ps.setInt(6,cliente.getSenha());
        ps.setInt(7,cliente.getId());
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
     public void DeletarCliente(int Id){
        try{
            String SQL = "DELETE FROM Cliente where Id = ?";
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

    public void creditar(int codigo, double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void debitar(int codigo, double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
