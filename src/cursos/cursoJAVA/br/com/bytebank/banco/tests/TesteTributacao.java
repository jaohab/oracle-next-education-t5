package cursos.cursoJAVA.br.com.bytebank.banco.tests;

import cursos.cursoJAVA.br.com.bytebank.banco.modelo.ContaCorrente;
import cursos.cursoJAVA.br.com.bytebank.banco.modelo.SeguroDeVida;
import cursos.cursoJAVA.br.com.bytebank.banco.modelo.SistemaImpostos;

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
