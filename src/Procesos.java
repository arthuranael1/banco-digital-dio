import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Procesos {

    private List<Personas> listaDeEspera = new ArrayList<>();
    private List<Cliente> listaDeClientes = new ArrayList<>();




    public void personasEnEsperaAperturaCuenta() {
        System.out.println("Lista de Espera para Apertura de cuenta");
        listaDeEspera.add(new Personas((int)(Math.random() * 1000.0),"María",22));
        listaDeEspera.add(new Personas((int)(Math.random() * 1000.0),"Nushi",35));
        listaDeEspera.add(new Personas((int)(Math.random() * 1000.0),"Jose",18));
        listaDeEspera.add(new Personas((int)(Math.random() * 1000.0),"Ali",14));
        listaDeEspera.add(new Personas((int)(Math.random() * 1000.0),"John",23));
        listaDeEspera.add(new Personas((int)(Math.random() * 1000.0),"David",19));
        listaDeEspera.add(new Personas((int)(Math.random() * 1000.0),"Mary",16));
        listaDeEspera.add(new Personas((int)(Math.random() * 1000.0),"Jean",55));
        listaDeEspera.add(new Personas((int)(Math.random() * 1000.0),"Robert",42));
        listaDeEspera.add(new Personas((int)(Math.random() * 1000.0),"Daniel",37));

    }

    private Predicate<Personas> filtrarMayoresDeEdad() {
        return p -> p.getEdad() >= 18;
    }

    private Predicate<Personas> filtrarMenoresDeEdad() {
        return p -> p.getEdad() < 18;
    }

    public void creandoLosNuevosClientes() {
        System.out.println("Crendo Nuevos Clientes");
        listaDeEspera.stream().filter(this.filtrarMayoresDeEdad()).forEach(nuevo -> {

            Cliente cliente = new Cliente();
            cliente.llenarFormularioAutomaticamente(nuevo);

            listaDeClientes.add(cliente);
        });
    }

    public void listarTodosLosClientes() {
        System.out.println("Listando todos los Clientes");
        listaDeClientes.forEach(c -> {
            System.out.println("Cliente: "+c.getId()+" "+c.getNome()+" "+c.getFechaCreacion());
        });
    }

    public void listarPersonasRechazadasPorEdad() {
        System.out.println("Listando Personas Rechazadas por Edad");
        listaDeEspera.stream().filter(this.filtrarMenoresDeEdad()).forEach(p -> {
            System.out.println("Persona: "+p.getNombre()+" "+p.getEdad());
        });
    }

    public void creandoLasCuentasDeCliente() {
        System.out.println("Creando las cuentas bancarias");
        listaDeClientes.forEach(cliente -> {
            Conta corriente = new ContaCorrente(cliente);
            Conta poupanca = new ContaPoupanca(cliente);

            corriente.depositar(Math.random() * 1000);
            corriente.transferir(corriente.saldo * 0.10, poupanca);

            corriente.imprimirExtrato();
            poupanca.imprimirExtrato();
        });
    }

}
