package genericos;

public class Utilidades {
// Ahora los genericos son los parametros de los metodos
// no hay que poner <T> detras del nombre de la clase
	
	public static <T> void alReves(T[] elementos) {
		T aux;

		for (int i = 0; i < elementos.length / 2; i++) {
			aux = elementos[i];
			elementos[i] = elementos[elementos.length - 1 - i];
			elementos[elementos.length - 1 - i] = aux;
		}
	}

	public static <T> void muestraArray(T[] elementos) {
		for (T elemento : elementos)
			System.out.println(elemento);
	}

	public static <T> void sustituyeArray(T[] elementos, T elemento) {
		for (int i = 0; i < elementos.length; i++)
			elementos[i] = elemento;
	}

}
