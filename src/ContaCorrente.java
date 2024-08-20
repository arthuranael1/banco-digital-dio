public class ContaCorrente extends Conta {
    private double taxaManutencao; // Novo campo

    public ContaCorrente(Cliente cliente) {
        super(cliente, "Corrente", "20/08/2024");
        this.taxaManutencao = 10.00;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
        System.out.println(String.format("Taxa de Manutenção: %.2f", this.taxaManutencao));
    }

    public double getTaxaManutencao() {
        return taxaManutencao;
    }
}
