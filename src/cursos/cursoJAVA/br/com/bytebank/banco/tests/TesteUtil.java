package cursos.cursoJAVA.br.com.bytebank.banco.tests;

import java.util.ArrayList;

import cursos.cursoJAVA.br.com.bytebank.banco.modelo.Conta;
import cursos.cursoJAVA.br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteUtil {

    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente("User");

        lista.add(cc);
        
    }
    
}
