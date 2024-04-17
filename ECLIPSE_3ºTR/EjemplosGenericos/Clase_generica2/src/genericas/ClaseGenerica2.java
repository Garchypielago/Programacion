package genericas;

public class ClaseGenerica2<T> {
	private T a;
	private T b;

	public ClaseGenerica2(T a, T b) {
		this.a = a;
		this.b = b;
	}

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public T getB() {
		return b;
	}

	public void setB(T b) {
		this.b = b;
	}

	public void intercambiaAB() {
		T aux = a;
		a = b;
		b = aux;
	}

	@Override
	public String toString() {
		return "ClaseGenerica [a=" + a + ", b=" + b + "]";
	}

	public String nombreClase() {
		return a.getClass().getSimpleName();
	}

}
