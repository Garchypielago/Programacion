package arrayObjetos;

public class Circulo {
	double x, y, r;
	final double PI = 3.1416;

	Circulo(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	Circulo(double r) {
		this.x = 0;
		this.y = 0;
		this.r = r;
	}

	Circulo() {
		this.x = 0;
		this.y = 0;
		this.r = 1;
	}

	public double area() {

		return PI * r * r;

	}

	public double longitud() {

		return 2 * PI * r;

	}

	/*
	 * public void imprimir(){ System.out.println("El circulo de centro (" + this.x
	 * + "," + this.y + ") y radio " + r + "  y tiene un area de " + area() +
	 * " y longitud " + longitud()); }
	 */

	public String toString() {
		return "El circulo de centro (" + this.x + "," + this.y + ") y radio " + r + "  y tiene un area de " + area()
				+ " y longitud " +longitud();
	}
}
