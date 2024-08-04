import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;
import resource.ContaResource;

public class Main {

	public static void main(String[] args) {
		ContaResource contaResource = new ContaResource();

		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		contaResource.depositar(cc, 100);
		contaResource.transferir(cc, 100, poupanca);

		contaResource.imprimirExtrato(cc);
		contaResource.imprimirExtrato(poupanca);
	}
}