package capitulo04.Bloque01.PrimerosObjetos;

public class CromoBaloncesto {

	private String nombreJugador;
	private int alturaEnCm;
	private int pesoEnKg;
	private float mediaPuntos;

	public CromoBaloncesto() {
	}

	public CromoBaloncesto(String nombreJugador, int alturaEnCm, int pesoEnKg, float mediaPuntos) {
		this.nombreJugador = nombreJugador;
		this.alturaEnCm = alturaEnCm;
		this.pesoEnKg = pesoEnKg;
		this.mediaPuntos = mediaPuntos;
	}

	public String toString() {
		return "El nombre de jugador es " + nombreJugador + "\n"
				+ "La altura del jugador es: " + alturaEnCm + "\n"
				+ "\nEl peso del jugador es: " + pesoEnKg + "\n"
				+ "La media de puntos es: "	+ mediaPuntos;
	}
	
	
	//Getters y Setters
	
	public String getNombre() {
		return nombreJugador;
	}
	
	public void setNombre(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}
	
	public int getAlturaEnCm() {
		return alturaEnCm;
	}
	
	public void setAlturaEnCm(int alturaEnCm) {
		this.alturaEnCm = alturaEnCm;
	}
	
	public int getPesoEnKg() {
		return pesoEnKg;
	}
	
	public void setPesoEnKg(int pesoEnKg) {
		this.pesoEnKg = pesoEnKg;
	}
	
	public float getMediaPuntos() {
		return mediaPuntos;
	}
	
	public void setMediaPuntos(float mediaPuntos) {
		this.mediaPuntos = mediaPuntos;
	}

}
