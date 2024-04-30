package streams;

import java.util.Arrays;
import java.util.List;

public class Streams3 {
	public static void main(String args[]) {
		List<Integer> numeros = Arrays.asList(5, 12, 8, 20, 15);

		int sumaCuadrados = numeros.stream().filter(numero -> numero > 10) // se queda con los que son mayores que 10
				.map(numero -> numero * numero) // aplica la funcion a los elementos
				.reduce(0, Integer::sum); // realiza una operacion final en el Stream

		System.out.println("La suma de los cuadrados es: " + sumaCuadrados);
	}
}
