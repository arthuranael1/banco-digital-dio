
public class ContaPoupanca extends Conta {

	public ContaPoupanca(String agencia, String numero) {
		super(agencia, numero);
	}

	@Override
	public void sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			extrato.add("Saque de R$ " + valor + " Saldo: R$ " + saldo);
		} else {	
			extrato.add("Tentativa de saque de R$ " + valor + " falhou. Saldo insuficiente. ");
			System.out.println("Saldo insufuciente.");
		}
	}
}