package texto;
import java.io.*;
import java.util.Scanner;

public class Ej4_2 {
	public static void main(String[] args) {

		final String FICHERO1 = "parrafo.txt", FICHERO2 = "parrafo1.txt";

		Scanner sc = new Scanner(System.in);
		
		crearFichero(FICHERO1, FICHERO2, sc);
		leerFichero(FICHERO2);
		
		sc.close();
	}

	public static void crearFichero(String fich1, String fich2, Scanner sc) {
		int c, cant;
		char ct;

		try (FileReader fr = new FileReader(fich1);
				FileWriter fw = new FileWriter(new File(fich2))) {
			System.out.println("Introduce el valor a sumar");
			cant = Integer.parseInt(sc.nextLine());
			System.out.println("cant " + cant);

			// Comenzamos a leer
			c = fr.read();
			while (c != -1) {
				if (c != ' ' && c != '\n' && c != '\r') // espacio o salto de
														// linea
					// if(c!=32 && c!=10 && c!=13) // espacio o salto de l�nea
					c = c + cant;
				ct = (char) c;
				fw.write(ct);
				c = fr.read();
			}
		} catch (Exception e) {
			System.out.println("ERROR DE LECTURA");
			System.out.println(e.getMessage());
		}
	}

	public static void leerFichero(String fich) {
		String frase;

		try (FileReader fr = new FileReader(fich);
				BufferedReader br = new BufferedReader(fr);) {
			frase = br.readLine();
			while (frase != null) {
				System.out.println(frase);
				frase = br.readLine();
			}
		} catch (Exception e) {
			System.out.println("ERROR DE LECTURA " + e);
		}
	}

}
