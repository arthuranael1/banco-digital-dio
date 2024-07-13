
public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco("Banco do Barril");

		Cliente clienteJose = new Cliente("José");
		Cliente clienteMaria = new Cliente("Maria");

		ContaCorrente corrente = new ContaCorrente(clienteJose);
		ContaPoupanca poupanca = new ContaPoupanca(clienteMaria);

		banco.adicionarConta(corrente);
		banco.adicionarConta(poupanca);

		// Teste saque sem saldo
		poupanca.sacar(100);

		// Teste apagar conta com saldo positivo
		corrente.depositar(200);
		banco.apagarConta(1);
		
		// Transferencia
		corrente.transferir(200, poupanca);
		banco.exibirTodasContas();

		// Teste apagar conta sem saldo
		banco.apagarConta(1);
		banco.exibirTodasContas();
	}

}
