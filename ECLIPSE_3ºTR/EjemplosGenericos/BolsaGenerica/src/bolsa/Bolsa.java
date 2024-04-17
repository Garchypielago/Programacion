package bolsa;
import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa<T> implements Iterable<T> {
	private ArrayList<T> lista = new ArrayList<T>();
	private int tope;

	public Bolsa(int tope) {
		this.tope = tope;
	}

	public void add(T objeto) {
		if (lista.size() < tope) {
			lista.add(objeto);
		} else {
			throw new RuntimeException("no caben mas");
		}
	}

	@Override
	public Iterator<T> iterator() {
		return lista.iterator();
	}
	
	// Asi podremos ejecutar un bucle for-each para recorrer la coleccion que hay dentro de la clase
	// usando un objeto de la clase

}
