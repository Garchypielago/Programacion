package ejercicios;

import java.util.Scanner;

public class ejercicio09 {

	public static void main(String[] args) {
		/*int n, factorial = 1, i1 = 0, i2 = i1 + 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu numero:");
		n = Integer.parseInt(sc.nextLine());
		
		while (i1 < n) {
			factorial = factorial * i2;
			i1++;
			i2 = i1 + 1;
		}
		*/
		
		int n, factorial = 1, i1 = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Escribe tu numero:");
			n = Integer.parseInt(sc.nextLine());
		} while (n < 1);

		for (; i1 < n; i1++) {
			factorial *= (i1 + 1);
		}

		System.out.println("Su factorial es " + factorial);

		sc.close();

	}

}
