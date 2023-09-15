package poo2.quiz.negocio;

public class Mascota {

	private String nombre;
	private String raza;
	private int edad;
	private String id;
	
	private Persona due�o;
	
	public Mascota() {
		
	}

	public Mascota(String nombre, String raza, int edad, String id, Persona due�o) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.id = id;
		this.due�o = due�o;
	}
	
	public Mascota(String nombre, String raza, int edad, String id) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Persona getDue�o() {
		return due�o;
	}

	public void setDue�o(Persona due�o) {
		this.due�o = due�o;
	}
	
	
	
}
