package cursos.cursoJAVA.br.com.bytebank.banco.modelo;

public class Banco {

    protected int agencia = 12345;
    protected static int conta = 1;

    public static int novaConta() {
        return conta++;
    }

    public int getAgencia() {
        return agencia;
    }

}