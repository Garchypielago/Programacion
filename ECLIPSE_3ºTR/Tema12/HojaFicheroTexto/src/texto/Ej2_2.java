package texto;
import java.io.*;

public class Ej2_2 {
	public static void main(String[] args) {

		final String FICHERO1 = "parrafo.txt", FICHERO2 = "parrafo1.txt";

		crearFichero(FICHERO1, FICHERO2);

		leerFichero(FICHERO1);
		// Ahora leemos el nuevo fichero creado, linea a linea
		leerFichero(FICHERO2);
	}

	public static void crearFichero(String nomFich1, String nomFich2) {
		String vocales = "aeiou";
		int c;

		try (FileWriter fw = new FileWriter(nomFich2);
				FileReader fr = new FileReader(nomFich1);) {
			while ((c = fr.read()) != -1) { // Devuelve -1 si no hay mas
											// caracteres
				if (vocales.indexOf((char) c) == -1) // no esta en el conjunto de vocales -> devuelve -1
					fw.write((char) c);
			}

		} catch (Exception e) {
			System.out.println("ERROR DE LECTURA/ESCRITURA");
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
