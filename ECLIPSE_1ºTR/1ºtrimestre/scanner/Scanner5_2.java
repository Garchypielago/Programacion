package scanner;

import java.util.Scanner;

public class Scanner5_2 {
	public static void main(String[] args) {
		Scanner scStr = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);

		// Get edad
		System.out.println("Introduzca edad del paciente");

		int edad = scInt.nextInt();
		System.out.println("Edad " + edad);
		// apell1_scanner.close();

		scInt.close();
		
		// Get nombre
		System.out.println("Introduzca nombre del paciente");

		String nombre = scStr.nextLine();
		System.out.println("Nombre leido " + nombre);
		// name_scanner.close();

		

	}
}
