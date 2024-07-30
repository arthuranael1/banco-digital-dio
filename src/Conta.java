import java.util.ArrayList;
import java.util.List;
public abstract class Conta implements IConta {

	protected String agencia;
	protected String numero;
	protected double saldo;
	protected List<String> extrato;

	public Conta(String agencia, String numero) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0.0;
		this.extrato = new ArrayList<>();
	}

	@Override
	public abstract void sacar (double valor);

	@Override
	public void depositar(double valor) {
		saldo += valor;
		extrato.add("Depósito de R$ " + valor + " Saldo: R$ " + saldo);
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		extrato.add("Transferência de R$ " + valor + " Saldo: R$ "+ saldo);
	}

	public String getAgencia() {
		return agencia;
	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void imprimirExtrato() {
		System.out.println("====Extrato da conta " + agencia + "-" + numero + "====");
		for (String registro : extrato) {
			System.out.println(registro);
		}
		System.out.println("Saldo atual: R$ " + saldo);
}
}
