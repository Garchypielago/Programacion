package ejercicios;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		double x1, y1, x2, y2, r1, r2, d;

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe la coordenada horizontal del primer centro:");
		x1 = Double.parseDouble(sc.nextLine());

		System.out.println("Escribe la coordenada vertical del primer centro:");
		y1 = Double.parseDouble(sc.nextLine());

		System.out.println("Escribe la coordenada horizontal del segundo centro:");
		x2 = Double.parseDouble(sc.nextLine());

		System.out.println("Escribe la coordenada vertical del segundo centro:");
		y2 = Double.parseDouble(sc.nextLine());

		System.out.println("Escribe el radio de la primera circunferencia:");
		r1 = Double.parseDouble(sc.nextLine());

		System.out.println("Escribe el radio de la segunda circunferencia:");
		r2 = Double.parseDouble(sc.nextLine());

		d = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

		if (d == 0) {
			System.out.println("Las circunferencias son concéntricas");
		} else if (d - r1 - r2 > 0) {
			System.out.println("Las circunferencias son exteriores");
		} else if (d - r1 - r2 < 0 && d - (r1 + r2) > 0) {
			System.out.println("Las circunferencias son secantes");
		} else if (d > 0 && d < (r1 - r2)) {
			System.out.println("Las circunferencias son interiores");
		} else if (d == r1 + r2) {
			System.out.println("Las circunferencias son tangentes exteriores");
		} else if (d == r1 - r2) {
			System.out.println("Las circunferencias son tangentes interiores");
		}

		sc.close();
	}

}
