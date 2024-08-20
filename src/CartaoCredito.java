public class CartaoCredito {
    private String numero;
    private String titular;
    private String validade;
    private double limiteCredito;
    private double saldoDevedor;

    public CartaoCredito(String numero, String titular, String validade, double limiteCredito) {
        this.numero = numero;
        this.titular = titular;
        this.validade = validade;
        this.limiteCredito = limiteCredito;
        this.saldoDevedor = 0;
    }

    public void realizarCompra(double valor) {
        if (valor <= (limiteCredito - saldoDevedor)) {
            saldoDevedor += valor;
        } else {
            System.out.println("Saldo insuficiente para realizar a compra.");
        }
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
}
