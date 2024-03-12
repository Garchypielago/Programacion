package objetosLista;

import java.util.*;
import objetoPadre.Vivienda;
import objetosHijo.*;

public class Viviendas {

	ArrayList<Vivienda> viviendas;

	public Viviendas() {
		super();
		this.viviendas = new ArrayList<Vivienda>();
	}

	public void agregarVivienda(Vivienda v) {
		this.viviendas.add(v);
	}

	public void agregarChalet(Chalet c) {
		this.viviendas.add(c);
	}

	public void agregarPalacio(Palacio p) {
		this.viviendas.add(p);
	}

	public void mostrarViviendas() {
		for (Vivienda v : viviendas) {
			System.out.println(v.toString());
		}
	}

	public void mostrarPalacios() {
		for (Vivienda v : viviendas) {
			if (v instanceof Palacio)
				System.out.println(v.toString());

		}
	}

	public void mostrarChalet() {
		for (Vivienda v : viviendas) {
			if (v instanceof Chalet)
				System.out.println(v.toString());

		}
	}

	public void borrarVivienda(String calle, int num) {
		Iterator<Vivienda> it = viviendas.iterator();

		while (it.hasNext()) {
			if (it.next().equals(calle, num))
				it.remove();
		}
	}

}
