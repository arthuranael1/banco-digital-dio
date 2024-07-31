
public class ContaCorrente extends Conta {
	private double limite;

	public ContaCorrente(String agencia, String numero, double limite) {
		super(agencia, numero);
		this.limite = limite;
 	}

	 @Override
	 public void sacar(double valor) {
		 if (saldo + limite >= valor) {
			 saldo -= valor;
			 extrato.add("Saque de R$ " + valor + " Saldo: R$ " + saldo);
		 } else {
			 extrato.add("Tentativa de saque de R$ " + valor + " falhou. Saldo insuficiente.");
			 System.out.println("Saldo insuficiente para saque.");
		 }
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		if (saldo >= valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
			extrato.add("Transferência de R$ " + valor + "Saldo: R$ " + saldo);
		} else {
			extrato.add("Tentativa de transfrência de R$ " + valor + " falhou. Saldo insuficiente.");
			System.out.println("Saldo insuficiente para transferência.");
		}
	}

}
