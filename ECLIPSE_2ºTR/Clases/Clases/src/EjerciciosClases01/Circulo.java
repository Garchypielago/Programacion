<<<<<<< HEAD
package EjerciciosClases01;

public class Circulo {
	private double x, y, radio;
	private Punto2 c;

	public Circulo() {
		super();
		radio=1;
	}

	public Circulo(double radio) {
		super();
		c= new Punto2(0,0);
		this.radio = radio;
	}

	public Circulo(double x, double y, double radio) {
		super();
		this.x = x;
		this.y = y;
		this.radio = radio;
	}
	
	public Circulo(Punto2 p, double radio) {
		super();
		this.radio=radio;
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

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double areaCirculo() {
		double area=Math.PI*Math.pow(radio, 2);
		
		return area;
	}
	
	public double longitudCirculo() {
		double longitud=2*Math.PI*radio;
		
		return longitud;
	}
	
	public void mostrarCalculos() {
		double area= areaCirculo(), longitud=longitudCirculo();		
		
		System.out.println("El area es: " + area + ", y la logitud: " + longitud + ".");
	}
}
=======
package EjerciciosClases01;

public class Circulo {
	private double x, y, radio;
	private Punto2 c;

	public Circulo() {
		super();
		radio=1;
	}

	public Circulo(double radio) {
		super();
		c= new Punto2(0,0);
		this.radio = radio;
	}

	public Circulo(double x, double y, double radio) {
		super();
		this.x = x;
		this.y = y;
		this.radio = radio;
	}
	
	public Circulo(Punto2 p, double radio) {
		super();
		this.radio=radio;
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

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double areaCirculo() {
		double area=Math.PI*Math.pow(radio, 2);
		
		return area;
	}
	
	public double longitudCirculo() {
		double longitud=2*Math.PI*radio;
		
		return longitud;
	}
	
	public void mostrarCalculos() {
		double area= areaCirculo(), longitud=longitudCirculo();		
		
		System.out.println("El area es: " + area + ", y la logitud: " + longitud + ".");
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
