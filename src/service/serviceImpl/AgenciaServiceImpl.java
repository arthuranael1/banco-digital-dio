package service.serviceImpl;

import java.util.List;

import model.Agencia;
import model.Conta;
import service.AgenciaService;

public class AgenciaServiceImpl implements AgenciaService {

    @Override
    public void saveConta(Agencia agencia, Conta conta) {
        List<Conta> contas = agencia.getContas();
        contas.add(conta);
        agencia.setContas(contas);
    }

    @Override
    public void getClientes(Agencia agencia) {
        List<Conta> contas = agencia.getContas();

        System.out.println("\n====== Banco: " + agencia.getBanco().getNome() + " - Agência: " + agencia.getNumero() + " ======");
        System.out.println("\t\tClientes");
        contas.stream()
            .forEach(conta -> System.out.println("Cliente: " + conta.getCliente().getNome()));
    }
}
