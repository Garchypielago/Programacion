package inputoutputstream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 	Descripcion

	Clase obtiene los bytes de lectura de un fichero. Es ideal para la lectura de streams de datos de ficheros.
	Sintaxis

	public class FileInputStream extends InputStream
*/

public class EjFileInputOutputStream1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int TAM = 1024;
		final String ORIGEN = "..\\Desert.jpg", DESTINO = "Desierto.jpg";

		try (FileInputStream in = new FileInputStream(ORIGEN);
				FileOutputStream out = new FileOutputStream(DESTINO)) {
			byte[] buf = new byte[TAM]; // buffer para guardar lo leido
			int len;

			while ((len = in.read(buf)) > 0) { // lo leo en el buffer, en trozos de 1024 bytes
				out.write(buf, 0, len); // lo vuelco en un fichero de salida
			}
			System.out.println("Fichero copiado");

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception ioe) {
			ioe.printStackTrace();
		}
	}
}
