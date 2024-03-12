<<<<<<< HEAD
package figuras;

public abstract class Poligono {

	private int numLados;

	public Poligono() {
	}

	public Poligono(int numLados) {
		this.numLados = numLados;
	}

	public int getNumLados() {
		return numLados;
	}

	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}

	// Declaracion del metodo abstracto area()
	public abstract double area();

	@Override
	public String toString() {
		return "Poligono numLados=" + numLados + "";
	}

}
=======
package figuras;

public abstract class Poligono {

	private int numLados;

	public Poligono() {
	}

	public Poligono(int numLados) {
		this.numLados = numLados;
	}

	public int getNumLados() {
		return numLados;
	}

	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}

	// Declaracion del metodo abstracto area()
	public abstract double area();

	@Override
	public String toString() {
		return "Poligono numLados=" + numLados + "";
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
