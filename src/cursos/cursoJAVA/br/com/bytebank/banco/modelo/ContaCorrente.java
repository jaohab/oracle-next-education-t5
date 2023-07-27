package cursos.cursoJAVA.br.com.bytebank.banco.modelo;

import cursos.cursoJAVA.br.com.bytebank.banco.modelo.exceptions.SaldoInsuficienteExcecao;
import cursos.cursoJAVA.br.com.bytebank.banco.modelo.interfaces.Tributacao;

public class ContaCorrente extends Conta implements Tributacao {

    private double taxaSaque = 0.2;

    public ContaCorrente(String nome) {
        super(nome);
    }

    @Override
    public void sacarDinheiro(double valor) throws SaldoInsuficienteExcecao {
        valor += taxaSaque;
        super.sacarDinheiro(valor);
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.01;
    }

}
