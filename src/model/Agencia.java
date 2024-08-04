package model;

import java.util.ArrayList;
import java.util.List;

public class Agencia {

    private static int id = 1; 
    
    private int numero;
    private Banco banco;
    private List<Conta> contas;

    public Agencia(Banco banco) {
        this.numero = id++;
        this.banco = banco;
        this.contas = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public List<Conta> getContas() {
        return this.contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
