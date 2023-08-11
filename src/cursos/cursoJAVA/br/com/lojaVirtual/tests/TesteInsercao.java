package cursos.cursoJAVA.br.com.lojaVirtual.tests;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import cursos.cursoJAVA.br.com.lojaVirtual.ConnectionFactory;

public class TesteInsercao {

    public static void main(String[] args) throws SQLException {
        
        ConnectionFactory startCon = new ConnectionFactory();
        Connection con = startCon.connect();
        System.out.println("Conectado");

        Statement stm = con.createStatement();
        stm.execute("INSERT INTO produto (nome, descricao) VALUES ('Mouse', 'Mouse sem fio')", Statement.RETURN_GENERATED_KEYS);
        ResultSet rst = stm.getGeneratedKeys();

        while (rst.next()) {
            int id = rst.getInt(1);
            System.out.println("ID criado: " + id);
        }

        con.close();
        System.out.println("Conexão encerrada");

    }
    
}
