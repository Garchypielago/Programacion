package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class _7_Copia {
	public static void main(String args[]) {
		
//		Path fichero = Paths.get("Desierto.jpg");
//		Path copiado = Paths.get("C:\\Users\\Alumno\\Downloads\\Desert.jpg");

		Path fichero = Paths.get("original.txt");
		Path copiado = Paths.get("originalCopia.txt");

		// Inicialmente tendremos un fichero llamado original.txt
		// Lo copiamos en la misma carpeta con otro nombre
		
		try {
			Path copiadoP = Files.copy(fichero, copiado, StandardCopyOption.REPLACE_EXISTING);
			// si ya existe la copia, la reemplaza
			System.out.println("Copiado con exito");
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
