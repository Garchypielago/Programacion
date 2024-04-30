package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams4 {

	public static void main(String[] args) {

		List<Integer> li = Arrays.asList(5, 7, 10, 25, 74);



		long pares = li.stream().filter(x -> x % 2 == 0).count();
		System.out.println("Cantidad de pares " + pares);

		Integer[] arrInt = Stream.of(23, 45, 67, 88, 2, 27).filter(x -> x % 2 == 0).toArray(Integer[]::new);
		Arrays.stream(arrInt).forEach(System.out::println);

		Stream.iterate(0, n -> n + 10).limit(15).forEach(Streams4::imp);
		System.out.println("");
		Stream<Integer> numbers = Stream.iterate(0, n -> n + 10);
//		numbers.limit(5).forEach(Streams4::imp); // un stream no puede reusarse
		System.out.println("");
		
		numbers.limit(10).forEach(System.out::print);
	}

	static void imp(int n) {
		System.out.print(" " + n);
	}

}
