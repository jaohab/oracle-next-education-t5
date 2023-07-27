package cursos.cursoJAVA.br.com.bytebank.banco.modelo;

import cursos.cursoJAVA.br.com.bytebank.banco.modelo.interfaces.Autenticacao;

public class SistemaInterno {

    public void autentica(Autenticacao a, int senha) {
        if (a.autenticacao(senha)) {
            System.out.println("\u001B[34m" + "Acesso concedido." + "\u001B[m");
        } else {
            System.out.println("\u001B[31m" + "Acesso negado." + "\u001B[m");
        }

    }
      
}
