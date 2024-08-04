package resource;

import model.Agencia;
import model.Conta;
import service.AgenciaService;
import service.serviceImpl.AgenciaServiceImpl;

public class AgenciaResource {
    
    AgenciaService agenciaService = new AgenciaServiceImpl();

    public void saveConta(Agencia agencia, Conta conta) {
        agenciaService.saveConta(agencia, conta);
    }

    public void getClientes(Agencia agencia) {
        agenciaService.getClientes(agencia);
    }
}
