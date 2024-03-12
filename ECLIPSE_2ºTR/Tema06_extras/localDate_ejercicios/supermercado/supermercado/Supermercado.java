package supermercado;

import java.util.*;
import excepciones.*;
import productos.*;
import utilidades.*;

public class Supermercado {

	private static ArrayList<Producto> mercadona ;

	public Supermercado() {
		super();
		mercadona = new ArrayList<Producto>();
	}

	public void codigoDuplicado(String duplicado) throws CodigoIncorrectoException {
		for (Producto p : mercadona) {
			if (p.getCodigo().equals(duplicado)) {
				throw new CodigoIncorrectoException("Codigo duplicado");
			}
		}
	}
	
	public static void agregarProducto(Producto p) {
		mercadona.add(p);
	}

	@Override
	public String toString() {
		return "Supermercado []";
	}

	static int menu(Scanner sc) {
		int opcion_menu;

		System.out.println("PROCESO DE CREACION DEL ALMACÉN");
		System.out.println("\t1. Introducir producto alimenticio");
		System.out.println("\t2. Introducir producto textil");
		System.out.println("\t3. Introducir producto drogueria");
		System.out.println("\t4. Salir.");
		do {
			System.out.println("Elija opcion:");
			opcion_menu = Integer.parseInt(sc.nextLine());
		} while (opcion_menu < 1 || opcion_menu > 4);

		return opcion_menu;
	}

}
