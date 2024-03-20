package basicos;

import java.io.*;

public class CreaFichero4 {
	public static void main(String args[]) {
		// Crea un fichero dada la ruta completa
		// Si hemos ejecutado el ejercicio CreaFichero3, ya tendremos la carpeta y el fichero texto1

		System.out.println("CASO 1");
		File f1 = new File("C:\\Practicas\\texto1.txt");
		// El directorio tiene que existir previamente a createNewFile()
		// Sin embargo, si existe el fichero, createNewFile devuelve falso
		if (!f1.exists()) {
			try {

				// A partir del objeto File creamos el fichero fisicamente
				if (f1.createNewFile())
					System.out.println("El fichero se ha creado correctamente");
				else
					System.out.println("No ha podido ser creado el fichero");
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		} else
			System.out.println("El fichero ya existe");

		// Crea un fichero dada la ruta del directorio y el nombre
		// del fichero por separado
		System.out.println("CASO 2");
		File f2 = new File("C:\\Practicas", "texto2.txt");
		if (!f2.exists()) {

			// Crea un fichero dado el directorio y el nombre
			// del fichero por separado
			try {
				// A partir del objeto File creamos el fichero fisicamente
				if (f2.createNewFile())
					System.out.println("El fichero se ha creado correctamente");
				else
					System.out.println("No ha podido ser creado el fichero");
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		} else
			System.out.println("El fichero ya existe");

		// Crea un fichero dada la ruta del directorio y el nombre
		// del fichero por separado, con File como primer parámetro
		System.out.println("CASO 3");
		File dir = new File("C:\\Practicas");
		File f3 = new File(dir, "texto3.txt");

		if (!f3.exists()) {
			try {
				// A partir del objeto File creamos el fichero físicamente
				if (f3.createNewFile())
					System.out.println("El fichero se ha creado correctamente");
				else
					System.out.println("No ha podido ser creado el fichero");
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		} else
			System.out.println("El fichero ya existe");
	}
}
