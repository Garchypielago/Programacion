package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams2 {
	public static void main(String args[]) {

		List<String> nombres = Arrays.asList("Juan", "Pedro", "María");
		Stream<String> stream = nombres.stream();
		
		Stream<Integer> longitudes = stream.map(String::length);
		
//		String::length: es una referencia a un método de instancia. En este caso, String::length se refiere
//		al método length() de la clase String, que devuelve la longitud de la cadena.
//
//		Entonces, stream.map(String::length) se traduce como "toma cada elemento del flujo y aplica la función
//		que obtiene la longitud de la cadena para transformarlos". Esto se usa comúnmente para, por ejemplo, 
//		obtener la longitud de cada cadena en un flujo de cadenas.


		System.out.println(longitudes.toList()); // Convierto el Stream en una lista
	}
}
