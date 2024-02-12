package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {

    private static final String banco = "jdbc:mysql://localhost:3306/mydb";
    private static final String usuario = "root";
    private static final String senha = "Dev1310#5";
    private static final String driver = "com.mysql.cj.jdbc.Driver"; // Atualize o nome do driver

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(banco + "?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", usuario, senha);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static void closeConnection(Connection conexao) {
        try {
            conexao.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void closeConnection(Connection conexao, Statement stm) {
        try {
            stm.close();
            conexao.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void closeConnection(Connection conexao, PreparedStatement pstm) {
        try {
            pstm.close();
            conexao.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void closeConnection(Connection conexao, PreparedStatement pstm, ResultSet rst) {
        try {
            pstm.close();
            rst.close();
            conexao.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
