package texto;

import java.io.*;
import java.util.Scanner;

public class Ej5_1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		FileWriter fw = null;
		BufferedReader br = null;
		String nom;
		final String FICHERO = "nombres.txt";

		// Generamos el fichero:
		try {
			/*
			 * File f=new File("nombres.txt"); FileWriter fw=new FileWriter(f);
			 */

			fw = new FileWriter(FICHERO);

			System.out.println("Introduzca nombres (nombre + apellido) de personas (Fin para terminar)");
			nom = teclado.nextLine();

			// while((nom.toLowerCase()).compareTo("fin")!= 0){
			while (!(nom.equalsIgnoreCase("fin"))) {
				fw.write(nom);
				// fw.write('\n'); Linux
				fw.write("\r\n"); // Windows
				nom = teclado.nextLine();
			}

		} catch (Exception e) {
			System.out.println("ERROR DE ESCRITURA " + e);
		} finally {
			try {
				if (fw != null)
					fw.close();
				if (teclado != null)
					teclado.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		// Leemos el nuevo fichero:
		try {
//			FileReader fr=new FileReader("nombres.txt");
//			BufferedReader br=new BufferedReader(fr);
			
			br = new BufferedReader(new FileReader(FICHERO));

			nom = br.readLine();
			while (nom != null) { // no es fin de fichero
				System.out.println(nom);
				nom = br.readLine();
			}
		} catch (Exception e) {
			System.out.println("ERROR DE LECTURA " + e);
		} finally {
			try {
				// fr.close();
				if (br != null)
					br.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
