package poo2.quiz.negocio;

import java.util.ArrayList;

public class Persona {

	private String nombre;
	private String telefono;
	private String correo;
	private String documentoIdentidad;

	private ArrayList<Mascota> mascotas;

	public Persona(String nombre, String telefono, String correo, String documentoIdentidad) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
		this.documentoIdentidad = documentoIdentidad;

		mascotas = new ArrayList<Mascota>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDocumentoIdentidad() {
		return documentoIdentidad;
	}

	public void setDocumentoIdentidad(String documentoIdentidad) {
		this.documentoIdentidad = documentoIdentidad;
	}
	public void addMascota(Mascota m) {
		mascotas.add(m);
	}

}
