package texto;

import java.io.*;
import java.util.Scanner;

public class Ej5_2este {
	public static void main(String[] args) {
		final String FICHERO = "nombres.txt";
		Scanner sc = new Scanner(System.in);

		crearFichero(FICHERO, sc);
		leerFichero(FICHERO);
	}

	public static void crearFichero(String fich, Scanner teclado) {
		String nom;
		// Generamos el fichero:
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fich))) {

			System.out.println("Introduzca nombres (nombre + apellido) de personas (Fin para terminar)");
			nom = teclado.nextLine();

			while ((nom.toLowerCase()).compareToIgnoreCase("fin") != 0) {
				// while(!(nom.equalsIgnoreCase("fin"))){
				bw.write(nom);
				bw.newLine();
				nom = teclado.nextLine();
			}

		} catch (Exception e) {
			System.out.println("ERROR DE ESCRITURA " + e);
		}
	}

	public static void leerFichero(String fich) {
		String nom;

		// Leemos el nuevo fichero:
		try (BufferedReader br = new BufferedReader(new FileReader(fich))) {
			while ((nom = br.readLine()) != null) {
				System.out.println(nom);
			}
		} catch (Exception e) {
			System.out.println("ERROR DE LECTURA " + e);
		}
	}
}
