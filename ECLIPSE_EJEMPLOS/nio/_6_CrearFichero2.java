package nio;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _6_CrearFichero2 {
	public static void main(String args[]) {
		try {
			crearFichero("ejemplos/ficheros/FicheroVacio2.txt");
			// Ahora, si no existe la ruta contenedora, la creamos
			System.out.println("Fichero creado en su ruta");
		} catch (FileAlreadyExistsException e) {
			System.out.println("El fichero ya existe");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	
	public static void crearFichero(String ruta) throws IOException {
		Path RutaContenedora = Paths.get(ruta);
		Files.createDirectories(RutaContenedora.getParent());
		Files.createFile(RutaContenedora);
	}
}
