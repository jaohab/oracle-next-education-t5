package cursos.cursoJAVA.br.com.lojaVirtual.tests;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cursos.cursoJAVA.br.com.lojaVirtual.ConnectionFactory;

public class TesteListagem {

    public static void main(String[] args) throws SQLException {

        /*
        String url = "jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String pass = "root";
        
        Connection con = DriverManager.getConnection(url, user, pass);
        */

        ConnectionFactory startCon = new ConnectionFactory();
        Connection con = startCon.connect();
        System.out.println("Conectado");

        PreparedStatement stm = con.prepareStatement("SELECT * FROM produto;");
        stm.execute();
        ResultSet rst = stm.getResultSet();

        while (rst.next()) {
            int id = rst.getInt("ID");
            System.out.print(id + " - ");
            String nome = rst.getString("NOME");
            System.out.print(nome + " - ");
            String descr = rst.getString("DESCRICAO");
            System.out.println(descr);
        }
        
        con.close();
        System.out.println("Conexão encerrada");

    }
    
}
