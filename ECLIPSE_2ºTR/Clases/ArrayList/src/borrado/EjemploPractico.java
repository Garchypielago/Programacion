package borrado;

import java.util.*;

public class EjemploPractico {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int n;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Añade numeros hasta que quieras(escribir 0):");
			n = Integer.parseInt(sc.nextLine());
			if (n != 0)
				numeros.add(n);
		} while (n != 0);

		if (!numeros.isEmpty()) {
			for (Integer numero : numeros)
				System.out.println(numero);

			int suma = 0;
			for (Integer numero : numeros) {
				suma += numero;
			}
			System.out.println("La suma: " + suma);
			System.out.println("La media: " + (suma / numeros.size()));
		} else {
			System.out.println("No puedo hacer nada");
		}

		ArrayList<Integer> nros = new ArrayList<Integer>();
		// se insertan elementos
		Iterator<Integer> it = nros.iterator();
		// se crea el iterador it para el ArrayList nros
		while (it.hasNext()) // mientras queden elementos
			System.out.println(it.next()); // se obtienen y se muestran

	}

}
