package ejemplo1;

public class Ejemplo1 {

	public static void main(String[] args) {

		Calcular sum = (Integer x, Integer y) -> {
			return x + y;
		};
		System.out.println("Suma " + sum.op(3, 5));
		
		Calcular mult = (Integer x, Integer y) -> x * y;
		System.out.println("Multiplicacion " +mult.op(5, 6));
		
		Calcular rest = (x, y) -> x - y;
		System.out.println("Resta " + rest.op(90, 80));
	}

}
