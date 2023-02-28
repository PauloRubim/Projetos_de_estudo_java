package conexao;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

public class EstabelecerConexao {

    private static Connection connection;

    /**
     *
     */
    public  EstabelecerConexao() {
        try {
            String url;
            url = "jdbc:mysql://jdbc:mysql://localhost:3306/cadastro?zeroDateTimeBehavior=convertToNull";
            connection = DriverManager.getConnection(url, "root", "");
            System.out.println("Conexão Estabelecida.");
        } catch (SQLException ex) {
            System.err.println("Erro SQLException:" + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("Erro Exception:" + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return this.connection;
    }

    public void EncerrarConexao() {
        try {
            connection.close();
            System.out.println("Conexão Encerrada.");
        } catch (Exception ex) {
            System.err.println("Erro Exception:" + ex.getMessage());
        }
    }
}
