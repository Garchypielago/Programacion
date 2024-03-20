package basicos;
// Listar el contenido de un directorio  almacenando los nombres en un array

// de String

import java.io.*;

public class ListarDir1 {
	public static void main(String args[]) throws IOException {

		String dirname = "C:\\prueba";
		File fc = new File(dirname);

		if (fc.exists()) {
			if (fc.isDirectory()) {
				System.out.println("Directorio de " + dirname);
				String[] listaArchivos = fc.list();
				System.out.println("Contenido del directorio actual");
				// No es un recorrido por todos los subdirectorios
				for (int i = 0; i < listaArchivos.length; i++) {
					File f = new File(dirname + "\\" + listaArchivos[i]);
					// File f = new File(listaArchivos[i]); // asi, si uno es un directorio, no
					// sale... no tiene la ruta completa
					if (f.isDirectory())
						System.out.println(listaArchivos[i] + " Es un directorio");
					else
						System.out.println(listaArchivos[i] + " Es un archivo");
				}
			} else
				System.out.println(dirname + " no es un directorio");
		} else
			System.out.println("El fichero/directorio no existe");

	}

}
