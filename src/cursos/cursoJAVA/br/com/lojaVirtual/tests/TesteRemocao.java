package cursos.cursoJAVA.br.com.lojaVirtual.tests;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cursos.cursoJAVA.br.com.lojaVirtual.ConnectionFactory;

public class TesteRemocao {

    public static void main(String[] args) throws SQLException {
        
        ConnectionFactory startCon = new ConnectionFactory();
        Connection con = startCon.connect();
        System.out.println("Conectado");

        PreparedStatement stm = con.prepareStatement("DELETE FROM produto WHERE id > ?");
        stm.setInt(1, 2);
        stm.execute();

        int linhasModificadas = stm.getUpdateCount();
        System.out.println("Quantidade de linhas que foram modificadas: " + linhasModificadas);

        con.close();
        System.out.println("Conexão encerrada");

    }
    
}
