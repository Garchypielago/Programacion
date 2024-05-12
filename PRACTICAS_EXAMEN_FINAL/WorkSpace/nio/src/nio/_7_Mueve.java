package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class _7_Mueve {
	public static void main(String args[]) {
		
		Path fichero = Paths.get("Desierto2.jpg");
		Path movido = Paths.get("C:\\Users\\Alumno\\Downloads\\Desert.jpg");

//		Path fichero = Paths.get("original.txt");
//		Path movido = Paths.get("prueba\\original.txt");
		
		// Ahora movemos el fichero a una carpeta con el nombre que tenemos en la ruta, 
		// la carpeta tiene que existir
		
		try {
			Path movidoP = Files.move(fichero, movido, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Movido con exito");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		

//Path java.nio.file.Files.walkFileTree(Path start, Set<FileVisitOption> options, int maxDepth, FileVisitor<? super Path> visitor) throws IOException

// Borramos el fichero que acabamos de copiar
//		try {
//			Files.delete(renombrado);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
