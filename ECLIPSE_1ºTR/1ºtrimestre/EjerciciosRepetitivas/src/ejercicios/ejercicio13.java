<<<<<<< HEAD
package ejercicios;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		int horas, totalh = 0, i;
		double sueldohora, sueldo;

		Scanner sc = new Scanner(System.in);
		System.out.println("Cuanto cobras por hora");
		sueldohora = Double.parseDouble(sc.nextLine());

		for (i = 1; i < 7; i++) {
			System.out.println("Cuantas horas trabjaste el dia " + i);
			horas = Integer.parseInt(sc.nextLine());

			totalh += horas;
		}

		sueldo = (double)(totalh * sueldohora);

		System.out.println("Tu salario es de " + sueldo + "€, por " + totalh + " horas.");

		sc.close();

	}

}
=======
package ejercicios;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		int horas, totalh = 0, i;
		double sueldohora, sueldo;

		Scanner sc = new Scanner(System.in);
		System.out.println("Cuanto cobras por hora");
		sueldohora = Double.parseDouble(sc.nextLine());

		for (i = 1; i < 7; i++) {
			System.out.println("Cuantas horas trabjaste el dia " + i);
			horas = Integer.parseInt(sc.nextLine());

			totalh += horas;
		}

		sueldo = (double)(totalh * sueldohora);

		System.out.println("Tu salario es de " + sueldo + "€, por " + totalh + " horas.");

		sc.close();

	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
