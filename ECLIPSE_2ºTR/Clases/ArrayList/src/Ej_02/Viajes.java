package Ej_02;

import java.util.*;

public class Viajes {

	private ArrayList<Viaje> viajes;

	public Viajes() {
		super();
		this.viajes = new ArrayList<Viaje>();
	}

	public void agregar(Viaje nuevo) {
		viajes.add(nuevo);
	}

	public void agregar(String origen, String destino, double distancia) {
		Viaje v = new Viaje(origen, destino, distancia);
		viajes.add(v);
	}

	public void unirViajesA2() {
		Iterator<Viaje> it = viajes.iterator();
		Viaje unido1 = null, unido2 = null, unidos = null;

		if (it.hasNext()) {
			unido1 = it.next();
		}
		while (it.hasNext()) {
			unido2 = it.next();
			unidos = unido1.uneViaje(unido1, unido2);
			unido1 = unido2;
			System.out.println(unidos.toString());
		}

	}

	public void unirViajes() {
		Iterator<Viaje> it = viajes.iterator();
		Viaje unidos = null;

		if (it.hasNext()) {
			unidos = it.next();
		}
		while (it.hasNext() && unidos.getDistancia() != -1) {
			unidos = unidos.uneViaje(unidos, it.next());
		}

		if (unidos.getDistancia() != -1)
			System.out.println(unidos.toString());
		else
			System.out.println("No se puede realizar la union de viajes.");
	}

}
