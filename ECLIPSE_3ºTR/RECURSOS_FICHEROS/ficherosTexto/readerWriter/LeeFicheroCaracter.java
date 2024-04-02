
package readerWriter;

//Ejemplo de lectura de un fichero caracterr a caracter.  
import java.io.*;
import java.util.Arrays;

public class LeeFicheroCaracter {
	public static void main(String arg[]) {
		final String NOMFICH = "texto.txt";
		// Se define un int que va a contener los caracteres del archivo
		int c;

		try (FileReader lector1 = new FileReader(NOMFICH)) {
			// Se crea un objeto FileReader que enlaza con el archivo

			// Con FileReader solo se lee caracter a caracter y un array de char

			c = lector1.read();
			while (c != -1) {
				System.out.print((char) c);
				c = lector1.read();
			}

//			while ((c = lector.read()) != -1)
//				System.out.print((char) c);

		} catch (Exception e) {
			System.out.println("Error al leer");
		}

		System.out.println();
		
		final int TAM = 10;
		char[] cadena = new char[TAM];
		try (FileReader lector2 = new FileReader(NOMFICH)) {
			while ((lector2.read(cadena)) != -1) {
				System.out.println(cadena);
				// Vacío el array
				Arrays.fill(cadena, ' ');
			}

		} catch (Exception e) {
			System.out.println("Error al leer");
		}
	}
}
