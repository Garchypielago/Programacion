package ejercicios;

import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
		int base, exp, i, resultado = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la base");
		base = Integer.parseInt(sc.nextLine());

		do {
			System.out.println("Escribe tu numero:");
			exp = Integer.parseInt(sc.nextLine());
		} while (exp < 0);

		for (i = 0; i!= exp; i++) {
			resultado = resultado * base;
		}

		System.out.println("El resultado es " + resultado);

		sc.close();
	}

}
