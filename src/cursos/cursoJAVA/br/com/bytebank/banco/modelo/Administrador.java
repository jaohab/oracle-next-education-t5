package cursos.cursoJAVA.br.com.bytebank.banco.modelo;

import cursos.cursoJAVA.br.com.bytebank.banco.modelo.interfaces.Autenticacao;

public class Administrador extends Funcionario implements Autenticacao {

    private Autenticador au;

    public Administrador(int senha) {
        au = new Autenticador(senha);
    }

    @Override
    public double getBonificao() {
        return (super.getSalario()/2);
    }

    @Override
    public boolean autenticacao(int senha) {
        return au.autenticacao(senha);
    }

    @Override
    public int getSenha() {
        return au.getSenha();
    }

    @Override
    public void setSenha(int senha) {
        au.setSenha(senha);
    }

}
