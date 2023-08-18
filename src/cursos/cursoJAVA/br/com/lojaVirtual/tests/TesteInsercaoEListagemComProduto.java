package cursos.cursoJAVA.br.com.lojaVirtual.tests;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import cursos.cursoJAVA.br.com.lojaVirtual.ConnectionFactory;
import cursos.cursoJAVA.br.com.lojaVirtual.dao.ProdutoDAO;
import cursos.cursoJAVA.br.com.lojaVirtual.modelo.Produto;

public class TesteInsercaoEListagemComProduto {

    public static void main(String[] args) throws SQLException {

        Produto comoda = new Produto("Cômoda", "Cômoda Vertical");

        try (Connection con = new ConnectionFactory().connect()) {
            ProdutoDAO produtoDao = new ProdutoDAO(con);
            produtoDao.salvar(comoda);
            List<Produto> listaProdutos = produtoDao.listar();
            listaProdutos.stream().forEach(lp -> System.out.println(lp));
        }
    }
}
