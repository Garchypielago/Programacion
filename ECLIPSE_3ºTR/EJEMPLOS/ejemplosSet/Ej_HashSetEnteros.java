package ejemplos;

import java.util.Set;
import java.util.HashSet;

public class Ej_HashSetEnteros {

	public static void main(String[] args) {
		Set<Integer> conjunto1 = new HashSet<Integer>();
		while (conjunto1.size() < 30) {
			int aleatorio = (int) (Math.random() * 100) + 1;
			System.out.println(aleatorio);
			conjunto1.add(aleatorio);
		}
		// El random hace que se generen todos los numeros del 1 al 10
		// Como se generan en orden, parece que el hash 
		// utilizado hace que se coloquen en orden (a partir de cierto tamaño)
		System.out.println(conjunto1);
		System.out.println(conjunto1.size());
	}

}
