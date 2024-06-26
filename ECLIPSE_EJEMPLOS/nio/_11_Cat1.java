package nio;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.io.IOException;

//imprime el contenido de un fichero usando un array de bytes
public class _11_Cat1 {

	public static void main(String args[]) {
	
		Path path = Paths.get("Cuento.txt"); // Devuelve un objeto Path
		System.out.println(" Default Charset = " + Charset.defaultCharset());
		try {
			byte[] content = Files.readAllBytes(path); // No es conveniente para ficheros muy grandes
			// Dependiendo de la codificacion del fichero me va a poner todos los caracteres correctos o no
			System.out.print(new String(content, StandardCharsets.UTF_8));
			
		} catch (IOException e) {
			System.err.println(" ERROR: " + e);
			System.exit(1);
		}
	}
}
