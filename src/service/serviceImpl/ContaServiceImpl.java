package service.serviceImpl;

import model.Conta;
import service.ContaService;

public class ContaServiceImpl implements ContaService {

    @Override
    public void sacar(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() - valor);
    }

    @Override
    public void depositar(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
    }

    @Override
    public void transferir(Conta conta, double valor, Conta destino) {
        sacar(conta, valor);
        depositar(destino, valor);
    }

    @Override
    public void imprimirExtrato(Conta conta) {
        System.out.println("====== Extrato da Conta ======");
		System.out.println(String.format("Titular: %s", conta.getCliente().getNome()));
		System.out.println(String.format("Agencia: %d", conta.getAgencia()));
		System.out.println(String.format("Numero: %d", conta.getNumero()));
		System.out.println(String.format("Saldo: %.2f", conta.getSaldo()));
    }
}