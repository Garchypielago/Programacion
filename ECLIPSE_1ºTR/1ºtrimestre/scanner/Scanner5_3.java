package scanner;

import java.util.Scanner;

public class Scanner5_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Get edad
		System.out.println("Introduzca edad del paciente");

		int edad = sc.nextInt();
		System.out.println("Edad " + edad);
		
		//sc.close(); Si no lo cierro, funciona
		
		sc = new Scanner(System.in);//
		
		// Get nombre
		System.out.println("Introduzca nombre del paciente");

		String nombre = sc.nextLine();
		System.out.println("Nombre leido " + nombre);
	
		sc.close();

	}
}
