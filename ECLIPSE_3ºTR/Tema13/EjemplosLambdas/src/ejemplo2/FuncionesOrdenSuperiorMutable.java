package ejemplo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FuncionesOrdenSuperiorMutable {

	public static void main(String[] args) {
		List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // devuelve una lista inmutable
//        numeros.add(20);
//        System.out.println(numeros);
//        numeros.set(1, 25);
		System.out.println(numeros);
		// Antes de Java 9 Arrays.asList()

		// Mutables 
		List<Integer> numeros2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		numeros2.add(20);
		System.out.println(numeros2);
		numeros2.set(1, 25);
		System.out.println(numeros2);
		
		List<Integer> numeros3 = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		numeros3.add(20);
		System.out.println(numeros3);
		numeros3.set(1, 25);
		System.out.println(numeros3);
		// Filtrar números impares
		List<Integer> impares = filtrar(numeros, n -> n % 2 != 0);
		System.out.println("Numeros impares: " + impares);

		// Filtrar números pares
		List<Integer> pares = filtrar(numeros, n -> n % 2 == 0);
		System.out.println("Numeros pares: " + pares);
	}

	// Función de orden superior para filtrar
	public static List<Integer> filtrar(List<Integer> lista, Predicate<Integer> condicion) {
		return lista.stream().filter(condicion).toList();
	}
}
