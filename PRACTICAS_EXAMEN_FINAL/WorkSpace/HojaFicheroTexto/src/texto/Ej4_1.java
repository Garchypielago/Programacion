package texto;

import java.io.*;
import java.util.Scanner;

public class Ej4_1 {
	public static void main(String[] args) {
		// char ct;
		int c, cant;
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		final String FICHERO1 = "parrafo.txt", FICHERO2 = "codificado.txt";

		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Introduce el valor a sumar");
			cant = Integer.parseInt(sc.nextLine());
			System.out.println("cant " + cant);
			sc.close();

			// Podria crear un valor al azar tambien:
			// cant=(int)(Math.random()*10);

			// Creo el fichero de salida:
			fw = new FileWriter(FICHERO2);

			// Abro el fichero de entrada:
			fr = new FileReader(FICHERO1);

			// Comenzamos a leer
			c = fr.read();
			while (c != -1) { // no es fin de fichero
				if (c != ' ' && c != '\n' && c != '\r') // espacio o salto de
														// linea
					// if(c!=32 && c!=10 && c!=13) // espacio o salto de linea
					c = c + cant;
				fw.write((char) c);
				c = fr.read();
			}
		} catch (Exception e) {
			System.out.println("ERROR DE LECTURA");
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fr != null)
					fr.close();
				if (fw != null)
					fw.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		String frase;

		try {
			br = new BufferedReader(new FileReader(FICHERO2));
			frase = br.readLine();
			while (frase != null) {
				System.out.println(frase);
				frase = br.readLine();
			}
		} catch (Exception e) {
			System.out.println("ERROR DE LECTURA " + e);
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
