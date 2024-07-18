public class ContaInvestimento extends Conta{
    public ContaInvestimento(Cliente cliente) {
        super(cliente);
    }

    public void investir(){
        int numeroRandom = (int) (Math.random()* 100);
        int prejuizo = (int) (Math.random()* 2);
        if(prejuizo == 1){
            saldo -= ((double) numeroRandom /100) * saldo;
        }else
            saldo += ((double) numeroRandom /100) * saldo;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Investimento ===");
        super.imprimirInfosComuns();
    }
}
