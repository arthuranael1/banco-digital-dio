package model;

public abstract class Conta {
	
	private static int id = 1;

	protected int numero;
	protected double saldo;
	protected Agencia agencia;
	protected Cliente cliente;

	public Conta(Agencia agencia, Cliente cliente) {
		this.agencia = agencia;
		this.numero = id++;
		this.cliente = cliente;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
