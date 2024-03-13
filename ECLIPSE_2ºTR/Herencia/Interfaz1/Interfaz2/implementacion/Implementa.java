package implementacion;

import definicion.X; // Importa el interfaz

public class Implementa implements X {
	public void getMax() {
		System.out.println(MAX); // no ponemos el nombre del interfaz
	}
}