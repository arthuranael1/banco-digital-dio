public abstract class Conta implements IConta {
    private String numeroConta;
    private double saldo;
    private Cliente cliente;

    public Conta(String numeroConta, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        }
    }

    @Override
    public void transferir(IConta contaDestino, double valor) {
        if (valor > 0 && saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    @Override
    public String toString() {
        return "Conta [Número: " + numeroConta + ", Saldo: " + saldo + ", " + cliente + "]";
    }
}
