package Linea;

public class Linea3 {
	private Punto3 p1, p2;

	public Linea3() {}
	
	public Linea3(Punto3 p1, Punto3 p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public Punto3 getP1() {
		return p1;
	}
	
	public void setP1(Punto3 p1) {
		this.p1 = p1;
	}
	
	public Punto3 getP2() {
		return p2;
	}
	public void setP2(Punto3 p2) {
		this.p2 = p2;
	}
	
	public double longitud() {		 		
		 return p1.distancia(p2);
	}
	
	// Este metodo se podria trasladar a la clase Punto, haciendo un metodo que
	// decida si un punto forma una linea paralela al eje de las x o las y con otro
	// punto que se pasa por parametro.

	public boolean esLineaParalelaEjes() {
		if ((p1.getX() == p2.getX()) || (p1.getY() == p2.getY())) return true;
		else return false;
	}
	
	// Devuelve la pendiente de esta linea
	public double pendiente() {		
		return  (p2.getY() - p1.getY())/(p2.getX()- p1.getX());
	}
	
	public String toString() {
	      return p1 + ", " + p2;
	}
	
}
