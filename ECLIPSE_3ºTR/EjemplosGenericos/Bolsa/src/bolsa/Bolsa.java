package bolsa;

import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa implements Iterable<Object> {

	private ArrayList<Object> lista;
	private int tope;

	public Bolsa(int tope) {
		lista = new ArrayList<Object>();
		this.tope = tope;
	}

	public void add(Object objeto) {
		if (lista.size() < tope) {
			lista.add(objeto);
		} else {
			throw new RuntimeException("no caben mas");
		}

	}

	@Override 
	public Iterator<Object> iterator() {
		return lista.iterator();
	}

}
