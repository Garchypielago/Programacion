package pilas;

public class PilaGenerica1<T> {
	private Object[] datos;
	private int numDatos;
	private static final int TAM_INI = 10, TAM_INC = 10;

	public PilaGenerica1() {
		datos = new Object[TAM_INI];
		numDatos = 0;
	}

	public void push(T dato) {
		if (numDatos == datos.length) {
			Object[] aux = new Object[datos.length + TAM_INC];
			System.arraycopy(datos, 0, aux, 0, datos.length);
			datos = aux;
		}
		datos[numDatos++] = dato;
	}

	@SuppressWarnings("unchecked")
	public T pop() throws Exception {
		if (numDatos > 0) {
			numDatos--;
			return (T) datos[numDatos];
		} else {
			throw new Exception("Pila vacía");
		}
	}

	public static void main(String[] args) throws Exception {
		PilaGenerica1<Number> pg = new PilaGenerica1<Number>();

		pg.push(25);
		pg.push(44);
		pg.push(37.45);
		// pg.push("hola"); // error de compilacion.
		double d = (double) pg.pop();
		// double d = pg.pop().doubleValue();
		System.out.println(d);
		int i = (int) pg.pop();
		// int i = pg.pop().intValue();
		System.out.println(i);

		PilaGenerica1<String> pg2 = new PilaGenerica1<String>();

		pg2.push("uno");
		pg2.push("dos");
		pg2.push("tres");

		String frase1 = (String) pg2.pop();
		System.out.println(frase1);
		frase1 = (String) pg2.pop();
		System.out.println(frase1);

	}

}
