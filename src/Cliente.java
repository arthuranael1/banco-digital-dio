import java.util.Date;

public class Cliente {

	private String nome;
	private Date fechaCreacion;
	private int id;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void llenarFormularioAutomaticamente(Personas persona) {
		nome = persona.getNombre();
		id = persona.getId();
		fechaCreacion = new Date(System.currentTimeMillis());
	}

}
