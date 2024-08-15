import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Banco banco = new Banco();

		while (true) {
			System.out.println("1. Adicionar cliente");
			System.out.println("2. Ver todos os Usuários");
			System.out.println("3. Buscar cliente por CPF");
			System.out.println("4. Depositar");
			System.out.println("5. Sacar");
			System.out.println("6. Transferir");
			System.out.println("7. Imprimir extrato");
			System.out.println("8. Sair");
			System.out.print("Escolha uma opção: ");
			int opção = scanner.nextInt();
			scanner.nextLine();

			switch (opção) {
				case 1:
					System.out.print("Nome: ");
					String nome = scanner.nextLine();
					System.out.print("CPF: ");
					String cpf = scanner.nextLine();
					System.out.print("Endereço: ");
					String endereço = scanner.nextLine();
					System.out.print("Telefone: ");
					String telefone = scanner.nextLine();
					
					try {
						Cliente cliente = new Cliente(nome, cpf, endereço, telefone);
						banco.adicionarCliente(cliente);
						System.out.println("Cliente e contas adicionados com sucesso");
					} catch (IllegalArgumentException e) {
						System.out.println("Erro ao adicionar cliente: " + e.getMessage());
					}
					break;
				case 2:
					System.out.println("Lista de clientes:");
					for (Cliente c : banco.getClientes()) {
						System.out.println(c);
					}
					break;
				case 3:
					System.out.print("CPF: ");
					String cpfBusca = scanner.nextLine();
					Cliente clienteEncontrado = banco.buscarClientePorCpf(cpfBusca);
					if (clienteEncontrado != null) {
						System.out.println("Cliente encontrado: " + clienteEncontrado);
					} else {
						System.out.println("Cliente não encontrado");
					}
					break;
				case 4:
					System.out.print("Agência da Conta: ");
					String agenciaDeposito = scanner.nextLine();
					System.out.print("Número da conta: ");
					String numeroDeposito = scanner.nextLine();
					System.out.print("Valor do Depósito: ");
					double valorDeposito = scanner.nextDouble();
					scanner.nextLine();
					Conta contaDeposito = banco.buscarContaPorAgenciaENumero(agenciaDeposito, numeroDeposito);
					if (contaDeposito != null) {
						contaDeposito.depositar(valorDeposito);
						System.out.println("Depósito realizado com sucesso!");
					} else {
						System.out.println("Conta não encontrada");
					}
					break;
				case 5:
					System.out.print("Agência da Conta: ");
					String agenciaSaque = scanner.nextLine();
					System.out.print("Número da Conta: ");
					String numeroSaque = scanner.nextLine();
					System.out.print("Valor do Saque: ");
					double valorSaque = scanner.nextDouble();
					scanner.nextLine();
					Conta contaSaque = banco.buscarContaPorAgenciaENumero(agenciaSaque, numeroSaque);
					if (contaSaque != null) {
						contaSaque.sacar(valorSaque);
						System.out.println("Saque realizado com sucesso!");
					} else {
						System.out.println("Conta não encontrada");
					}
					break;
				case 6:
					System.out.print("Agência da Conta: ");
					String agenciaTrasnf = scanner.nextLine();
					System.out.print("Número da Conta: ");
					String numeroTrasnf = scanner.nextLine();
					System.out.print("Valor da Transferência: ");
					double valorTrasnf = scanner.nextDouble();
					scanner.nextLine();
					Conta contaTransf = banco.buscarContaPorAgenciaENumero(agenciaTrasnf, numeroTrasnf);
					if (contaTransf != null) {
						contaTransf.transferir(valorTrasnf, contaTransf);
						System.out.println("Transferência realizada com sucesso!");
					} else {
						System.out.println("Conta não encontrada");
					}
					break;
				case 7:
					System.out.print("Agência da Conta: ");
					String agenciaExtrato = scanner.nextLine();
					System.out.print("Número da Conta Corrente: ");
					String numeroExtratoCorrente = scanner.nextLine();
					System.out.print("Número da Conta Poupança: ");
					String numeroExtratoPoupanca = scanner.nextLine();
					banco.imprimirExtrato(agenciaExtrato, numeroExtratoCorrente, numeroExtratoPoupanca);
					break;
				case 8:
					System.out.println("Saindo...");
					scanner.close();
					return;
				default:
					System.out.println("Opção inválida. Tente novamente.");
					}
			}
	}
}