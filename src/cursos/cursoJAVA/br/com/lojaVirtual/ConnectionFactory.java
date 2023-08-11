package cursos.cursoJAVA.br.com.lojaVirtual;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection connect() throws SQLException {

        String url = "jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String pass = "root";
        
        return DriverManager.getConnection(url, user, pass);

    }
    
}
