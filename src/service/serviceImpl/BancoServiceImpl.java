package service.serviceImpl;

import java.util.List;

import model.Agencia;
import model.Banco;
import service.BancoService;

public class BancoServiceImpl implements BancoService {

    @Override
    public void saveAgencia(Banco banco, Agencia agencia) {
        List<Agencia> agencias = banco.getAgencias();
        agencias.add(agencia);
        banco.setAgencias(agencias);
    }

    @Override
    public void getAgencias(Banco banco) {
        List<Agencia> agencias = banco.getAgencias();

        System.out.println("\n====== Agências do Banco: " + banco.getNome() + " ======");
        agencias.stream()
            .forEach(agencia -> System.out.println("Agência: " + agencia.getNumero()));
    }
}
