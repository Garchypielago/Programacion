package ejemplos;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class CasoErrorTreeSet {
	
	public static void main(String[] args) {
		int valor = 0;
		Scanner sc = new Scanner(System.in);
		
		// Generamos un objeto comparator con una clase anonima
		TreeSet<Integer> array = new TreeSet<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 > o2 ? o1 : o2; // Falta el caso de devolucion 0
				// admitira repetidos
			}
		});

		for (int i = 0; i < 5; i++) {
			valor = sc.nextInt();
			// if (!array.contains(valor)){
			array.add(valor);
			// }
		}
		
		for (int i = 0; i < 5; i++) {
			valor = array.pollFirst();
			System.out.println(valor);
		}
		sc.close();
	}
}
