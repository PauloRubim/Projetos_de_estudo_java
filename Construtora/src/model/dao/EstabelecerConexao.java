package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EstabelecerConexao {
     private Connection connection;

    public EstabelecerConexao() {
        try {
            String url = "jdbc:mysql://localhost:3306/central";
            connection = DriverManager.getConnection(url, "root", "1234");
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
