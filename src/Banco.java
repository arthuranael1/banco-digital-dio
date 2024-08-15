import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<Cliente> clientes;
	private List<Conta> contas;
	private static final String AGENCIA_PADRAO = "01";
	private int contadorContas = 1;

	public Banco() {
		this.clientes = new ArrayList<>();
		this.contas = new ArrayList<>();
	}

	public void adicionarCliente(Cliente cliente) {
		this.clientes.add(cliente);
		String numeroContaCorrente = String.valueOf(contadorContas++);
		String numeroContaPoupanca = String.valueOf(contadorContas++);
		
		ContaCorrente cc = new ContaCorrente(AGENCIA_PADRAO, numeroContaCorrente, 1000.0);
		ContaPoupanca cp = new ContaPoupanca(AGENCIA_PADRAO, numeroContaPoupanca);

		this.contas.add(cc);
		this.contas.add(cp);

		System.out.println("Conta Corrente e Poupança criadas com sucesso para o cliente " + cliente.getNome() + ".");
		System.out.println("Número da Conta Corrente: " + numeroContaCorrente);
		System.out.println("Número da Conta Poupança: " + numeroContaPoupanca);
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public Cliente buscarClientePorCpf(String cpf) {
		for (Cliente cliente : clientes) {
			if (cliente.getCpf().equals(cpf)) {
				return cliente;
			}
		}
		return null;
	}

	public Conta buscarContaPorAgenciaENumero(String agencia, String numero) {
		for (Conta conta : contas) {
			if (conta.getAgencia().equals(agencia) && conta.getNumero().equals(numero)) {
				return conta;
			}
		}
		return null;
	}

	public void imprimirExtrato (String agencia, String numeroCorrente, String numeroPoupança) {
		Conta contaCorrente = buscarContaPorAgenciaENumero(agencia, numeroCorrente);
		Conta contaPoupança = buscarContaPorAgenciaENumero(agencia, numeroPoupança);
		
		if (contaCorrente == null || contaPoupança == null) {
			System.out.println("Uma ou ambas as contas não foram encontradas");
			return;
		}

		System.out.println("======Extrato======");
		System.out.println("----Conta Corrente----");
		contaCorrente.imprimirExtrato();
		System.out.println("----Conta Poupança----");
		contaPoupança.imprimirExtrato();
	}

}
