package poo2.quiz.negocio;

public class Gato extends Mascota {

	private String alimentosNoTolerables;
	private boolean cazaAnimalesPequenios;
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
	public Gato(String alimentosNoTolerables, boolean cazaAnimalesPequenios) {
		super();
		this.alimentosNoTolerables = alimentosNoTolerables;
		this.cazaAnimalesPequenios = cazaAnimalesPequenios;
	}
	
	
	
}
