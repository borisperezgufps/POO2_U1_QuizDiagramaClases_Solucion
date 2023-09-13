package poo2.quiz.negocio;

public class Competencia {

	private String organizador;
	private String tipo; 
	private String nombre; 
	private String id;
	
	public String getOrganizador() {
		return organizador;
	}
	public void setOrganizador(String organizador) {
		this.organizador = organizador;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Competencia(String organizador, String tipo, String nombre, String id) {
		super();
		this.organizador = organizador;
		this.tipo = tipo;
		this.nombre = nombre;
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
