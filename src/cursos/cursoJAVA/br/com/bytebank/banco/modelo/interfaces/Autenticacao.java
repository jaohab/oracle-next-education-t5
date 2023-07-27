package cursos.cursoJAVA.br.com.bytebank.banco.modelo.interfaces;

public abstract interface Autenticacao {

    public abstract boolean autenticacao(int senha);

    public abstract int getSenha();

    public abstract void setSenha(int senha);
  
}
