public class App {
    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");
        venilton.setCpf("123.456.789-00");
        venilton.setTelefone("11987654321");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        CartaoCredito cartao = new CartaoCredito("1234-5678-9012-3456", venilton.getNome(), "12/25", 5000);
        cartao.realizarCompra(300);
        System.out.println("Saldo Devedor do Cartão: " + cartao.getSaldoDevedor());
    }
}
