package cursos.cursoJAVA.br.com.jdbc.controller;

import java.sql.Connection;
import java.util.List;

import cursos.cursoJAVA.br.com.jdbc.dao.ProdutoDAO;
import cursos.cursoJAVA.br.com.jdbc.factory.ConnectionFactory;
import cursos.cursoJAVA.br.com.jdbc.modelo.Produto;

public class ProdutoController {

	ProdutoDAO produtoDAO;

	public ProdutoController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.produtoDAO = new ProdutoDAO(connection);
	}

	public void deletar(Integer id) {
		this.produtoDAO.deletar(id);
	}

	public void salvar(Produto produto) {
		this.produtoDAO.salvar(produto);
	}

	public List<Produto> listar() {
		return this.produtoDAO.listar();
	}

	public void alterar(String nome, String descricao, Integer id) {
		this.produtoDAO.alterar(nome, descricao, id);
	}
}
