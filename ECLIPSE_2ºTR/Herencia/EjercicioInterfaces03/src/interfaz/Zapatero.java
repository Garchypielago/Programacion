package interfaz;

import java.util.ArrayList;

import herencia.Ropa;
import herencia.Zapatos;

public class Zapatero implements IAlmacen {
	
	private ArrayList<Zapatos> zapatero;

	public Zapatero() {
		super();
		zapatero = new ArrayList<Zapatos>();
	}

	@Override
	public boolean almacenar(Object item) {
		try {
			zapatero.add((Zapatos) item);
			return true;
		} catch (ClassCastException c) {
			System.out.println(c.getMessage());
			return false;
		}
	}

	@Override
	public Object recuperar(int identificador) {
		// TODO Auto-generated method stub
		for (Zapatos z: zapatero) {
			if (z.getId()==identificador)
				return z;
		}
		return null;
	}
	
	@Override
	public String toString() {
		String valores="";
		for(Zapatos z : zapatero) {
			valores+=z+"\n";
		}
		return valores;
	}

}
