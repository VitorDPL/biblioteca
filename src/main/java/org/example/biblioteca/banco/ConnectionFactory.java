package org.example.biblioteca.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        String senhaBanco = System.getenv("senhaBanco");

        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", senhaBanco);

    }

    public static void main(String[] args) {
        try {
            Connection connection = ConnectionFactory.getConnection();
            if (connection != null) {
                System.out.println("Conexão bem-sucedida!");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}
