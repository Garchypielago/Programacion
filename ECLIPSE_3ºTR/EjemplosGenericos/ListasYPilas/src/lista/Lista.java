package lista;

public class Lista {
	private Nodo primero;

	public Lista() {
		primero = null;
	}

	public void insertarPrincipio(int num) {
		Nodo nuevo = new Nodo(num);
		if (primero == null)
			primero = nuevo;
		else {
			nuevo.setSig(primero); // nuevo apunta al nodo al que apuntaba primero
			primero = nuevo;
		}
	}

	public void insertarFinal(int num) {
		Nodo nuevo = new Nodo(num);
		if (primero == null)
			primero = nuevo;
		else {
			Nodo p = primero; // variable de tipo nodo para ir recorriendo la lista
			while (p.getSig() != null)
				p = p.getSig(); // si no hemos llegado al ultimo nodo, seguimos avanzando
			p.setSig(nuevo); // el nodo que era el ultimo, apunta al nuevo, que sera ahora el ultimo
		}
	}

	public boolean borrar(int x) {
		Nodo p = primero;
		Nodo ant = primero;
		boolean borrado = false;

		if (primero != null && primero.getNum() == x) // Si el elemento que buscamos es el primero, movemos el puntero y listo
			primero = primero.getSig();
		else { // si no, hay que buscarlo
			while (p != null && p.getNum() != x) {
				ant = p;
				p = p.getSig();
			}
			
			if (p != null && p.getNum() == x) { // lo hemos encontrado
				ant.setSig(p.getSig()); // el anterior apunta al siguiente, asi eliminamos el que queremos borrar
				borrado = true;
			}			
		}
		return borrado;
	}

	public String toString() {
		Nodo p = primero;
		String cadena = "Valores de la lista : ";
		while (p != null) {
			if (p.getSig() != null)
				cadena = cadena + p.getNum() + " - ";
			else
				cadena = cadena + p.getNum();
			p = p.getSig();

		}
		return cadena;
	}

}
