package poo2.quiz.negocio;

import java.util.Calendar;

public class Inscripcion {

	private int id;
	private String formaPago;
	private double costo;
	private Calendar fechaPago;
	
	private Competencia competencia;
	private Mascota mascota;
	
	public Inscripcion(int id, String formaPago) {
		super();
		this.id = id;
		this.formaPago = formaPago;
		this.costo = 25000;
	}
	
	/**
	 * 
	 * @param nombreMascota
	 * @param raza
	 * @param edad
	 * @param tipoMascota Perro o Gato
	 * @param intensidadLadrido
	 * @param requiereZonaVerde
	 * @param estaEntrenado
	 * @param alimentosNoTolerables
	 * @param cazaAnimalesPequenios
	 */
	public void registrarMascota(String nombreMascota, String raza, int edad, String tipoMascota, 
			int intensidadLadrido, boolean requiereZonaVerde, boolean estaEntrenado, String alimentosNoTolerables, 
			boolean cazaAnimalesPequenios){
		
		String id = String.valueOf((int)(Math.random()*1000));
		
		if(tipoMascota.equals("Perro")) {
			
			Perro p = new Perro(nombreMascota, raza, edad, id, intensidadLadrido, requiereZonaVerde, estaEntrenado);
			mascota = p;
			
		}else if(tipoMascota.equals("Gato")) {
			
			Gato g = new Gato(nombreMascota, raza, edad, id, alimentosNoTolerables, cazaAnimalesPequenios);
			mascota = g;
			
		}
	}
	
	
	public void asignarCompetenciaMascota(Competencia c) {
		this.setCompetencia(c);
	}
	
	public void asignarDuenioMascota(Persona p) {
		Mascota m = getMascota();
		m.setDueño(p);
	}
	
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public Calendar getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(Calendar fechaPago) {
		this.fechaPago = fechaPago;
	}
	public Competencia getCompetencia() {
		return competencia;
	}
	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
	}
	public Mascota getMascota() {
		return mascota;
	}
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
	
	
	
}
