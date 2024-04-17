package pilas;

public class PilaGenerica2<T extends Number> {
	private Object[] datos;
	private int numDatos;
	private static final int TAM_INI = 10, TAM_INC = 10;

	public PilaGenerica2() {
		datos = new Object[TAM_INI];
		numDatos = 0;
	}

	public void push(T dato) {
		if (numDatos == datos.length) { // Ya no cabe mas, ampliamos el array el tamanio establecido
			Object[] aux = new Object[datos.length + TAM_INC];
			System.arraycopy(datos, 0, aux, 0, datos.length);
			datos = aux;
		}
		
		datos[numDatos++] = dato;
	}

	@SuppressWarnings("unchecked")
	public T pop() throws Exception {
		if (numDatos == 0)
			throw new Exception("Pila vacía");

		numDatos--;
		return ((T) datos[numDatos]);
	}

	public static void main(String[] args) throws Exception {
		PilaGenerica2<Number> pg = new PilaGenerica2<Number>();

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

		// Como el tipo es un generico numerico, no puedo hacer ya esto:
//		PilaGenerica2<String> pg2 = new PilaGenerica2<String>();
//
//		pg.push("uno");
//		pg.push("dos");
//		pg.push("tres");
//
//		double d = (double) pg.pop();
//		// double d = pg.pop().doubleValue();
//		System.out.println(d);
//		int i = (int) pg.pop();
		i = pg.pop().intValue();
		System.out.println(i);
	}

}
