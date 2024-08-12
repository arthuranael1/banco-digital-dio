package models;

import interfaces.IConta;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected String emprestimo;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}


	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getEmprestimoDisponivel(){
		if (saldo <= 1000)
			return "Empréstimo não disponível";
		else if (saldo > 1500 && saldo < 5000) 
			return "Empréstimo de 5 mil disponível";
		else if (saldo > 5000 && saldo < 10000)
			return "Empréstimo de 20 mil disponível";
		else
			return "Você está elegível para o emprestimo de 20 mil, para valores superior, fale com seu gerente!";
		
	}

	protected void ImprimeInformacoesClientes() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	protected void verificarEmprestimo(){
		System.out.println(getEmprestimoDisponivel());
	}
}
