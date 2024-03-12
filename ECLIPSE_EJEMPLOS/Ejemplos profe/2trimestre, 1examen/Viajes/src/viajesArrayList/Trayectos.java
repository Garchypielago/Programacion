package viajesArrayList;

import java.util.ArrayList;

public class Trayectos {
	private ArrayList<Viaje> listaViajes;

	public Trayectos() {
		listaViajes = new ArrayList<Viaje>();
	}

	public void addTrayecto(Viaje v) {
		listaViajes.add(v);
	}

	public Viaje dameViaje(int pos) {
		return listaViajes.get(pos);
	}

	public double dameTam() {
		return listaViajes.size();
	}
	
	/*
	 * Primera parte del ejercicio pedida: se unen dos a dos
	 * mas adecuado el metodo estatico
	 */
	public void recorridosParciales() {
		// Recorremos el array uniendo viajes dos a dos, solo imprimimos

		for (int i = 0; i < listaViajes.size()-1; i++) {
			Viaje nuevoViaje = Viaje.uneViaje(listaViajes.get(i), listaViajes.get(i + 1));
			if (nuevoViaje.getDistancia() != -1)
				System.out.println("\nNuevo Viaje  " + (i + 1) + " y " + (i + 2) + nuevoViaje);
			else
				System.out.println("\nNo se pudo unir los viajes " + (i + 1) + " y " + (i + 2));
		}
	}
	
	
	/*
	 * Segunda parte del ejercicio pedida: se unen para saber el recorrido total
	 * mas adecuado el metodo no estatico
	 * El metodo devuelve un viaje, que representa la union de todos los viajes
	 */
	public Viaje recorridoTotal() {
		Viaje nuevoTray = null;
		boolean posible = true;
		// Recorremos el array uniendo viajes
		nuevoTray = listaViajes.get(0);
		// Vamos aniadiendo los viajes, uno a uno a un unico viaje que devolveremos
		for (int i = 1; i < listaViajes.size() && posible; i++) {
			nuevoTray = nuevoTray.uneViaje(listaViajes.get(i));
			if (nuevoTray.getDistancia() == -1)
				posible = false;
			
			// System.out.println("\n-- desarrollo solo -- Nuevo Trayecto -- desarrollo solo -- " + nuevoTray);
		}

		if (posible)
			// System.out.println("\nTrayecto total " + nuevoTray);
			return nuevoTray;
		else
			// System.out.println("\nEl recorrido no permite union de trayectos.");
			return null;
	}
}
