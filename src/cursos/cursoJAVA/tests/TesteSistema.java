package cursos.cursoJAVA.tests;

import cursos.cursoJAVA.Administrador;
import cursos.cursoJAVA.Gerente;
import cursos.cursoJAVA.SistemaInterno;

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
