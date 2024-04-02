package inputoutputstream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/* 	Descripcion

	Clase obtiene los bytes de lectura de un fichero. Es ideal para la lectura de streams de datos de ficheros.
	Sintaxis

	public class FileInputStream extends InputStream
*/

public class Prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final String DESTINO_B = "binario.dat", DESTINO_T = "texto.dat";

		try (FileOutputStream out = new FileOutputStream(DESTINO_B)) {

			out.write(10); // lo vuelco en un fichero de salida
			System.out.println("Fichero copiado");

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception ioe) {
			ioe.printStackTrace();
		}
		
		try (FileWriter out = new FileWriter(DESTINO_T)) {

			out.write("10"); // lo vuelco en un fichero de salida
			System.out.println("Fichero copiado");

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception ioe) {
			ioe.printStackTrace();
		}
	}
}
