package basicos;

import java.io.*;

public class InfoFichero2 {

	public static void main(String args[]) {
		if (args.length >= 1) {
			for (int i = 0; i < args.length; i++) {
				File f = new File(args[i]);
				System.out.println("Nombre: " + f.getName());
				System.out.println("Camino: " + f.getPath());
				if (f.exists()) {
					if (f.isDirectory())
						System.out.println("Directorio existente ");
					else {
						System.out.print("Fichero existente ");
						System.out.print((f.canRead() ? " y se puede Leer" : " y no se puede leer"));
						System.out.print((f.canWrite() ? " y se puede Escribir" : " y no se puede escribir"));
						System.out.println(".");
						System.out.println("La longitud del fichero es de " + f.length() + " bytes");
					}
				} else
					System.out.println("El fichero no existe.");

				System.out.println();
			}
		} else
			System.out.println("Debe indicar un fichero.");
	}
}
