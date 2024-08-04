package service;

import model.Agencia;
import model.Conta;

public interface AgenciaService {
    
    void saveConta(Agencia agencia, Conta conta);
    public void getClientes(Agencia agencia);
}
