package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams1 {
	public static void main(String args[]) {

		//List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> numeros = Arrays.asList(1, 3, 5);
		Stream<Integer> stream = numeros.stream();
		
		Stream<Integer> filtrados = stream.filter(n -> n % 2 == 0);
		
		System.out.println("filtrados " + filtrados.toList());
	}
}
