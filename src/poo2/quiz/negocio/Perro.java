package poo2.quiz.negocio;

public class Perro extends Mascota{

	private int intensidadLadrido;
	private boolean requiereZonaVerde;
	private boolean estaEntrenado;
	
	public Perro(String nombreMascota, String raza, int edad, String id, int intensidadLadrido, boolean requiereZonaVerde, boolean estaEntrenado) {
		super(nombreMascota, raza, edad, id);
		this.intensidadLadrido = intensidadLadrido;
		this.requiereZonaVerde = requiereZonaVerde;
		this.estaEntrenado = estaEntrenado;
	}
	
	
	
	public int getIntensidadLadrido() {
		return intensidadLadrido;
	}
	public void setIntensidadLadrido(int intensidadLadrido) {
		this.intensidadLadrido = intensidadLadrido;
	}
	public boolean isRequiereZonaVerde() {
		return requiereZonaVerde;
	}
	public void setRequiereZonaVerde(boolean requiereZonaVerde) {
		this.requiereZonaVerde = requiereZonaVerde;
	}
	public boolean isEstaEntrenado() {
		return estaEntrenado;
	}
	public void setEstaEntrenado(boolean estaEntrenado) {
		this.estaEntrenado = estaEntrenado;
	}
	
	
	
}
