package poo2.quiz.negocio;

public class Gato extends Mascota {

	private String alimentosNoTolerables;
	private boolean cazaAnimalesPequenios;
	
	public Gato(String nombreMascota, String raza, int edad, String id, String alimentosNoTolerables, boolean cazaAnimalesPequenios) {
		super(nombreMascota, raza, edad, id);
		this.alimentosNoTolerables = alimentosNoTolerables;
		this.cazaAnimalesPequenios = cazaAnimalesPequenios;
	}
	
	
	public String getAlimentosNoTolerables() {
		return alimentosNoTolerables;
	}
	public void setAlimentosNoTolerables(String alimentosNoTolerables) {
		this.alimentosNoTolerables = alimentosNoTolerables;
	}
	public boolean isCazaAnimalesPequenios() {
		return cazaAnimalesPequenios;
	}
	public void setCazaAnimalesPequenios(boolean cazaAnimalesPequenios) {
		this.cazaAnimalesPequenios = cazaAnimalesPequenios;
	}
	
	
	
	
	
}
