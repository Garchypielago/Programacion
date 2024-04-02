// Es como el caso 3 pero ahora cerramos con finally
package readerWriter;

import java.io.*;
import java.util.Scanner;

public class EscribirFicheroCaracter4 {
	public static void main(String[] args) {
		final String NOMFICH1 = "texto1.txt";
		final String NOMFICH2 = "texto2.txt";
		FileWriter escribir = null;
		Scanner sc = null;

		try {

			File archivo1 = new File(NOMFICH1);
			File archivo2 = new File(NOMFICH2);
			sc = new Scanner(archivo1);

			// Crear objeto FileWriter que sera el que nos ayude a escribir
			// sobre el archivo

			escribir = new FileWriter(archivo2);

			// Crea el fichero en la carpeta del proyecto por defecto

			// FileWriter escribir = new FileWriter(archivo,true);
			// Para aniadir

			// Se escribe en el archivo con el metodo write
			String linea;

			while (sc.hasNext()) {
				linea = sc.nextLine();
				System.out.println(linea);
				escribir.write(linea + "\r\n");
			}

		} catch (Exception e) {
			System.out.println("Error al escribir");
			System.out.println(e.getMessage());
		} finally {
			try {
				escribir.close();
				sc.close();
			} catch (Exception e) {
			}
		}
	}
}
