package texto;

import java.io.*;

public class Ej3_3 {
	public static void main(String[] args) {

		final String FICHERO1 = "f1.txt", FICHERO2 = "f2.txt", FICHERO3 = "f3.txt";

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
				if (c1 == ' ' || c1 == '\n' || c1 == '\r')
					c1 = fr1.read();
				else if (c2 == ' ' || c2 == '\n' || c2 == '\r')
					c2 = fr2.read();
				else if (c1 < c2) {
					fw.write((char) c1 + "\r\n");				
					c1 = fr1.read();
				} else if (c1 > c2) {
					fw.write((char) c2 + "\r\n");	
					c2 = fr2.read();
				} else {
					fw.write((char) c1 + "\r\n");						
					fw.write((char) c2 + "\r\n");						
					c1 = fr1.read();
					c2 = fr2.read();
				}
				// no es espacio o salto de linea ninguno de los caracteres
				// Aqui ignoramos los espacios y saltos de linea,
				// para evitar que si hay letras repetidas no escriba bien los saltos de linea

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
			while ((c1 = fr.read()) != -1) {
				System.out.print((char) c1);
			}
		} catch (Exception e) {
			System.out.println("ERROR DE LECTURA " + e);
		}
	}

}
