
public class ContaPoupanca extends Conta {

	public ContaPoupanca(String agencia, String numero) {
		super(agencia, numero);
	}

	@Override
	public void sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			extrato.add("---Saque de R$ " + valor + " Saldo: R$ " + saldo);
		} else {	
			extrato.add("--Tentativa de saque de R$ " + valor + " falhou. Saldo insuficiente. ");
			System.out.println("Saldo insufuciente.");
		}
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		if (saldo >= valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
			extrato.add("---Transferência de R$ " + valor + "Saldo: R$ " + saldo);
		} else {
			extrato.add("--Tentativa de transfrência de R$ " + valor + " falhou. Saldo insuficiente.");
			System.out.println("Saldo insuficiente para transferência.");
		}
	}
}