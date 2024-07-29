public class ContaCorrente extends Conta {
    private double taxaManutencao;

    public ContaCorrente(String numeroConta, Cliente cliente, double taxaManutencao) {
        super(numeroConta, cliente);
        this.taxaManutencao = taxaManutencao;
    }

    public void cobrarTaxa() {
        sacar(taxaManutencao);
    }

    @Override
    public String toString() {
        return super.toString() + " [Taxa de Manutenção: " + taxaManutencao + "]";
    }
}
