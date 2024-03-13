package solucion2;

import java.util.Scanner;

public class Lector {
	public static CantanteFamoso rellenarCantante(Scanner sc) {
		String continuar;

		System.out.println("Introduzca el nombre del cantante");
		String nombre = sc.nextLine();
		CantanteFamoso unCantante = new CantanteFamoso(nombre);
		do {
			// se podría comprobar si se ha creado comparando antes con null...
			unCantante.AsignarDisco(rellenarDisco(sc));
			System.out.println("Deseas agregar otro disco de este cantante (S/N)?");
			continuar = sc.nextLine();

		} while (continuar.equalsIgnoreCase("s"));

		return unCantante;
	}

	public static Disco rellenarDisco(Scanner sc) {
		String titulo;
		int cant;

		System.out.println("Introduce titulo de disco: ");
		titulo = sc.nextLine();
		System.out.println("Introduce numero de discos vendidos: ");
		cant = Integer.parseInt(sc.nextLine());

		return new Disco(titulo, cant);
	}
}
