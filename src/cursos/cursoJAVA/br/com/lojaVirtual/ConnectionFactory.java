package cursos.cursoJAVA.br.com.lojaVirtual;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

    private String url = "jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC";
    private String user = "root";
    private String pass = "root";

    public DataSource dataSource;

    public ConnectionFactory() {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(pass);

        comboPooledDataSource.setMaxPoolSize(15);

        this.dataSource = comboPooledDataSource;
    }

    public Connection connect() throws SQLException {
        return this.dataSource.getConnection();

    }

}
