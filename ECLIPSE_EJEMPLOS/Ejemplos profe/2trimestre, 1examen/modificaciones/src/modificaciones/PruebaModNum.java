package modificaciones;

import java.util.*;

public class PruebaModNum {
	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);

		System.out.println("Ha introducido: " + numeros.size() + " numeros:");
		System.out.println(numeros); // Muestra el arrayList completo

		Iterator<Integer> it = numeros.iterator();

		while (it.hasNext()) {
			Integer pInteger = it.next();
			if (pInteger == 2)
				numeros.set(numeros.indexOf(pInteger), 100);
		}

		it = numeros.iterator(); // Para volver al principio
		while (it.hasNext())
			System.out.println(it.next());
	}
}
