package nio;
import java.nio.file.Path;
import java.util.List;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.io.IOException;

// Eclipse en Windows -> Preferences -> General -> Workspace -> Text file encoding y Content Types -> Text -> Default encoding
public class _17_Grep2 {
	// Busca un texto en un fichero y devuelve el numero de la linea donde esta e imprime la linea
	// Si no esta no hace nada

	public static void main(String args[]) {
		long numLinea = 1;
		String fileName = "Cuento.txt";

		FileSystem sistemaFicheros = FileSystems.getDefault();
		Path rutaFichero = sistemaFicheros.getPath(fileName);

		try {
			List<String> texto = Files.readAllLines(rutaFichero);
			for (String linea : texto) {
				if (linea.contains("una"))
					System.out.println(numLinea + ": " + linea);
				numLinea++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
