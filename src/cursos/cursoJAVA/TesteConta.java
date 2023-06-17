package cursos.cursoJAVA;

public class TesteConta {

    public static void main(String[] args) {

        System.out.println("\n \u001B[32m ======= TESTE DE CRIAÇÃO ======= \u001B[m \n");

        ContaCorrente cc = new ContaCorrente("cliente 1");
        ContaPoupanca cp = new ContaPoupanca("cliente 2");

        cc.depositarDinheiro(1000.);
        cp.depositarDinheiro(850.);

        cc.transferir(100., cp);

        System.out.println("CC " + cc.getSaldo());
        System.out.println("CP " + cp.getSaldo());

    }

}
