package readerWriter;

import java.io.*;
import java.util.Scanner;

public class EscribirFicheroCaracter3 {
	public static void main(String[] args) {
		final String NOMFICH = "texto.txt";
		FileWriter escribir = null;

		try {
			// Crear un objeto File se encarga de crear o abrir acceso a un archivo que
			// se especifica en su constructor (el fichero no tiene por que existir)
			File archivo = new File(NOMFICH);
			Scanner sc = new Scanner(System.in);

			// Crear objeto FileWriter que sera el que nos ayude a escribir sobre el archivo

			escribir = new FileWriter(archivo);

			// Crea el fichero en la carpeta del proyecto por defecto

			// FileWriter escribir = new FileWriter(archivo,true); // Para aniadir

			// Se escribe en el archivo con el metodo write
			String linea;

			while (sc.hasNext()) {
				linea = sc.nextLine();
				System.out.println(linea);
				escribir.write(linea + "\r\n");
			}

			sc.close();

			// Ctrl-Z debe ir en una linea solo (la linea donde se detecta no se escribira)

			// Se cierra la conexion

			System.out.println("Cerramos fichero de escritura");
		} catch (Exception e) {
			System.out.println("Error al escribir");
			System.out.println(e.getMessage());
		} finally {
			try {
				escribir.close();
			} catch (Exception e) {
			}
		}
	}
}
