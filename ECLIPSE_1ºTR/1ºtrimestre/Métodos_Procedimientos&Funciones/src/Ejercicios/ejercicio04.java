package Ejercicios;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		int n1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime de que número quieres el factorial");
		n1 = sc.nextInt();

		System.out.println("El factorial es: " + factorial(n1));
		sc.close();
	}

	public static int factorial(int x) {
		Integer fact = 1;
		for (int i = 0; i < x; i++) {
			fact *= (i + 1);
		}
		return fact;
	}
}
