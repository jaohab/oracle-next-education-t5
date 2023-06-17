package cursos.cursoJAVA;

public class Gerente extends Funcionario {

    private int senha;
    private boolean autentica = false;

    public Gerente(int senha) {
        this.senha = senha;
    }

    public boolean autenticacao(int senha) {
        if (this.senha == senha) {
            return autentica = true;
        } else {
            return autentica;
        }
    }

    @Override
    public double getBonificao() {
        return super.getSalario() + super.getBonificao();
    }

}
