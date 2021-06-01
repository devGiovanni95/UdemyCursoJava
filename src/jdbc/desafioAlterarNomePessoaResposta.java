package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class desafioAlterarNomePessoa {
    public static void main(String[] args) throws SQLException {
        Scanner dados = new Scanner(System.in);


        Connection conexao = FabricaConexao.getConexao();
        String sql = "SELECT  * FROM pessoas WHERE  nome like ? ";

        System.out.println("Digite o nome para pesquisa: ");
        String pesquisa = dados.nextLine();

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%" + pesquisa + "%");
        ResultSet resultado = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p : pessoas) {
            System.out.println(p.getCodigo() + " ===> " + p.getNome());
        }

        String alterarBancoDados = "UPDATE pessoas SET nome = ? WHERE codigo = ? ";

        System.out.println("Digite o novo nome para cadastro: ");
        String alterarNome = dados.nextLine();

        System.out.println("Digite o id para alterar : ");
        int id = dados.nextInt();

        PreparedStatement stmt1 = conexao.prepareStatement(alterarBancoDados);
        stmt1.setString(1, alterarNome);
        stmt1.setInt(2, id);


        ResultSet resultado1 = stmt1.executeQuery(alterarBancoDados);

        List<Pessoa> pessoas1 = new ArrayList<>();

        while (resultado1.next()) {
            int codigo = resultado1.getInt("codigo");
            String nome = resultado1.getString("nome");
            pessoas1.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p : pessoas1) {
            System.out.println(p.getCodigo() + " ===> " + p.getNome());
        }

        stmt.close();
        conexao.close();
    }
}
