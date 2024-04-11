package texto;
import java.io.*;

public class Ej3_2este {
	public static void main(String[] args) {

		final String FICHERO1 = "f1.txt", FICHERO2 = "f2.txt",
				FICHERO3 = "f3.txt";

		crearFichero(FICHERO1, FICHERO2, FICHERO3);
		leerFichero(FICHERO3);
	}

	public static void crearFichero(String fich1, String fich2, String fich3) {
		int c1, c2;
		File f = new File(fich3);
		
		try (FileWriter fw = new FileWriter(f);
				FileReader fr1 = new FileReader(fich1);
				FileReader fr2 = new FileReader(fich2);) {

			c1 = fr1.read();
			c2 = fr2.read();

			while (c1 != -1 && c2 != -1) {
				if (c1 < c2) {
					fw.write((char) c1);
					c1 = fr1.read();
				} else if (c1 > c2) {
					fw.write((char) c2);
					c2 = fr2.read();
				} else {
					fw.write((char) c1);
					fw.write((char) c2);
					c1 = fr1.read();
					c2 = fr2.read();
				}
			}

			// Llega aqui cuando uno de los dos ha acabado de recorrerse
			// Volcamos el resto, primero un fichero y luego el otro
			while (c1 != -1) {
				fw.write((char) c1);
				c1 = fr1.read();
			}

			while (c2 != -1) {
				fw.write((char) c2);
				c2 = fr2.read();
			}

		} catch (Exception e) {
			System.out.println("ERROR DE LECTURA " + e);
		}

	}

	public static void leerFichero(String FICH) {
		int c1;
		
		// Ahora leemos el fichero nuevo generado
		try (FileReader fr = new FileReader(FICH)) {
			c1 = fr.read();
			while (c1 != -1) {
				System.out.print((char) c1);
				c1 = fr.read();
			}
		} catch (Exception e) {
			System.out.println("ERROR DE LECTURA " + e);
		}
	}

}
