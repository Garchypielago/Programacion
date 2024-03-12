package Ejercicios;

import java.util.Scanner;

public class ejercicio09 {

	public static void main(String[] args) {
		String entrada;
		float n;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(
					"--A que moneda quieres convertir--\nDolar\nLibra\nYen\n----------------------------------");
			entrada = sc.nextLine().toLowerCase();

		} while (!entrada.equalsIgnoreCase("dolar") && !entrada.equalsIgnoreCase("libra")
				&& !entrada.equalsIgnoreCase("yen"));

		do {
			System.out.println("¿Que cantidad de euros quieres transformar a " + entrada);
			n = Float.parseFloat(sc.nextLine());

		} while (n < 0);

		sc.close();
		
		transformacion1(n, entrada);

		System.out.println(n + "€ son " + transformacion2(n, entrada) + " " + entrada);

	}

	public static float transformacion2(float x, String s) {

		if (s.equalsIgnoreCase("dolar")) {
			x = (float) (x * 1.28611);
		} else if (s.equalsIgnoreCase("libra")) {
			x = (float) (x * 0.86);
		} else {
			x = (float) (x * 129.852);
		}

		return x;
	}
	
	public static void transformacion1(float x, String s) {
		float y;
		if (s.equalsIgnoreCase("dolar")) {
			y = (float) (x * 1.28611);
		} else if (s.equalsIgnoreCase("libra")) {
			y = (float) (x * 0.86);
		} else {
			y = (float) (x * 129.852);
		}
		System.out.println(x + "€ son " + y + " "  +s);
	}

}
