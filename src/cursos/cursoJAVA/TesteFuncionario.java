package cursos.cursoJAVA;

public class TesteFuncionario {

    public static void main(String[] args) {

        System.out.println("\n \u001B[32m ======= TESTE DE CRIAÇÃO ======= \u001B[m \n");

        Funcionario f1 = new Funcionario();
        f1.setNome("Pedro");

        System.out.println(f1.getNome());

        Gerente g1 = new Gerente(123);
        g1.setNome("Haroldo");
        g1.setCpf("78945613");
        g1.setSalario(9000.);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
        System.out.println(g1.getBonificao());
        System.out.println(g1.autenticacao(1123));

    }

}
