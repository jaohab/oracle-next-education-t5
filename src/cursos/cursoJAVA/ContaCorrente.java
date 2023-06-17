package cursos.cursoJAVA;

public class ContaCorrente extends Conta {

    private double taxaSaque = 0.2;

    public ContaCorrente(String nome) {
        super(nome);
    }

    @Override
    public boolean sacarDinheiro(double valor) {
        valor += taxaSaque;
        return super.sacarDinheiro(valor);
    }

}
