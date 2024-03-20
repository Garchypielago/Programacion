package basicos;

import java.io.*;

/* 
 * Para crear el fichero tiene que estar ya creada la ruta donde queremos crearlo
 * */
public class BorrarFichero {
	public static void main(String args[]) {
		// Crea un objeto File para un fichero en el directorio de trabajo
		File f = new File("nuevo.txt");
		try {
			// A partir del objeto File creamos el fichero fisicamente
			if (f.createNewFile())
				System.out.println("El fichero se ha creado correctamente");			
			else
				System.out.println("No se ha podido crear el fichero");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Provocar error al borrar: vemos que no nos proporciona ninguna info sobre la razon
		if (f.delete())
			System.out.println("Se ha borrado");
		else 
			System.out.println("No se ha borrado");
	}
}
