
package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.Path;

public class _14_CopiarFichero1 {
	
	public static void main(String args[]) {

		Path inputFile = Paths.get("Desierto.jpg");
		Path outputFile = Paths.get("C:\\Users\\Alumno\\Downloads\\Desert.jpg");
		// Esta forma vale para ficheros de texto y binarios
		try {
			byte[] contents = Files.readAllBytes(inputFile);
			Files.write(outputFile, contents, StandardOpenOption.WRITE, StandardOpenOption.CREATE,
					StandardOpenOption.TRUNCATE_EXISTING);
//			Files.write(outputFile, contents, StandardOpenOption.WRITE, StandardOpenOption.CREATE,
//					StandardOpenOption.APPEND);
		} catch (IOException e) {
			System.err.println(" ERROR : " + e);
			System.exit(1);
		} catch (Exception e) {
			System.err.println(" ERROR : " + e);
			System.exit(1);
		}
	}

}
