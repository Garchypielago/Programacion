<<<<<<< HEAD
package banco;

// Añadir mostrar datos de todas las cuentas
import java.util.*;

import lector.Lector;

public class CuentaApp {

	public static final int MAX_OPC = 8;

	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		// Todas las operaciones vienen dirigidas por el numero de cuenta:

		System.out.println();
		System.out.println("\t1. Abrir cuenta");
		System.out.println("\t2. Ingresar dinero en cuenta");
		System.out.println("\t3. Sacar dinero de cuenta");
		System.out.println("\t4. Mostrar todas las cuentas");
		System.out.println("\t5. Mostrar una cuenta");
		System.out.println("\t6. Borrar una cuenta");
		System.out.println("\t7. Borrar todas las cuentas");
		System.out.println("\t8. Salir.");

		do
			opcion_menu = Lector.leeInt(sc, "\n\n\tElija opcion:");
		while (opcion_menu < 1 || opcion_menu > tope_op);

		return opcion_menu;
	}

	public static void main(String args[]) {

		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		Banco b = new Banco();

		while (opcion != MAX_OPC) {
			opcion = menu(MAX_OPC, sc);
			switch (opcion) {
			case 1:
				b.guardarCuenta(b.crearCuenta(sc));
				break;
			case 2:
				b.ingresarEnCuenta(sc);
				break;
			case 3:
				b.sacarDeCuenta(sc);
				break;
			case 4:
				b.listarCuentas();
				break;
			// El orden al mostrar todas las cuentas será por saldo de mayor a menor, y si
			// dos cuentas tienen el mismo saldo por orden creciente de cuenta. Utiliza el
			// interfaz Comparable
			case 5:
				b.muestraCuenta(sc);
				break;
			case 6:
				b.borraCuenta(sc);
				break;
			case 7:
				b.borraTodasCuentas();
				break;
			}
		}
		sc.close();
	}
}
=======
package banco;

// Añadir mostrar datos de todas las cuentas
import java.util.*;

import lector.Lector;

public class CuentaApp {

	public static final int MAX_OPC = 8;

	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		// Todas las operaciones vienen dirigidas por el numero de cuenta:

		System.out.println();
		System.out.println("\t1. Abrir cuenta");
		System.out.println("\t2. Ingresar dinero en cuenta");
		System.out.println("\t3. Sacar dinero de cuenta");
		System.out.println("\t4. Mostrar todas las cuentas");
		System.out.println("\t5. Mostrar una cuenta");
		System.out.println("\t6. Borrar una cuenta");
		System.out.println("\t7. Borrar todas las cuentas");
		System.out.println("\t8. Salir.");

		do
			opcion_menu = Lector.leeInt(sc, "\n\n\tElija opcion:");
		while (opcion_menu < 1 || opcion_menu > tope_op);

		return opcion_menu;
	}

	public static void main(String args[]) {

		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		Banco b = new Banco();

		while (opcion != MAX_OPC) {
			opcion = menu(MAX_OPC, sc);
			switch (opcion) {
			case 1:
				b.guardarCuenta(b.crearCuenta(sc));
				break;
			case 2:
				b.ingresarEnCuenta(sc);
				break;
			case 3:
				b.sacarDeCuenta(sc);
				break;
			case 4:
				b.listarCuentas();
				break;
			// El orden al mostrar todas las cuentas será por saldo de mayor a menor, y si
			// dos cuentas tienen el mismo saldo por orden creciente de cuenta. Utiliza el
			// interfaz Comparable
			case 5:
				b.muestraCuenta(sc);
				break;
			case 6:
				b.borraCuenta(sc);
				break;
			case 7:
				b.borraTodasCuentas();
				break;
			}
		}
		sc.close();
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
