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

public class EjFileInputOutputStream3 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final String ORIGEN = "..\\origen2.txt", DESTINO = "destino2.txt";

		try (FileInputStream in = new FileInputStream(ORIGEN);
				FileOutputStream out = new FileOutputStream(DESTINO)) {// podemos poner true como segundo parametro
			// Ahora leemos de una vez el fichero y lo volcamos en el destino
			// Problemas de mucha ocupacion de memoria a la vez
			byte[] fichLeido = in.readAllBytes();
			out.write(fichLeido);
			System.out.println("Fichero de texto binario");
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception ioe) {
			ioe.printStackTrace();
		}
	}
}
