package cursos.cursoJAVA;

import cursos.cursoJAVA.interfaces.Tributacao;

public class ContaCorrente extends Conta implements Tributacao {

    private double taxaSaque = 0.2;

    public ContaCorrente(String nome) {
        super(nome);
    }

    @Override
    public boolean sacarDinheiro(double valor) {
        valor += taxaSaque;
        return super.sacarDinheiro(valor);
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.01;
    }

}
