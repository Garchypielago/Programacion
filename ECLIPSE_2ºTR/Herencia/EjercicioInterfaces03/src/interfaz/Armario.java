<<<<<<< HEAD
package interfaz;

import java.util.ArrayList;

import herencia.Ropa;

public class Armario implements IAlmacen {

	private ArrayList<Ropa> armario;

	public Armario() {
		super();
		armario = new ArrayList<Ropa>();
	}

	@Override
	public boolean almacenar(Object item) {
		try {
			armario.add((Ropa) item);
			return true;
		} catch (ClassCastException c) {
			System.out.println(c.getMessage());
			return false;
		}
	}

	@Override
	public Object recuperar(int identificador) {
		for (Ropa r: armario) {
			if (r.getId()==identificador)
				return r;
		}
		return null;
	}

	@Override
	public String toString() {
		String valores = "";
		for (Ropa r : armario) {
			valores += r + "\n";
		}
		return valores;
	}

}
=======
package interfaz;

import java.util.ArrayList;

import herencia.Ropa;

public class Armario implements IAlmacen {

	private ArrayList<Ropa> armario;

	public Armario() {
		super();
		armario = new ArrayList<Ropa>();
	}

	@Override
	public boolean almacenar(Object item) {
		try {
			armario.add((Ropa) item);
			return true;
		} catch (ClassCastException c) {
			System.out.println(c.getMessage());
			return false;
		}
	}

	@Override
	public Object recuperar(int identificador) {
		for (Ropa r: armario) {
			if (r.getId()==identificador)
				return r;
		}
		return null;
	}

	@Override
	public String toString() {
		String valores = "";
		for (Ropa r : armario) {
			valores += r + "\n";
		}
		return valores;
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
