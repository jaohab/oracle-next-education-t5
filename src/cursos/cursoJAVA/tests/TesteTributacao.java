package cursos.cursoJAVA.tests;

import cursos.cursoJAVA.ContaCorrente;
import cursos.cursoJAVA.SeguroDeVida;
import cursos.cursoJAVA.SistemaImpostos;

public class TesteTributacao {

    public static void main(String[] args) {

        System.out.println("\n \u001B[32m ======= TESTE DE CRIAÇÃO ======= \u001B[m \n");

        ContaCorrente cc = new ContaCorrente("Nome");
        SeguroDeVida sv = new SeguroDeVida();

        cc.depositarDinheiro(100.);

        SistemaImpostos si = new SistemaImpostos();

        si.registra(cc);

        si.registra(sv);
        
        si.getTotalImposto();

        
        
    }

    



    
}
