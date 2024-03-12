<<<<<<< HEAD
package figuras;

//Clase Rectangulo
public class Rectangulo extends Poligono {

	private double lado1;
	private double lado2;

	public Rectangulo() {
	}

	public Rectangulo(double lado1, double lado2) {
		super(2);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double area() {
		return lado1 * lado2;
	}

	@Override
	public String toString() {
		return super.toString() + "Rectangulo lado1=" + lado1 + ", lado2=" + lado2;
	}
}
=======
package figuras;

//Clase Rectangulo
public class Rectangulo extends Poligono {

	private double lado1;
	private double lado2;

	public Rectangulo() {
	}

	public Rectangulo(double lado1, double lado2) {
		super(2);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double area() {
		return lado1 * lado2;
	}

	@Override
	public String toString() {
		return super.toString() + "Rectangulo lado1=" + lado1 + ", lado2=" + lado2;
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
