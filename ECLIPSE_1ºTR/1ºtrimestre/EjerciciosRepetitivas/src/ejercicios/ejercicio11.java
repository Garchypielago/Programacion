package ejercicios;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		int n, i = 1, aleatorio;

		Scanner sc = new Scanner(System.in);

		aleatorio = (int) (Math.random() / Math.nextDown(0.01)) + 1;

		System.out.println("Que número crees que es (entre 1 y 100):");
		n = Integer.parseInt(sc.nextLine());

		for (; n != aleatorio && i < 10;) {
			if (n > aleatorio) {
				System.out.println("Es menor que ese número, cual crees que es:");
				n = Integer.parseInt(sc.nextLine());
			} else {
				System.out.println("Es mayor que ese número, cual crees que es:");
				n = Integer.parseInt(sc.nextLine());
			}
			i++;
		}

		if (n == aleatorio) {
			System.out.println("Muy bien, te ha costado: " + i + " intentos.");
		} else {
			System.out.println("Vaya, no lo acertaste, el número era: " + aleatorio);
		}

		sc.close();
	}

}
