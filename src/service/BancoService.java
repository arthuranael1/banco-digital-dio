package service;

import model.Agencia;
import model.Banco;

public interface BancoService {
    
    void saveAgencia(Banco banco, Agencia agencia);
    void getAgencias(Banco banco);
}
