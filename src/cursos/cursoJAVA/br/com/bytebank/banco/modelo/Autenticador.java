package cursos.cursoJAVA.br.com.bytebank.banco.modelo;

import cursos.cursoJAVA.br.com.bytebank.banco.modelo.interfaces.Autenticacao;

public class Autenticador implements Autenticacao {

    private int senha;
    private boolean autentica = false;

    public Autenticador(int senha) {
        this.senha = senha;
    }

    public boolean autenticacao(int senha) {
        if (this.senha == senha) {
            return autentica = true;
        } else {
            return autentica = false;
        }
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean getAutentica() {
        return autentica;
    }
    
}
