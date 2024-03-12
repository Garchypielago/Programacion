package triangulos;

public class Triangulo {
	private double b, h;

	public Triangulo(double b, double h) {
		this.b = b;
		this.h = h;
	}

	/*******************************************************/
	/* area: devuelve el area de un triangulo */
	/*******************************************************/
	public double area() {
		double a;

		a = (double) b * h / 2;

		return a;
	}

	/*******************************************************/
	/* perimetro: devuelve el perimetro de un triangulo */
	/*******************************************************/
	public double perimetro() {
		double p;
		double l = getLadoIgual();

		p = 2 * l + b;

		return p;
	}

	/*******************************************************/
	/* setBase: modifica la base de un triangulo */
	/*******************************************************/
	public void setBase(int base) {
		b = base;
	}

	/*******************************************************/
	/* setAltura: modifica la altura de un triangulo */
	/*******************************************************/
	public void setAltura(double altura) {
		h = altura;
	}

	/*******************************************************/
	/* getBase: devuelve la base de un triangulo */
	/*******************************************************/
	public double getBase() {
		return b;
	}

	/*******************************************************/
	/* getAltura: devuelve la altura de un triangulo */
	/*******************************************************/
	public double getAltura() {
		return h;
	}

	/*******************************************************/
	/* getLadoIgual: devuelve el valor del lado igual */
	/*******************************************************/
	public double getLadoIgual() {
		return (Math.sqrt(Math.pow((b / 2), 2) + Math.pow(h, 2)));
	}

	/*********************************************************/
	/* toString: convierte en cadena el objeto para imprimir */
	/*********************************************************/
	public String toString() {
		return ("\nBase " + b + "\nAltura " + h + "\n");
	}
}