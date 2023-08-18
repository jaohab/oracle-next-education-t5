package cursos.cursoJAVA.br.com.lojaVirtual.tests;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import cursos.cursoJAVA.br.com.lojaVirtual.ConnectionFactory;
import cursos.cursoJAVA.br.com.lojaVirtual.dao.CategoriaDAO;
import cursos.cursoJAVA.br.com.lojaVirtual.modelo.Categoria;

public class TesteListagemCategorias {

    public static void main(String[] args) throws SQLException {

        try (Connection connection = new ConnectionFactory().connect()) {
            CategoriaDAO categoriaDao = new CategoriaDAO(connection);
            List<Categoria> listaCategorias = categoriaDao.listar();
            listaCategorias.stream().forEach(ct -> System.out.println(ct.getNome()));
        }
    }
}
