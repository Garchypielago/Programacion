package PuntoTriangulo;

public class Punto {
	private double x, y;

	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public double distanciaAlOrigen() {
		double distancia = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

		return distancia;
	}

	public double distanciaAPunto(Punto a) {
		double distancia = Math.sqrt((Math.pow(x - a.x, 2) + Math.pow(y - a.y, 2)));

		return distancia;
	}

	public int cuadrante() {
		if (x > 0 && y > 0)
			return 1;
		else if (x < 0 && y > 0)
			return 2;
		else if (x < 0 && y < 0)
			return 3;
		else if (x > 0 && y < 0)
			return 4;
		else
			return 0;
	}

	public Punto masCercano(java.util.ArrayList puntos) {
		double distanciaFinal = distanciaAPunto((Punto) puntos.get(0));
		Punto a = null, cercano = (Punto) puntos.get(0);

		for (int i = 0; i < puntos.size(); i++) {
			a = (Punto) puntos.get(i);

			if (distanciaFinal > distanciaAPunto(a)) {
				distanciaFinal = distanciaAPunto(a);
				cercano = (Punto) puntos.get(i);
			}

		}

		return cercano;
	}
}
