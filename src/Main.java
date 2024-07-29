public class Main {
    public static void main(String[] args) {
        // Criar clientes
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00");

        // Criar contas
        ContaCorrente cc = new ContaCorrente("12345", cliente1, 10.00);
        ContaPoupanca cp = new ContaPoupanca("54321", cliente2, 0.01);

        // Criar banco e adicionar contas
        Banco banco = new Banco("Banco Digital");
        banco.adicionarConta(cc);
        banco.adicionarConta(cp);

        // Realizar operações
        cc.depositar(1000.00);
        cp.depositar(2000.00);

        cc.sacar(100.00);
        cp.sacar(50.00);

        cc.transferir(cp, 200.00);
        cp.transferir(cc, 150.00);

        cc.cobrarTaxa();
        cp.aplicarRendimento();

        // Exibir informações das contas
        System.out.println("Conta Corrente: " + cc);
        System.out.println("Conta Poupança: " + cp);

        // Buscar conta
        IConta contaBuscada = banco.buscarContaPorNumero("12345");
        if (contaBuscada != null) {
            System.out.println("Conta encontrada: " + contaBuscada);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }
}
