public class ContaPoupanca extends Conta {
    private double taxaDeJuros; // Novo campo
    private String dataAniversario; // Novo campo

    public ContaPoupanca(Cliente cliente) {
        super(cliente, "Poupança", "20/08/2024");
        this.taxaDeJuros = 0.05;
        this.dataAniversario = "01/09";
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
        System.out.println(String.format("Taxa de Juros: %.2f%%", this.taxaDeJuros * 100));
        System.out.println(String.format("Data de Aniversário: %s", this.dataAniversario));
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }
}
