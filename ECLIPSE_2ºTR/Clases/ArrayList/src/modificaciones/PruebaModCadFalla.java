package modificaciones;

import java.util.*;

public class PruebaModCadFalla {
	public static void main(String[] args) {

		ArrayList<String> nombres = new ArrayList<String>();

		nombres.add(new String("uno"));
		nombres.add(new String("dos"));
		nombres.add(new String("tres"));
		nombres.add(new String("cuatro"));
		nombres.add(new String("dos"));
		// Nota: si no hago new String, los dos doses serian el mismo objeto

		System.out.println("Ha introducido: " + nombres.size() + " numeros:");
		System.out.println(nombres); // Muestra el arrayList completo

		Iterator<String> it = nombres.iterator();

		// Ojo, que no cambiamos nada asi
		while (it.hasNext()) {
			String pString = it.next();
			if (pString.equals("dos")) {
				// pString = "prueba";
				// En el momento en que se cambia a pString
				// se devuelve otro String nuevo
				// Los String son objetos inmutables
				// pString.replace('d', 'D');
				pString = pString.replace('d', 'D');
				System.out.println("pString " + pString);
			}
		}

		System.out.println();

		it = nombres.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}
}
