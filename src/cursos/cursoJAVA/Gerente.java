package cursos.cursoJAVA;

import cursos.cursoJAVA.interfaces.Autenticacao;

public class Gerente extends Funcionario implements Autenticacao {

    private Autenticador au;

    public Gerente(int senha) {
        au = new Autenticador(senha);
    }

    @Override
    public double getBonificao() {
        return super.getSalario();
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
