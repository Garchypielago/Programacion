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
