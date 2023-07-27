package cursos.cursoJAVA.br.com.bytebank.banco.modelo;

import cursos.cursoJAVA.br.com.bytebank.banco.modelo.interfaces.Tributacao;

public class SistemaImpostos {

    private double totalImposto;

    public void registra(Tributacao t) {
        double valor = t.getValorImposto();
        System.out.println("Valor do imposto: " + valor);
        totalImposto += valor;
    }

    public double getTotalImposto() {
        System.out.println("Valor total arrecadado: " + totalImposto);
        return totalImposto;
    }

}
