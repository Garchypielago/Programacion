<<<<<<< HEAD
package talleres;
import java.util.Scanner;

public class CreacionObjetos {
	// RELLENAR TALLER
	public static Taller rellenarTaller(Scanner sc) {
		System.out.print("Introduzca nombre: ");
		String nomb = sc.nextLine();
		System.out.print("Introduzca CIF: ");
		String CIF = sc.nextLine();
		System.out.print("Introduzca direccion: ");
		String dir = sc.nextLine();

		return new Taller(nomb, CIF, dir);
	}

	// RELLENAR COCHE
	public static Coche rellenarCoche(Scanner sc) {
		System.out.print("Introduzca matricula: ");
		String mat = sc.nextLine();
		System.out.print("Introduzca tarea a realizar: ");
		String tarea = sc.nextLine();
		System.out.print("Introduzca DNI del due�o: ");
		String nif = sc.nextLine();

		return new Coche(mat, tarea, nif);
	}
}
=======
package talleres;
import java.util.Scanner;

public class CreacionObjetos {
	// RELLENAR TALLER
	public static Taller rellenarTaller(Scanner sc) {
		System.out.print("Introduzca nombre: ");
		String nomb = sc.nextLine();
		System.out.print("Introduzca CIF: ");
		String CIF = sc.nextLine();
		System.out.print("Introduzca direccion: ");
		String dir = sc.nextLine();

		return new Taller(nomb, CIF, dir);
	}

	// RELLENAR COCHE
	public static Coche rellenarCoche(Scanner sc) {
		System.out.print("Introduzca matricula: ");
		String mat = sc.nextLine();
		System.out.print("Introduzca tarea a realizar: ");
		String tarea = sc.nextLine();
		System.out.print("Introduzca DNI del due�o: ");
		String nif = sc.nextLine();

		return new Coche(mat, tarea, nif);
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
