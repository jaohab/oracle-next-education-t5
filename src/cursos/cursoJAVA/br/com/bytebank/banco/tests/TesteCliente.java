package cursos.cursoJAVA.br.com.bytebank.banco.tests;

import cursos.cursoJAVA.br.com.bytebank.banco.modelo.Conta;
import cursos.cursoJAVA.br.com.bytebank.banco.modelo.ContaCorrente;
import cursos.cursoJAVA.br.com.bytebank.banco.modelo.exceptions.SaldoInsuficienteExcecao;

public class TesteCliente {

    public static void main(String[] args) throws SaldoInsuficienteExcecao {

        System.out.println("\n \u001B[32m ======= TESTE DE CRIAÇÃO ======= \u001B[m \n");

        Conta c1 = new ContaCorrente("User1");
        Conta c2 = new ContaCorrente("User2");
        Conta c3 = new ContaCorrente("User3");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("\n \u001B[32m ======= TESTE DE MÉTODOS (depositarDinheiro / sacarDinheiro) ======= \u001B[m \n");

        c1.depositarDinheiro(50d);
        c2.depositarDinheiro(200d);
        c3.depositarDinheiro(10d);

        c1.depositarDinheiro(1000d);
        System.out.println(c1.getSaldo());
        c1.sacarDinheiro(351d);
        System.out.println(c1.getSaldo());
        c1.sacarDinheiro(3510d);
        System.out.println(c1.getSaldo());

        System.out.println("\n \u001B[32m ======= TESTE DE MÉTODOS (transferir) ======= \u001B[m \n");

        c1.transferir(20d, c3);
        System.out.println(c1);
        System.out.println(c3);

        c1.transferir(2000d, c3);
        System.out.println(c1);
        System.out.println(c3);

        System.out.println("\n \u001B[32m ======= TESTE DE INFORMAÇÔES DO TITULAR ======= \u001B[m \n");

        c1.getTitular().setProfissao("Designer");
        c2.getTitular().setCpf("545646");
        c3.getTitular().setNome("Carlos");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("\n \u001B[32m ======= TESTE DE CONTAS CRIADAS ======= \u001B[m \n");

        System.out.println("Total de contas criadas: " + Conta.getTotal());

    }

}
