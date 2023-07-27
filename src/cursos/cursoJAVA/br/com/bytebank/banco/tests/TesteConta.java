package cursos.cursoJAVA.br.com.bytebank.banco.tests;

import cursos.cursoJAVA.br.com.bytebank.banco.modelo.ContaCorrente;
import cursos.cursoJAVA.br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteConta {

    public static void main(String[] args) {

        System.out.println("\n \u001B[32m ======= TESTE DE CRIAÇÃO ======= \u001B[m \n");

        ContaCorrente cc = new ContaCorrente("cliente 1");
        ContaPoupanca cp = new ContaPoupanca("cliente 2");

        System.out.println("\n \u001B[32m ======= TESTE DE DEPÓSITO ======= \u001B[m \n");

        cc.depositarDinheiro(1000.);
        cp.depositarDinheiro(850.);
        System.out.println("CC " + cc.getSaldo());
        System.out.println("CP " + cp.getSaldo());

        System.out.println("\n \u001B[32m ======= TESTE DE SAQUE ======= \u001B[m \n");

        try {
            cc.sacarDinheiro(2000.);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception: " + e.getMessage());
        }
        
        try {
            cc.sacarDinheiro(50.);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            cp.sacarDinheiro(50.);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception: " + e.getMessage());
        }
        
        System.out.println("CC " + cc.getSaldo());
        System.out.println("CP " + cp.getSaldo());

        System.out.println("\n \u001B[32m ======= TESTE DE TRANSFERÊNCIA ======= \u001B[m \n");

        try {
            cc.transferir(100., cp);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception: " + e.getMessage());
        }
        
        System.out.println("CC " + cc.getSaldo());
        System.out.println("CP " + cp.getSaldo());

    }

}
