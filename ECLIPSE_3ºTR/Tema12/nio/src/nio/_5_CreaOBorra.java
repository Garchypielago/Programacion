package nio;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
// Si existe lo borro, si no existe lo creo

public class _5_CreaOBorra {
	public static void main(String args[]) {

		Path path = Paths.get("C:\\Users\\Zeus\\Downloads\\progit.pdf");
		try {
			if (Files.exists(path)) {
				// Podemos provocar error al borrar, cambiando el nombre mientras depuramos
				Files.delete(path); // A diferencia de io, nio produce una excepcion en caso de fallo
				System.out.println(" Borrado.");
			} else {
				Files.createFile(path); // Esto crea un fichero
				System.out.println(" Creado.");
			}

		} catch (IOException e) {
			System.err.println(e);
			System.exit(1);
		}
	}

}
