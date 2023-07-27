package cursos.cursoJAVA.br.com.bytebank.banco.tests;

import cursos.cursoJAVA.br.com.bytebank.banco.modelo.Administrador;
import cursos.cursoJAVA.br.com.bytebank.banco.modelo.Gerente;
import cursos.cursoJAVA.br.com.bytebank.banco.modelo.SistemaInterno;

public class TesteSistema {

    public static void main(String[] args) {

        System.out.println("\n \u001B[32m ======= TESTE DE CRIAÇÃO E ACESSO ======= \u001B[m \n");
        
        Gerente g = new Gerente(2222);
        Administrador a = new Administrador(3333);

        SistemaInterno sys = new SistemaInterno();

        sys.autentica(g, 2222);
        sys.autentica(a, 2223);
        sys.autentica(a, 3333);

    }
    
}
