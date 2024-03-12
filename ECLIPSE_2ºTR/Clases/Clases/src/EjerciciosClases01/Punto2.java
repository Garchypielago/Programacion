package EjerciciosClases01;

public class Punto2 {
	private double x, y;

	public Punto2(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Punto2() {
		super();
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
	
	public void coordenadas() {
		System.out.println("(" + x + " , " + y + ")");
	}
	
}
