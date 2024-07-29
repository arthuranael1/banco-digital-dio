public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String numeroConta, Cliente cliente, double taxaRendimento) {
        super(numeroConta, cliente);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        double rendimento = getSaldo() * taxaRendimento;
        depositar(rendimento);
    }

    @Override
    public String toString() {
        return super.toString() + " [Taxa de Rendimento: " + taxaRendimento + "]";
    }
}
