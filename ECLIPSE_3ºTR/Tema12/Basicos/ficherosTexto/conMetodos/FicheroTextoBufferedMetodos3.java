package conMetodos;

import java.io.*; //Importamos todas las clases de java.io.
import java.util.*;

public class FicheroTextoBufferedMetodos3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String FICH = "fichero.txt";
		// Escribimos en el fichero
		escribeFichero(FICH, sc);

		// Leemos el fichero y lo mostramos por pantalla
		leeFichero(FICH);
	}

	/**
	 * escribeFichero
	 */
	public static void escribeFichero(String fichero, Scanner sc) {
		BufferedWriter bw = null;

		try {
			bw = new BufferedWriter(new FileWriter(fichero));
			// Escribimos en el fichero

			String leido = null;
			
			System.out.println("Introduzca una línea (fin para terminar)");
			while (!(leido = sc.nextLine()).equalsIgnoreCase("fin")) {
				bw.write(leido);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error E/S: " + e);
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (IOException e) {
				System.out.println("Error E/S: " + e);
			}
		}
	}

	/**
	 * leeFichero
	 */
	public static void leeFichero(String fichero) {
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(fichero));
			// Leemos el fichero y lo mostramos por pantalla
			String linea = br.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error E/S: " + e);
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				System.out.println("Error E/S: " + e);
			}
		}

	}
}
