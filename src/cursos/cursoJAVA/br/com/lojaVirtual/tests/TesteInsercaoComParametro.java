package cursos.cursoJAVA.br.com.lojaVirtual.tests;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import cursos.cursoJAVA.br.com.lojaVirtual.ConnectionFactory;

public class TesteInsercaoComParametro {

    public static void main(String[] args) throws SQLException {

        String nome = "Mouse1'";
        String descricao = "Mouse sem fio); DELETE FROM produto";
        
        ConnectionFactory startCon = new ConnectionFactory();
        Connection con = startCon.connect();
        System.out.println("Conectado");

        PreparedStatement stm = con.prepareStatement("INSERT INTO produto (nome, descricao) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
        stm.setString(1, nome);
        stm.setString(2, descricao);
        stm.execute();

        ResultSet rst = stm.getGeneratedKeys();

        while (rst.next()) {
            int id = rst.getInt(1);
            System.out.println("ID criado: " + id);
        }

        con.close();
        System.out.println("Conexão encerrada");

    }
    
}
