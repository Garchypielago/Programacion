package nio;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;

//Este ejemplo es valido para ficheros de texto

public class _15_CopiarFichero2 {

	public static void main(String args[]) {

		Path inputFile = Paths.get("Cuento.txt");
		Path outputFile = Paths.get("C:\\Users\\Alumno\\Downloads\\Cuento.txt");
		
		// Esta forma vale para ficheros de texto
		try (
			BufferedReader inputReader = Files.newBufferedReader(inputFile,
					Charset.defaultCharset());
			BufferedWriter outputWriter = Files.newBufferedWriter(outputFile,
					Charset.defaultCharset(), StandardOpenOption.WRITE,
					StandardOpenOption.CREATE,
					StandardOpenOption.TRUNCATE_EXISTING)) {

			String linea; 
			while ((linea = inputReader.readLine()) != null) {
				outputWriter.write(linea, 0, linea.length()); // toda la linea
				outputWriter.newLine();
			}
		} catch (IOException e) {
			System.err.println(" ERROR : " + e);
			System.exit(1);
		} catch (Exception e) {
			System.err.println(" ERROR : " + e);
			System.exit(1);
		}
	}
}
