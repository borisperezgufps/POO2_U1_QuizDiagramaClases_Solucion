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
		
		int idInscripcion = (int)Math.random()*1000;
		
		Inscripcion i = new Inscripcion(idInscripcion, formaPago);
		i.registrarMascota(nombreMascota, raza, edad, tipoMascota, intensidadLadrido, requiereZonaVerde, estaEntrenado, alimentosNoTolerables, cazaAnimalesPequenios);
		
		Competencia comp = null;		
		
		// Buscar competencias
		for (int j = 0; j < competencias.size(); j++) {
			Competencia c = competencias.get(j);
			if(c.getId().equals(idCompetencia)){
				comp = c;
				break;
			}
		}
		
		Persona pers = null;
		
		// Buscar personas
		for (int j = 0; j < personas.size(); j++) {
			Persona p = personas.get(j);
			if(p.getDocumentoIdentidad().equals(documentoIdentidadDuenio)) {
				pers = p;
				break;
			}
		}
		
		
		i.asignarDuenioMascota(pers);
		i.asignarCompetenciaMascota(comp);
		inscripciones.add(i);
		
		
		return "";
	}

}
