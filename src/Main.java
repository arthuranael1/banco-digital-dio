public class Main {

	public static void main(String[] args) {
		Cliente alessandro = new Cliente();
		Banco banco = new Banco();
		banco.setNome("Banco XYZ");

		Conta cc = new ContaCorrente(alessandro);
		Conta poupanca = new ContaPoupanca(alessandro);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		System.out.println("Moeda Oficial do Banco: " + banco.getMoedaOficial());
	}
}