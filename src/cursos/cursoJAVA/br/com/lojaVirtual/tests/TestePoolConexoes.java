package cursos.cursoJAVA.br.com.lojaVirtual.tests;

import java.sql.SQLException;

import cursos.cursoJAVA.br.com.lojaVirtual.ConnectionFactory;

public class TestePoolConexoes {

    public static void main(String[] args) throws SQLException {

        ConnectionFactory connectionFactory = new ConnectionFactory();

        for (int i = 0; i < 20; i++) {
            connectionFactory.connect();
            System.out.println("Conexão de número " + (i+1) + " estabelecida.");
        }
        
    }
    
}
