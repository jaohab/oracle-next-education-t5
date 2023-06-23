package cursos.cursoJAVA.interfaces;

public abstract interface Autenticacao {

    public abstract boolean autenticacao(int senha);

    public abstract int getSenha();

    public abstract void setSenha(int senha);
  
}
