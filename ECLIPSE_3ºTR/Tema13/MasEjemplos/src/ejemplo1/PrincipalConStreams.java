package ejemplo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrincipalConStreams {

	public static void main(String[] args) {

		ArrayList<Gasto> lista = new ArrayList<Gasto>();

		lista.add(new Gasto("A", 80));
		lista.add(new Gasto("B", 50));
		lista.add(new Gasto("C", 70));
		lista.add(new Gasto("D", 95));
		
//		double totalPago=lista.stream()
//				.mapToDouble(gasto -> gasto.getImporte() * 1.21)
//				.filter(gasto -> gasto < 100)
//				.sum();
		
		double totalPago=lista.stream()
				.map(gasto -> gasto.getImporte() * 1.21)
				.filter(gasto -> gasto < 100)
				.reduce(0.0, Double::sum); // double java.lang.Double.sum(double a, double b)
		
		
		System.out.println(totalPago);
		
		/************************************************************/
		
		lista.add(new Gasto("D", 310));
		Gasto gastoFiltro=lista.stream()
				 .filter(elemento->elemento.getImporte() > 300)
				 .findFirst()
				 .get(); // Si no hay ninguno me sale una excepcion
		
		System.out.println(gastoFiltro.getImporte());
		
		
		/************************************************************/

		List<Integer> numeros = Arrays.asList(5, 12, 8, 20, 15);		
		
		int sumaCuadrados = numeros.stream() // crea un stream a partir de la lista de números
		    .filter(numero -> numero > 10) // filtra los números mayores a 10
		    .map(numero -> numero * numero) // calcula el cuadrado de cada número
		    .reduce(0, Integer::sum); // suma los resultado

		System.out.println("La suma de los cuadrados es: " + sumaCuadrados);
		
		/************************************************************/
		
		/************************************************************/
	}

}
