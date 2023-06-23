package cursos.cursoJAVA;

public abstract class Conta extends Banco {

    private int conta = 0;
    private int agencia = 0;
    private double saldo = 0;
    private Cliente titular = new Cliente();
    private static int total = 0;

    public Conta(String nome) {
        Conta.total++;
        this.titular.setNome(nome);
        this.conta = Banco.novaConta();
        this.agencia = getAgencia();
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public static int getTotal() {
        return total;
    }

    public void depositarDinheiro(double valor) {
        this.saldo += valor;
    }

    public boolean sacarDinheiro(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Valor solicitado excede valor disponível.");
            return false;
        }
    }

    public void transferir(double valor, Conta conta) {
        boolean valido = sacarDinheiro(valor);
        if (valido) {
            conta.depositarDinheiro(valor);
        }
    }

    @Override
    public String toString() {
        return "Conta [titular=" + this.titular.getNome()
                + ", cpf=" + this.titular.getCpf()
                + ", profissão=" + this.titular.getProfissao()
                + ", agencia=" + this.agencia
                + ", conta=" + this.conta
                + ", saldo=" + saldo + "]";
    }

}
