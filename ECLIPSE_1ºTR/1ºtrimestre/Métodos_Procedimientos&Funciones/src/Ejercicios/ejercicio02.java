<<<<<<< HEAD
package Ejercicios;

import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {
		int n1, n2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Tu primer numero");
		n1 = Integer.parseInt(sc.nextLine());
		System.out.println("Tu segundo numero");
		n2 = Integer.parseInt(sc.nextLine());

		basicas(n1, n2);
		
		System.out.println("Suma: " + suma(n1,n2));
		System.out.println("Resta: " + resta(n1,n2));
		System.out.println("Multiplicación: " + multi(n1,n2));
		System.out.println("División: " + divi(n1,n2));


		sc.close();
	}

	public static int suma(int a, int b) {
		return a + b;
	}
	public static int resta(int a, int b) {
		return a - b;
	}
	public static int multi(int a, int b) {
		return a * b;
	}
	public static int divi(int a, int b) {
		return a / b;
	}

	public static void basicas(int a, int b) {

		System.out.println("Suma: " + (a + b));
		System.out.println("Resta: " + (a - b));
		System.out.println("Multiplicación: " + (a * b));
		System.out.println("División: " + (a / b));

	}

}
=======
package Ejercicios;

import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {
		int n1, n2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Tu primer numero");
		n1 = Integer.parseInt(sc.nextLine());
		System.out.println("Tu segundo numero");
		n2 = Integer.parseInt(sc.nextLine());

		basicas(n1, n2);
		
		System.out.println("Suma: " + suma(n1,n2));
		System.out.println("Resta: " + resta(n1,n2));
		System.out.println("Multiplicación: " + multi(n1,n2));
		System.out.println("División: " + divi(n1,n2));


		sc.close();
	}

	public static int suma(int a, int b) {
		return a + b;
	}
	public static int resta(int a, int b) {
		return a - b;
	}
	public static int multi(int a, int b) {
		return a * b;
	}
	public static int divi(int a, int b) {
		return a / b;
	}

	public static void basicas(int a, int b) {

		System.out.println("Suma: " + (a + b));
		System.out.println("Resta: " + (a - b));
		System.out.println("Multiplicación: " + (a * b));
		System.out.println("División: " + (a / b));

	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
