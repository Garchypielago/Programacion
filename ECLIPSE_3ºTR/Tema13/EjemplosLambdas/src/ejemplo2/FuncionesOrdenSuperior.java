package ejemplo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FuncionesOrdenSuperior {

	public static void main(String[] args) {
		List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // devuelve una lista inmutable
//        numeros.add(20);
//        System.out.println(numeros);
//        numeros.set(1, 25);
		System.out.println(numeros);
		// Antes de Java 9 Arrays.asList()

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
