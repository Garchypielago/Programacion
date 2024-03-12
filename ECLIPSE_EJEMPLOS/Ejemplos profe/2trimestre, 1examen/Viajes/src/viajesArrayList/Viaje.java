<<<<<<< HEAD
package viajesArrayList;
public class Viaje {
	private String origen;
	private String destino;
	private double distancia;
	
	public Viaje (String origen, String destino, double distancia){
		this.origen = origen;
		this.destino = destino;
		this.distancia = distancia;
	}
	
	public String getOrigen() {
		return origen;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public double getDistancia() {
		return distancia;
	}
	
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	/**
	 * 
	 * Hacemos 2 versiones: una estatica, que debe recibir dos viajes
	 * y otra que relaciona el objeto viaje que llama al metodo con el 
	 * viaje recibido.
	 */
	public static Viaje uneViaje(Viaje v1, Viaje v2) {
		Viaje nuevoViaje;

		if (v1.destino.compareToIgnoreCase(v2.origen) == 0)
			nuevoViaje = new Viaje(v1.origen, v2.destino, v1.distancia + v2.distancia);
		else
			nuevoViaje = new Viaje(v1.origen, v2.destino, -1);

		return nuevoViaje;
	}
	
	/*
	 * Si el viaje devuelto tiene su valor distancia a -1, quiere decir que
	 * es un viaje que no es posible hacer
	 */
	public Viaje uneViaje(Viaje v) {
		Viaje nuevoViaje;
	
		if (destino.compareToIgnoreCase(v.origen)==0)
			nuevoViaje = new Viaje(origen, v.destino, distancia+v.distancia);
	    else
	    	nuevoViaje = new Viaje(origen, v.destino, -1);
	    	
	   return nuevoViaje;
	}
	
	public String toString(){		
		return "\nOrigen " + origen + "\nDestino " + destino + "\nDistancia " +	distancia;		
	}
	
=======
package viajesArrayList;
public class Viaje {
	private String origen;
	private String destino;
	private double distancia;
	
	public Viaje (String origen, String destino, double distancia){
		this.origen = origen;
		this.destino = destino;
		this.distancia = distancia;
	}
	
	public String getOrigen() {
		return origen;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public double getDistancia() {
		return distancia;
	}
	
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	/**
	 * 
	 * Hacemos 2 versiones: una estatica, que debe recibir dos viajes
	 * y otra que relaciona el objeto viaje que llama al metodo con el 
	 * viaje recibido.
	 */
	public static Viaje uneViaje(Viaje v1, Viaje v2) {
		Viaje nuevoViaje;

		if (v1.destino.compareToIgnoreCase(v2.origen) == 0)
			nuevoViaje = new Viaje(v1.origen, v2.destino, v1.distancia + v2.distancia);
		else
			nuevoViaje = new Viaje(v1.origen, v2.destino, -1);

		return nuevoViaje;
	}
	
	/*
	 * Si el viaje devuelto tiene su valor distancia a -1, quiere decir que
	 * es un viaje que no es posible hacer
	 */
	public Viaje uneViaje(Viaje v) {
		Viaje nuevoViaje;
	
		if (destino.compareToIgnoreCase(v.origen)==0)
			nuevoViaje = new Viaje(origen, v.destino, distancia+v.distancia);
	    else
	    	nuevoViaje = new Viaje(origen, v.destino, -1);
	    	
	   return nuevoViaje;
	}
	
	public String toString(){		
		return "\nOrigen " + origen + "\nDestino " + destino + "\nDistancia " +	distancia;		
	}
	
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
}