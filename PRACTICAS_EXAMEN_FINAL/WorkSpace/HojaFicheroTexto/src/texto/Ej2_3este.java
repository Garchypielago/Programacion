package texto;

import java.io.*;

public class Ej2_3este {
	public static void main(String[] args) {

		final String FICHERO1 = "parrafo.txt", FICHERO2 = "parrafo11.txt";

		crearFicheroSinVoc(FICHERO1, FICHERO2);

		leerFichero(FICHERO1);
		// Ahora leemos el nuevo fichero creado, l�nea a l�nea
		leerFichero(FICHERO2);
	}

	public static void crearFicheroSinVoc(String nomFich1, String nomFich2) {
		String linea;

		try (BufferedReader br = new BufferedReader(new FileReader(nomFich1));
				BufferedWriter bw = new BufferedWriter(new FileWriter(nomFich2))) {

			while (br.ready()) {
				// nom = br.lines();
				linea = br.readLine();
				linea = linea.replaceAll("[aeiou]", "");
				bw.write(linea + "\r\n");
			}

			System.out.println();
		} catch (Exception e) {
			System.out.println("ERROR DE LECTURA");
		}
	}

	public static void leerFichero(String nomFich) {
		String frase;
		try (BufferedReader br = new BufferedReader(new FileReader(nomFich))) {
			while ((frase = br.readLine()) != null) {
				System.out.println(frase);
			}
		} catch (Exception e) {
			System.out.println("ERROR DE LECTURA");
		}

	}
}
