import model.Agencia;
import model.Banco;
import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;
import resource.AgenciaResource;
import resource.BancoResource;
import resource.ContaResource;

public class Main {

	public static void main(String[] args) {
		BancoResource bancoResource = new BancoResource();
		AgenciaResource agenciaResource = new AgenciaResource();
		ContaResource contaResource = new ContaResource();

		Banco bradesco = new Banco("Bradesco");
		Agencia agencia = new Agencia(bradesco);

		bancoResource.saveAgencia(bradesco, agencia);

		Cliente leo = new Cliente("Leo");
		Conta cc = new ContaCorrente(agencia, leo);
		Conta poupanca = new ContaPoupanca(agencia, leo);

		agenciaResource.saveConta(agencia, cc);
		agenciaResource.saveConta(agencia, poupanca);

		contaResource.depositar(cc, 100);
		contaResource.transferir(cc, 100, poupanca);

		contaResource.imprimirExtrato(cc);
		contaResource.imprimirExtrato(poupanca);

		bancoResource.getAgencias(bradesco);

		agenciaResource.getClientes(agencia);
	}
}