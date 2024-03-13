package PuntoTriangulo;

public class Triangulo {
	private Punto a, b, c;

	public Triangulo(Punto a, Punto b, Punto c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Punto getA() {
		return a;
	}

	public void setA(Punto a) {
		this.a = a;
	}

	public Punto getB() {
		return b;
	}

	public void setB(Punto b) {
		this.b = b;
	}

	public Punto getC() {
		return c;
	}

	public void setC(Punto c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Triangulo [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	public double[] calcularLados() {
		double[] lados = new double[3];

		lados[0] = a.distanciaAPunto(b);
		lados[1] = b.distanciaAPunto(c);
		lados[2] = c.distanciaAPunto(a);

		return lados;
	}

}
