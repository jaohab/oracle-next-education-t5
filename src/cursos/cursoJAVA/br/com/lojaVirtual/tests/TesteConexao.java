package cursos.cursoJAVA.br.com.lojaVirtual.tests;

import java.sql.Connection;
import java.sql.SQLException;

import cursos.cursoJAVA.br.com.lojaVirtual.ConnectionFactory;

public class TesteConexao {

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
        
        con.close();
        System.out.println("Conexão encerrada");

    }
    
}
