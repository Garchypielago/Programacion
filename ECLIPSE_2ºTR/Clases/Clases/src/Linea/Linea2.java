package Linea;
/* Los puntos extremos de la linea vienen dados por dos puntosy */

public class Linea2 {
	private Punto2 p1, p2;

	public Linea2() {}
	
	public Linea2(Punto2 p1, Punto2 p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public Punto2 getP1() {
		return p1;
	}
	
	public void setP1(Punto2 p1) {
		this.p1 = p1;
	}
	
	public Punto2 getP2() {
		return p2;
	}
	public void setP2(Punto2 p2) {
		this.p2 = p2;
	}
	
	public double longitud() {		 		
		 return p1.distancia(p2);
	}
		
	public String toString() {
	      return p1 + ", " + p2;
	}
	
}
