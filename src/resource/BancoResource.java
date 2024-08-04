package resource;

import model.Agencia;
import model.Banco;
import service.BancoService;
import service.serviceImpl.BancoServiceImpl;

public class BancoResource {
    
    BancoService bancoService = new BancoServiceImpl();

    public void saveAgencia(Banco banco, Agencia agencia) {
        bancoService.saveAgencia(banco, agencia);
    }

    public void getAgencias(Banco banco) {
        bancoService.getAgencias(banco);
    } 
}
