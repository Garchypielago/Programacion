package lectura;

import java.util.Scanner;

import datos.Casa;
import datos.Finca;
import datos.Parcela;

public class Lector {
	// Rellenar Casa

	public static Casa rellenarCasa(Scanner sc) {
		System.out.println("> DATOS DE LA CASA:");
		System.out.print("Metros cuadrados: ");
		int m2 = Integer.parseInt(sc.nextLine());
		System.out.print("Numero de plantas: ");
		int nPlantas = Integer.parseInt(sc.nextLine());
		System.out.print("Numero de habitaciones: ");
		int nHab = Integer.parseInt(sc.nextLine());
		return new Casa(m2, nPlantas, nHab);
	}

	// Rellenar Parcela

	public static Parcela rellenarParcela(Scanner sc) {
		int expl;

		System.out.println("> DATOS DE LA PARCELA:");
		System.out.print("Metros cuadrados: ");
		int m2 = Integer.parseInt(sc.nextLine());

		do {
			System.out.print("Tipo de explotacion:\n1. Agricola \n2. Ganadera \n3. Ambas\n ");
			expl = Integer.parseInt(sc.nextLine());
		} while (expl < 1 || expl > 3);

		return new Parcela(m2, expl);
	}

	// Rellenar Finca

	public static Finca rellenarFinca(Scanner sc) {
		Casa miCasa;
		Parcela miParcela;
		
		System.out.println("> DATOS DE LA FINCA:");
		System.out.print("Nombre: ");
		String nomb = sc.nextLine();
		miCasa = rellenarCasa(sc);
		miParcela = rellenarParcela(sc);
		
		if (miCasa != null && miParcela != null)
			return new Finca(nomb, miCasa, miParcela);
		else
			return null;
	}
}
