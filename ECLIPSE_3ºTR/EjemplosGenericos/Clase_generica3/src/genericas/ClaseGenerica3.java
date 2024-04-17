package genericas;

// Ahora tenemos dos tipos de variables
public class ClaseGenerica3<T, U> {
	private T a;
	private U b;

	public ClaseGenerica3(T a, U b) {
		this.a = a;
		this.b = b;
	}

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public U getB() {
		return b;
	}

	public void setB(U b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "ClaseGenerica [a=" + a + ", b=" + b + "]";
	}

	public String nombreClase() {
		return a.getClass().getSimpleName();
	}

}
