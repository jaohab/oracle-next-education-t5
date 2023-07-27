package cursos.cursoJAVA.br.com.bytebank.banco.modelo;

import cursos.cursoJAVA.br.com.bytebank.banco.modelo.interfaces.Tributacao;

public class SeguroDeVida implements Tributacao {

    @Override
    public double getValorImposto() {
        return 42.;
    }
    
}
