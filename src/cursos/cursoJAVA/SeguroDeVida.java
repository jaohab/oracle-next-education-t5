package cursos.cursoJAVA;

import cursos.cursoJAVA.interfaces.Tributacao;

public class SeguroDeVida implements Tributacao {

    @Override
    public double getValorImposto() {
        return 42.;
    }
    
}
