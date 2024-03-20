/* 
* Crea el fichero "C:\\Practicas\\texto1.txt", teniendo en cuenta que no existe la carpeta
* que se indica. El programa debe crear tanto la carpeta como el fichero
* Una vez conseguido lo que se pide, haz que el programa pida el fichero y la carpeta.
* 
* */
package basicos;

import java.io.*;

public class CreaFichero3 {
	public static void main(String args[]) {
		final String CARPETA = "C:\\Practicas";
		final String FICHERO = "C:\\Practicas\\texto1.txt";
	
//		File f1 = new File("C:\\Practicas", "texto1.txt");

		// Crea un fichero dada la ruta completa

		File f1 = new File(FICHERO);

		// El directorio tiene que existir previamente a createNewFile(),
		// si no existe daria una excepcion
		// Si ya existe el fichero, createNewFile devuelve error
		if (!f1.exists()) {
			System.out.println("No existe la carpeta, hay que crearla");
			File f2 = new File(CARPETA);
			if (f2.mkdirs())
				try {
					System.out.println("La carpeta " + f2.getPath() + " se ha creado correctamente");
					if (new File(FICHERO).createNewFile())
						System.out.println("El fichero " + f1.getName() + " se ha creado correctamente");
					else
						System.out.println("No ha podido ser creado el fichero");
				} catch (IOException e) {
					System.out.println("Excepcion creando el fichero.");
					e.printStackTrace();
				}
		} else
			System.out.println("El fichero ya existe");

	}
}
