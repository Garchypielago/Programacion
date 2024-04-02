package introduccion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploBuffered {

	public static void main(String[] args) {
		final String NOMBRE_FICHERO = "fich_texto_ejemplo.txt";

		try {
			BufferedReader reader = new BufferedReader(new FileReader(NOMBRE_FICHERO));
			String linea = reader.readLine();
			while (linea != null) {
				// procesar el texto de la línea
				System.out.println("Linea " + linea);
				linea = reader.readLine();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// No se encontró el fichero
			System.out.println("No se encontro el fichero");
		} catch (IOException e) {
			// Algo fue mal al leer o cerrar el fichero
			System.out.println("Error de Entrada/Salida");
		}

	}

}
