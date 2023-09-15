package poo2.quiz.negocio;

public class Mascota {

	private String nombre;
	private String raza;
	private int edad;
	private String id;
	
	private Persona dueño;
	
	public Mascota() {
		
	}

	public Mascota(String nombre, String raza, int edad, String id, Persona dueño) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.id = id;
		this.dueño = dueño;
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

	public Persona getDueño() {
		return dueño;
	}

	public void setDueño(Persona dueño) {
		this.dueño = dueño;
	}
	
	
	
}
