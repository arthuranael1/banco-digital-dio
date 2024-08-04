package resource;

import model.Conta;
import service.ContaService;
import service.serviceImpl.ContaServiceImpl;

public class ContaResource {

    ContaService contaService = new ContaServiceImpl();

    public void sacar(Conta conta, double valor) {
        contaService.sacar(conta, valor);
    }
	
	public void depositar(Conta conta, double valor) {
        contaService.depositar(conta, valor);
    }
	
	public void transferir(Conta conta, double valor, Conta destino) {
        contaService.transferir(conta, valor, destino);
    }
	
	public void imprimirExtrato(Conta conta) {
        contaService.imprimirExtrato(conta);
    }
}
