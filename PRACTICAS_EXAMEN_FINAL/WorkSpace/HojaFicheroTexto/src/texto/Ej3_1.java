package texto;

import java.io.*;

public class Ej3_1 {
	public static void main(String[] args) {
		int c1, c2;
		final String FICHERO1 = "f1.txt", FICHERO2 = "f2.txt", FICHERO3 = "f3.txt";

		FileWriter fw = null;
		FileReader fr = null, fr1 = null, fr2 = null;

		try {
			fw = new FileWriter(FICHERO3);

			fr1 = new FileReader(FICHERO1);
			fr2 = new FileReader(FICHERO2);

			c1 = fr1.read();
			c2 = fr2.read();

			while (c1 != -1 && c2 != -1) {  // Mientras haya algo en los dos ficheros
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
		} finally {
			try {
				if (fr2 != null)
					fr2.close();
				if (fr1 != null)
					fr1.close();
				if (fw != null)
					fw.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

		// Ahora leemos el fichero nuevo generado
		try {
			fr = new FileReader(FICHERO3);
			c1 = fr.read();
			while (c1 != -1) {
				System.out.print((char) c1);
				c1 = fr.read();
			}

		} catch (Exception e) {
			System.out.println("ERROR DE LECTURA " + e);
		} finally {
			try {
				if (fr != null)
					fr.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
