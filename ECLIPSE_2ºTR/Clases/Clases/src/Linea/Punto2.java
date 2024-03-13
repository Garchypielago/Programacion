package Linea;
// Punto.java: clase Punto

public class Punto2 {
	private int x;
	private int y;

	public Punto2() {
	}

	public Punto2(int _x, int _y) {
		x = _x;
		y = _y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int _x) {
		x = _x;
	}

	public void setY(int _y) {
		y = _y;
	}

	/**********************************************************************/
	/* 																	  */
	/* Distancia de un punto a otro que se pasa por parametro 			  */
	/*									  								  */
	/**********************************************************************/
	public double distancia(Punto2 p) {
		return Math.sqrt((p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y));
	}
	

	public String toString() {
		return ("(" + x + "," + y + ")");
	}

}
