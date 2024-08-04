package service;

import model.Conta;

public interface ContaService {
    
    void sacar(Conta conta, double valor);
	
	void depositar(Conta conta, double valor);
	
	void transferir(Conta conta, double valor, Conta destino);
	
	void imprimirExtrato(Conta conta);
}
