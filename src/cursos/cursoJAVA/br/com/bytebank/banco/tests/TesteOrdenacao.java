package cursos.cursoJAVA.br.com.bytebank.banco.tests;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import cursos.cursoJAVA.br.com.bytebank.banco.modelo.Conta;
import cursos.cursoJAVA.br.com.bytebank.banco.modelo.ContaCorrente;
import cursos.cursoJAVA.br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

        public static void main(String[] args) {

                Conta cc1 = new ContaCorrente("Nico");
                cc1.depositarDinheiro(333.0);

                Conta cc2 = new ContaPoupanca("Guilherme");
                cc2.depositarDinheiro(444.0);

                Conta cc3 = new ContaCorrente("Paulo");
                cc3.depositarDinheiro(111.0);

                Conta cc4 = new ContaPoupanca("Ana");
                cc4.depositarDinheiro(222.0);

                Conta cc5 = new ContaPoupanca("João");
                cc5.depositarDinheiro(222.0);

                List<Conta> lista = new ArrayList<>();
                lista.add(cc1);
                lista.add(cc2);
                lista.add(cc3);
                lista.add(cc4);
                lista.add(cc5);

                for (Conta conta : lista) {
                    System.out.println(conta);
                }

                System.out.println("\n============== Saldo ==============\n");
                lista.sort(new ComparacaoPorSaldo());
                for (Conta conta : lista) {
                    System.out.println(conta);
                }

                System.out.println("\n============== Titular ==============\n");
                lista.sort(new ComparacaoPorTitular());
                for (Conta conta : lista) {
                    System.out.println(conta);
                }

                System.out.println("\n============== Nº da Conta (Ordem natural - Implementado na classe Conta) ==============\n");
                lista.sort(null);
                for (Conta conta : lista) {
                    System.out.println(conta);
                }
  
    }
    
}

class ComparacaoPorTitular implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {

        String nomeC1 = c1.getTitular().getNome();
        String nomeC2 = c2.getTitular().getNome();

        return nomeC1.compareToIgnoreCase(nomeC2);
    }

}

class ComparacaoPorSaldo implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {

        return Double.compare(c1.getSaldo(), c2.getSaldo());

        /*
        if (c1.getSaldo() < c2.getSaldo()) {
            return -1;
        }

        if (c1.getSaldo() == c2.getSaldo()) {
            return 0;
        } 

        if (c1.getSaldo() > c2.getSaldo()) {
            return 1;
        } 

        throw new UnsupportedOperationException("Unimplemented method 'compare'");
        */
    }
    
}