package poo2.quiz.negocio;

import java.util.ArrayList;

public class Concurso {

	private ArrayList<Persona> personas;
	private ArrayList<Competencia> competencias;
	private ArrayList<Inscripcion> inscripciones;

	public Concurso() {
		personas = new ArrayList<Persona>();
		competencias = new ArrayList<Competencia>();
	}

	public void registrarPersona(String nombre, String telefono, String correo, String documentoIdentidad)
			throws Exception {

		// Busca que no exista alguien mas con ese documento
		boolean personaExistente = false;
		for (Persona p : personas) {
			if (p.getDocumentoIdentidad().equals(documentoIdentidad))
				personaExistente = true;
		}

		if (!personaExistente) {
			Persona p = new Persona(nombre, telefono, correo, documentoIdentidad);
			personas.add(p);
		} else
			throw new Exception("La persona ya existe. Verifique el documento de identidad");
	}

	public void crearCompetencia(String organizador, String tipo, String nombre, String id) throws Exception {
		// Busca que no exista alguien mas con ese documento
		boolean competenciaExistente = false;
		for (Competencia p : competencias) {
			if (p.getId().equals(id))
				competenciaExistente = true;
		}

		if (!competenciaExistente) {
			Competencia p = new Competencia(organizador, tipo, nombre, id);
			competencias.add(p);
		} else
			throw new Exception("La competencia ya existe. Verifique el id de la competencia");
	}
	
	public String inscribirMascota(String nombreMascota, String raza, int edad, String tipoMascota, 
			int intensidadLadrido, boolean requiereZonaVerde, boolean estaEntrenado, String alimentosNoTolerables, 
			boolean cazaAnimalesPequenios, String documentoIdentidadDuenio, String idCompetencia, String formaPago) {
		
		Inscripcion i;
		
		return "";
	}

}
