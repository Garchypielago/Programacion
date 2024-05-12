package nio;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Files;
import java.io.IOException;

// Por defecto, Files.readAllLines() usa codificacion UTF-8.
// Pero se puede usar otra codificacion:
// List<String> lines = Files.readAllLines(Paths.get("input.txt"), StandardCharsets.UTF_16);

public class _13_Cat2 {
	

	public static void main(String args[]) {
		

		Path path = Paths.get("Cuento.txt");
		try {
			// lee todas las lineas en una lista de cadenas
		    List<String> lines = Files.readAllLines(path);
		    
		    // imprime todas las lineas
		    for (String line : lines) {
		        System.out.println(line);
		    }
		} catch (IOException e) {
			System.err.println(" ERROR: " + e);
			System.exit(1);
		}
		
	}
}
