package cursos.cursoJAVA.br.com.lojaVirtual.tests;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import cursos.cursoJAVA.br.com.lojaVirtual.ConnectionFactory;

public class TesteInsercaoComParametroEmSerie {

    public static void main(String[] args) throws SQLException {

        ConnectionFactory startCon = new ConnectionFactory();
        try (Connection con = startCon.connect()) {
            con.setAutoCommit(false);
            System.out.println("Conectado");

            try (PreparedStatement stm = con.prepareStatement("INSERT INTO produto (nome, descricao) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);) {
                adicionarProduto("SmartTV", "45 polegadas", stm);
                adicionarProduto("Radio", "Radio de bateria", stm);
                con.commit();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("ROLLBACK EXECUTADO");
                con.rollback(null);
            }

        }
        System.out.println("Conexão encerrada");
    }

    private static void adicionarProduto(String nome, String descricao, PreparedStatement stm) throws SQLException {
        stm.setString(1, nome);
        stm.setString(2, descricao);

        stm.execute();
        try (ResultSet rst = stm.getGeneratedKeys()) {

            while (rst.next()) {
                int id = rst.getInt(1);
                System.out.println("ID criado: " + id);
            }
            rst.close();
        }
    }
}
