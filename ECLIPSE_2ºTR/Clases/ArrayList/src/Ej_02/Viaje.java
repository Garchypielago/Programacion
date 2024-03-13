package Ej_02;

public class Viaje {
	private String origen, destino;
	private double distancia;
	public Viaje(String origen, String destino, double distancia) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.distancia = distancia;
	}
	
	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public Viaje uneViaje(Viaje a, Viaje b) {
		Viaje c;
		
		if (a.getDestino().equalsIgnoreCase(b.getOrigen()))
			c = new Viaje (a.getOrigen(), b.getDestino(), a.getDistancia() + b.getDistancia());
		else
			c = new Viaje (a.getOrigen(), b.getDestino(), -1);
		
		return c;
	}

	@Override
	public String toString() {
		return "Viaje [origen=" + origen + ", destino=" + destino + ", distancia=" + distancia + "]";
	}
	
	

}
