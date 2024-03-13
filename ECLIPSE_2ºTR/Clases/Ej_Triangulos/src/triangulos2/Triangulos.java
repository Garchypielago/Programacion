package triangulos2;

import java.util.*;

public class Triangulos {
	private ArrayList<Triangulo> arrayTriangulos;

	/*******************************************************/
	/* Triangulos: constructor de la clase en la que se */
	/* guarda el conjunto de triangulos que se van creando */
	/*******************************************************/
	public Triangulos() {
		arrayTriangulos = new ArrayList<Triangulo>();
	}

	/*******************************************************/
	/* aniadir: aniade un nuevo triangulo a la coleccion */
	/*******************************************************/
	public void aniadir(Triangulo t) {
		arrayTriangulos.add(t);
	}

	/*************************************************************/
	/* estaVacio: nos dice si la coleccion tiene algun triangulo */
	/*************************************************************/
	public boolean estaVacio() {
		return arrayTriangulos.isEmpty();
	}

	/********************************************************/
	/* dame: devuelve el triangulo que ocupa la posicion 	*/
	/* recibida por parametro en la coleccion.				*/
	/********************************************************/
	public Triangulo dame(int i) {
		return arrayTriangulos.get(i);
	}

	/*******************************************************/
	/* mayorAreaTriangulo: devuelve la posicion del */
	/* triangulo que tiene mayor area */
	/*******************************************************/
	public int mayorAreaTriangulo() {
		if (arrayTriangulos.size() == 0) {
			System.out.println("No hay ningun triangulo");
			return -1;
		} else {
			double max = arrayTriangulos.get(0).area();
			double area;
			int mayor = 0;
			for (int i = 1; i < arrayTriangulos.size(); i++) {
				if (arrayTriangulos.get(i) != null) {
					area = arrayTriangulos.get(i).area();
					if (area > max) {
						max = area;
						mayor = i;
					}
				}
			}
			return mayor;
		}
	}

	/*******************************************************/
	/* mayorAreaTriangulo_O: devuelve el triangulo que */
	/* tiene mayor area */
	/*******************************************************/
	public Triangulo mayorAreaTriangulo_O() {
		if (arrayTriangulos.size() == 0) {
			System.out.println("No hay ningun triangulo");
			return null;
		} else {
			double max = arrayTriangulos.get(0).area();
			double area;
			int mayor = 0;
			for (int i = 1; i < arrayTriangulos.size(); i++) {
				if (arrayTriangulos.get(i) != null) {
					area = arrayTriangulos.get(i).area();
					if (area > max) {
						max = area;
						mayor = i;
					}
				}
			}
			return arrayTriangulos.get(mayor);
		}
	}

	/*******************************************************/
	/* menorPeriTriangulo: devuelve la posicion del */
	/* triangulo que tiene menor perimetro */
	/*******************************************************/
	public int menorPeriTriangulo() {
		if (arrayTriangulos.size() == 0) {
			System.out.println("No hay ning�n triangulo");
			return -1;
		} else {
			double min = arrayTriangulos.get(0).perimetro();
			double peri;
			int menor = 0;
			for (int j = 1; j < arrayTriangulos.size(); j++) {
				if (arrayTriangulos.get(j) != null) {
					peri = arrayTriangulos.get(j).perimetro();
					if (peri < min) {
						min = peri;
						menor = j;
					}
				}
			}
			return menor;
		}

	}

	/*******************************************************/
	/* menorPerimetroTriangulo_O: devuelve el triangulo que */
	/* tiene menor perimetro */
	/*******************************************************/
	public Triangulo menorPerimetroTriangulo_O() {
		if (arrayTriangulos.size() == 0) {
			System.out.println("No hay ningun triangulo");
			return null;
		} else {
			double min = arrayTriangulos.get(0).perimetro();
			double perimetro;
			int menor = 0;
			for (int i = 1; i < arrayTriangulos.size(); i++) {
				if (arrayTriangulos.get(i) != null) {
					perimetro = arrayTriangulos.get(i).perimetro();
					if (perimetro < min) {
						min = perimetro;
						menor = i;
					}
				}
			}
			return arrayTriangulos.get(menor);
		}
	}

	/*****************************************************************************/
	/*
	 * devolver un Triangulo: pide la base y la altura de un triangulo en concreto
	 */
	/*****************************************************************************/
	public int buscaTriangulo(Triangulo t) {
		Triangulo tGuardado = null;
		int pos = 0;
		
		Iterator<Triangulo> itr = arrayTriangulos.iterator();
		while (itr.hasNext()) {
			tGuardado = itr.next();
			pos++;
			if (tGuardado.getAltura() == t.getAltura() && tGuardado.getBase() == t.getBase())
				return pos;
		}
		
		return -1;
	}

	/****************************************************************
	* mostrarUnTriangulo: muestra todos los datos de un triangulo 	*
	* en concreto, incluyendo perimetro y area 					    *
	*****************************************************************
	*/
	public void mostrarUnTriangulo(int n) {

		System.out.println("TRIANGULO " + n + "\n");
		// Utilizando el metodo toString()
		System.out.print(arrayTriangulos.get(n - 1));
		System.out.printf("%nArea %.2f %nPerimetro %.2f%n", arrayTriangulos.get(n - 1).area(),
				arrayTriangulos.get(n - 1).perimetro());
		System.out.println();

	}

	
	/*******************************************************/

	/* mostrarTriangulos: escribe los datos de todos los */
	/* triangulos */
	/*******************************************************/
	public void mostrarTriangulos() {
		int n = 0;
		for (Triangulo t : arrayTriangulos) {

			if (t != null) {
				System.out.println("\n" + "Triangulo " + (++n) + t + " \n");
				System.out.printf("Area %.2f %nPerimetro %.2f%n%n", t.area(), t.perimetro());
			}
		}
		System.out.println();
		// Hacerlo con un iterador
	}

	/********************************************************/
	/* toString: devuelve los datos de todos los */
	/* triangulos, incluidos perimetro y area */
	/********************************************************/
	public String toString() {
		String cadenaT = "";
		int n = 0;
		String patron = "%.2f";
		for (Triangulo t : arrayTriangulos) {
			cadenaT += "\n\nTriangulo " + (++n) + "\n" + t + "Area " + String.format(patron, t.area()) + "\nPerimetro "
					+ String.format(patron, t.perimetro()) + "\n";
		}

		return cadenaT;
	}
}
