# Diagrama de Classes

```mermaid
classDiagram
    class Banco {
        - String nome
        - List~IConta~ contas
        + getInstancia(String nome): Banco
        + adicionarConta(IConta conta): void
        + buscarContaPorNumero(String numeroConta): IConta
    }

    class Cliente {
        - String nome
        + getNome(): String
        + setNome(String nome): void
    }

    class IConta {
        + depositar(double valor): void
        + sacar(double valor): void
        + transferir(IConta contaDestino, double valor): void
        + getSaldo(): double
    }

    class Conta {
        - String numeroConta
        - double saldo
        - Cliente cliente
        + getNumeroConta(): String
        + getCliente(): Cliente
        + getSaldo(): double
        + depositar(double valor): void
        + sacar(double valor): void
        + transferir(IConta contaDestino, double valor): void
    }

    class ContaCorrente {
        - TaxaManutencaoStrategy taxaManutencaoStrategy
        + cobrarTaxa(): void
    }

    class ContaPoupanca {
        - double taxaRendimento
        + aplicarRendimento(): void
    }

    class TaxaManutencaoStrategy {
        + cobrarTaxa(ContaCorrente conta): void
    }

    class TaxaManutencaoFixa {
        - double taxa
        + cobrarTaxa(ContaCorrente conta): void
    }

    class ContaFactory {
        + criarConta(String numeroConta, Cliente cliente): Conta
    }

    class ContaCorrenteFactory {
        - double taxaManutencao
        + criarConta(String numeroConta, Cliente cliente): Conta
    }

    class ContaPoupancaFactory {
        - double taxaRendimento
        + criarConta(String numeroConta, Cliente cliente): Conta
    }

    Banco --> "1" IConta : contas
    ContaCorrente ..|> Conta
    ContaPoupanca ..|> Conta
    ContaCorrenteFactory ..|> ContaFactory
    ContaPoupancaFactory ..|> ContaFactory
    TaxaManutencaoFixa ..|> TaxaManutencaoStrategy
    Conta --> IConta
    ContaCorrente --> TaxaManutencaoStrategy : usa
