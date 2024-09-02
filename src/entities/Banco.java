package entities;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;
	
	public Banco() {
		
	}

	public Banco(String nome, List<Conta> contas) {
		super();
		this.nome = nome;
		this.contas = contas;
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
	
	public void addConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public void deleteConta(Conta conta) {
		this.contas.remove(conta);
	}

}
