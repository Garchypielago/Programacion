package nio;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.nio.file.StandardOpenOption;

// Copiamos un fichero usando buffer binario
public class _19_CopiaFichero1PorTrozos {
	final static String RUTA1 = "desierto.jpg";
	final static String RUTA2 = "desierto3.jpg";

	public static void main(String args[]) {

		Path inputPath = Paths.get(RUTA1);
		Path outputPath = Paths.get(RUTA2);

		try (BufferedInputStream input = new BufferedInputStream(
				Files.newInputStream(inputPath, StandardOpenOption.READ));
				BufferedOutputStream output = new BufferedOutputStream(Files.newOutputStream(outputPath,
						StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING))) {

			// lo divido en 10 trozos
			int bufferSize = (int) (Files.size(inputPath)) / 10;
			if (bufferSize <= 0)
				throw new NumberFormatException(RUTA2 + " no tiene tamaño positivo ");
			else {
				byte[] buffer = new byte[bufferSize];
				int cont = 0;
				int bytesRead = input.read(buffer, 0, bufferSize);
				while (bytesRead >= 0) {
					output.write(buffer, 0, bytesRead);
					System.out.println("Copiado trozo " + cont++);
					bytesRead = input.read(buffer, 0, bufferSize);
				}
			}

		} catch (IOException e) {
			System.err.println(" ERROR : " + e);
		} catch (Exception e) {
			System.err.println(" ERROR : " + e);
		}
	}
}
