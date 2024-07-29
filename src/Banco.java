import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<IConta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<IConta> getContas() {
        return contas;
    }

    public void adicionarConta(IConta conta) {
        contas.add(conta);
    }

    public IConta buscarContaPorNumero(String numeroConta) {
        for (IConta conta : contas) {
            if (conta instanceof Conta) {
                Conta contaBanco = (Conta) conta;
                if (contaBanco.getNumeroConta().equals(numeroConta)) {
                    return conta;
                }
            }
        }
        return null;
    }
}
