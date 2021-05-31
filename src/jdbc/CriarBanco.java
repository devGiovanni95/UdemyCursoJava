package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
    public static void main(String[] args) throws SQLException {


//        final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
//        final String usuario = "root";
//        final String senha = "1995";
//
//        Connection conexao = DriverManager.getConnection(url, usuario, senha);

//        stmt.execute("CREATE DATABASE curso_java");

//        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java_2");
//        stmt.execute("DROP DATABASE IF EXISTS curso_java");

        Connection conexao = FabricaConexao.getConexao();
        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");

        System.out.println("Banco criado com sucesso! ");
        conexao.close();
    }
}
