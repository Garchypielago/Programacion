package nio;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.charset.Charset;
import java.io.BufferedReader;
// Eclipse en Windows -> Preferences -> General -> Workspace -> Text file encoding y Content Types -> Text -> Default encoding
public class _16_Grep1 {
	// Busca un texto en un fichero y devuelve el numero de la linea donde esta e imprime la linea
	// Si no esta no hace nada
	
	public static void main(String args[]) {

		Path input = Paths.get("Cuento.txt");
		String palabra = "una";
		
		//try (BufferedReader inputReader = Files.newBufferedReader(input, StandardCharsets.ISO_8859_1)) {
		try (BufferedReader inputReader = Files.newBufferedReader(input, Charset.defaultCharset())) {		
			String linea;
			long numLinea = 1;
			while ((linea = inputReader.readLine()) != null) {
				if (linea.contains(palabra))
					System.out.println(numLinea + ": " + linea);
				numLinea++;
			}		
		} catch (IOException e) {
			System.err.println(" ERROR : " + e);
			System.exit(1);
		}
	}

}
