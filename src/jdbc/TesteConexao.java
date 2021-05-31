package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {

//        final String stringDeConexao = "jdbc:mysql://localhost:3306";
//        final String url = "jdbc:mysql://localhost:3306?useSSL=false";
        final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
        final String usuario = "root";
        final String senha = "1995";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        System.out.println("Conexão efetuado com sucesso!");
        conexao.close();
    }
}
