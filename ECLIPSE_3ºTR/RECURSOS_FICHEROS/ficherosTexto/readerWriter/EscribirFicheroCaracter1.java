package readerWriter;

import java.io.*;

public class EscribirFicheroCaracter1 {
	public static void main(String[] args) {
		final String NOMFICH = "texto.txt";

		String frase = "Esto es un ejemplo de escritura de ficheros de texto ";

		try {
			// Crear un objeto File se encarga de crear o abrir acceso a un archivo que
			// se especifica en su constructor (el fichero no tiene por que existir)
			File archivo = new File(NOMFICH);

			// Crear objeto FileWriter que sera el que nos ayude a escribir sobre el archivo
			// Crea el fichero en la carpeta del proyecto por defecto
			FileWriter escribir = new FileWriter(archivo);

			// FileWriter escribir = new FileWriter(archivo, true); // Para aniadir...

			// Se escribe en el archivo con el metodo write

			escribir.write(frase + "\r\n");

			escribir.write(frase);
			escribir.append('f');
			escribir.append('i');
			escribir.append('n');
			// Tambien podriamos escribir caracter a caracter de la cadena en el fichero de
			// salida
			escribir.write('h'); // funciona como append()
			// Se cierra la conexion
			escribir.close();
		} catch (Exception e) {
			System.out.println("Error al escribir");
		}

	}
}
