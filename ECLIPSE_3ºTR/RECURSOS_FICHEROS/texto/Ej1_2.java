package texto;

import java.io.*;
import java.util.*;

public class Ej1_2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final String FICHERO = "parrafo.txt";

		crearFichero(FICHERO, teclado);

		teclado.close();
	}

	public static void crearFichero(String nomFich, Scanner teclado) {
		String frase;

		File f = new File(nomFich);
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
			frase = teclado.nextLine();

			while (!frase.equalsIgnoreCase("FIN")) {
				bw.write(frase);
				bw.newLine();
				frase = teclado.nextLine();
			}
		} catch (IOException e) {
			System.out.println(e + "ERROR DE CREACION DEL FICHERO");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
