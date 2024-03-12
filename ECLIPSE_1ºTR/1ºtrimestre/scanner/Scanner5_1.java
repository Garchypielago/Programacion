<<<<<<< HEAD
package scanner;

import java.util.Scanner;

public class Scanner5_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Get nombre
		System.out.println("Introduzca nombre del paciente");
		Scanner name_scanner = new Scanner(System.in); // Casca estrepitosamente
		String nombre = name_scanner.nextLine();
		System.out.println("Nombre leido" + nombre);
		name_scanner.close();

		//Get apellido 1
		System.out.println("Introduzca primer apellido del paciente");
		Scanner apell1_scanner = new Scanner(System.in);
		String apell1 = apell1_scanner.nextLine();
		System.out.println("Apellido leido" + apell1);
		apell1_scanner.close();

		sc.close();

	}
}
=======
package scanner;

import java.util.Scanner;

public class Scanner5_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Get nombre
		System.out.println("Introduzca nombre del paciente");
		Scanner name_scanner = new Scanner(System.in); // Casca estrepitosamente
		String nombre = name_scanner.nextLine();
		System.out.println("Nombre leido" + nombre);
		name_scanner.close();

		//Get apellido 1
		System.out.println("Introduzca primer apellido del paciente");
		Scanner apell1_scanner = new Scanner(System.in);
		String apell1 = apell1_scanner.nextLine();
		System.out.println("Apellido leido" + apell1);
		apell1_scanner.close();

		sc.close();

	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
