
public class Cliente {

	private String nome;
	private String cpf;
	private String endereço;
	private String telefone;

	public Cliente(String nome, String cpf, String endereço, String telefone) {
		this.nome = nome;
		this.cpf = formatarCpf(cpf);
		this.endereço = endereço;
		this.telefone = formatarTelefone(telefone);
	};

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEndereço() {
		return endereço;
	}

	public String getTelefone() {
		return telefone;
	}

	@Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Endereço: " + endereço + ", Telefone: " + telefone;
    }
	
	private String formatarCpf(String cpf) {
		if (cpf == null || cpf.length() != 11) {
			throw new IllegalArgumentException("CPF inválido. Deve conter 11 dígitos");
		}
		return telefone.substring(0, 0) + "(" + telefone.substring(0, 2) + ") " + telefone.substring(2, 7) + " - " + telefone.substring(7, 11);
	}
	
    private String formatarTelefone(String telefone) {
        if (telefone == null || telefone.length() != 11) {
            throw new IllegalArgumentException("Telefone inválido. Deve conter 11 dígitos");
        }
        return telefone.substring(0, 0) + "(" + telefone.substring(0, 2) + ") " + telefone.substring(2, 7) + " - " + telefone.substring(7, 11);
    }

}
