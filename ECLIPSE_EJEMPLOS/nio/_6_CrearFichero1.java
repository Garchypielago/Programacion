package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _6_CrearFichero1 {
	public static void main(String args[]) {
		Path emptyFile = Paths.get("/examples/emptyFile.txt");
		// Path emptyFile = Paths.get("emptyFile.txt");
		// Tiene que existir la ruta que lo contiene para que se cree el fichero
		if (Files.notExists(emptyFile)) {
		    try {
				emptyFile = Files.createFile(emptyFile);
				System.out.println("Fichero creado");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else
			System.out.println("Ya existe el fichero");
	}
	
}
