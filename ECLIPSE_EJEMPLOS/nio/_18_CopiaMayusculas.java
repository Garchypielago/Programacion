package nio;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;

// Copia linea a linea solo las lineas que estan totalmente en mayusculas de un fichero en otro
public class _18_CopiaMayusculas {

	public static void main(String args[]) {
		// Recibe dos rutas a copiar el primer fichero con el nombre del segundo
		Path entrada = Paths.get("Cuento.txt");
		Path salida = Paths.get("C:\\Users\\Alumno\\Downloads\\Cuento.txt");

		try (BufferedReader inputReader = Files.newBufferedReader(entrada, Charset.defaultCharset());
				BufferedWriter outputWriter = Files.newBufferedWriter(salida, Charset.defaultCharset(),
						StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
			String linea;
			while ((linea = inputReader.readLine()) != null) {
				if (linea.equals(linea.toUpperCase())) {
					outputWriter.write(linea, 0, linea.length());
					outputWriter.newLine();
				}
			}
		} catch (IOException e) {
			System.err.println(" ERROR : " + e);
			System.exit(1);
		}
	}
}
