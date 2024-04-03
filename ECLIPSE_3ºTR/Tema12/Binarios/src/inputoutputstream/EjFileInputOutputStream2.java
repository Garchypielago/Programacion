package inputoutputstream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 	Descripcion

	Clase obtiene los bytes de lectura de un fichero. Es ideal para la lectura de streams de datos de ficheros.
	Sintaxis
	Ahora lo usamos para un fichero de texto

	public class FileInputStream extends InputStream
*/

public class EjFileInputOutputStream2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int TAM = 1024;
		final String ORIGEN = "..\\origen.txt", DESTINO = "destino.txt";

		try (FileInputStream in = new FileInputStream(ORIGEN);
				FileOutputStream out = new FileOutputStream(DESTINO)) {
			byte[] buf = new byte[TAM];
			int len;

			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception ioe) {
			ioe.printStackTrace();
		}
	}
}
