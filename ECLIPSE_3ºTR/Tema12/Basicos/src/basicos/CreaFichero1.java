package basicos;

import java.io.*;

/* 
 * Para crear el fichero tiene que estar ya creada la ruta donde queremos crearlo
 * */
public class CreaFichero1 {
	public static void main(String args[]) {
		// Crea un objeto File con la ruta completa en forma de cadena
		File f1 = new File("C:\\Ficheros\\nuevo.txt");
		try {
			// A partir del objeto File creamos el fichero fisicamente
			if (f1.createNewFile())
				System.out.println("El fichero se ha creado correctamente");
			else
				System.out.println("No se ha podido crear el fichero");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Crea un objeto File dada la ruta del directorio y el nombre
		// del fichero por separado y como dos cadenas:

		File f2 = new File("C:\\Ficheros", "nuevo2.txt");
		try {
			// A partir del objeto File creamos el fichero f�sicamente
			if (f2.createNewFile())
				System.out.println("El fichero se ha creado correctamente");
			else
				System.out.println("No ha podido ser creado el fichero");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		// Otra forma es mandando como primer parametro un objeto File
		File dir = new File("C:\\Ficheros");
		File f3 = new File(dir, "nuevo3.txt");
		try {
			// A partir del objeto File creamos el fichero fisicamente
			if (f3.createNewFile())
				System.out.println("El fichero se ha creado correctamente");
			else
				System.out.println("No ha podido ser creado el fichero");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}
}
