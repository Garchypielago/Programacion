package ejercicios;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		double a, b, c;

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un lado a");
		a = Double.parseDouble(sc.nextLine());
		System.out.println("Escribe un lado b");
		b = Double.parseDouble(sc.nextLine());
		System.out.println("Escribe un lado c");
		c = Double.parseDouble(sc.nextLine());

		if (c == (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))) || b == (Math.sqrt(Math.pow(a, 2) + Math.pow(c, 2)))
				|| a == (Math.sqrt(Math.pow(c, 2) + Math.pow(b, 2)))) {
			System.out.println("Tu triángulo es rectángulo");
		} else if (a == b && a != c || a == c && a != b || b == c && b != a) {
			System.out.println("Tu triángulo es isósceles");
		} else if (a == b && b == c) {
			System.out.println("Tu triángulo es equilátero");
		} else {
			System.out.println("Tu triángulo es escaleno");
		}

		sc.close();
	}

}
