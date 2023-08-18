package cursos.cursoJAVA.br.com.jdbc.controller;

import java.sql.Connection;
import java.util.List;

import cursos.cursoJAVA.br.com.jdbc.dao.CategoriaDAO;
import cursos.cursoJAVA.br.com.jdbc.factory.ConnectionFactory;
import cursos.cursoJAVA.br.com.jdbc.modelo.Categoria;

public class CategoriaController {

	private CategoriaDAO categoriaDAO;

	public CategoriaController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.categoriaDAO = new CategoriaDAO(connection);
	}

	public List<Categoria> listar() {
		return this.categoriaDAO.listar();
	}
}
