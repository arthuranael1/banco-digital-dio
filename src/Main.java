
public class Main {

	public static void main(String[] args) {

		Procesos procesosBancarios = new Procesos();
		procesosBancarios.personasEnEsperaAperturaCuenta();
		procesosBancarios.creandoLosNuevosClientes();
		procesosBancarios.listarTodosLosClientes();
		procesosBancarios.listarPersonasRechazadasPorEdad();
		procesosBancarios.creandoLasCuentasDeCliente();

	}

}
