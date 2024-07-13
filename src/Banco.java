import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void adicionarConta(Conta c) {
		contas.add(c);
	}

	public void exibirTodasContas() {
		for (Conta c : contas) {
			c.imprimirInfosComuns();
		}
	}

	public void apagarConta(int numero) {
		Conta contaApagar = null;
		if (!contas.isEmpty())
			for (Conta c : contas) {
				if (c.getNumero() == numero) {
					contaApagar = c;
					break;
				}
			}

		if (contaApagar.getSaldo() == 0)
			contas.remove(contaApagar);
		else
			System.out.println("Conta " + numero + " não pode ser removida, pois há saldo disponível!");
	}

}
