

import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		Banco banco = new Banco();
		banco.setNome("Santander");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		ContaInvestimento investimento = new ContaInvestimento(venilton);
		List<Conta> contas = new ArrayList<Conta>();
		contas.add(cc);
		contas.add(poupanca);
		contas.add(investimento);

		banco.setContas(contas);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		investimento.depositar(100);
		investimento.investir();
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		investimento.imprimirExtrato();
		banco.imprimirContas();
	}

}
