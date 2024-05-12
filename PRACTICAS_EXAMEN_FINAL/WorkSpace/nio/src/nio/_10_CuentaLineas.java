package nio;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.charset.Charset;
import java.io.BufferedReader;

public class _10_CuentaLineas {

	public static void main(String args[]) {

		Path path = Paths.get("prueba\\original.txt");
		long count = 0;
		
		try (BufferedReader reader = Files.newBufferedReader(path, Charset.defaultCharset())) {

			while (reader.readLine() != null)
				count++;

		} catch (IOException e) {
			System.err.println(" ERROR : " + e);
			System.exit(1);
		}

		System.out.println(count + " lineas");

		List<String> texto = null;
		try {
			texto = Files.readAllLines(path);// Guarda una linea en cada nodo de la lista que devuelve
		} catch (IOException e) {
			e.printStackTrace();
		}

		int cont = 0;
		for (String cadena : texto) {
			System.out.println(cadena);
			cont++;
		}
		System.out.println(cont + " lineas");
		System.out.println(texto.size() + " lineas");

	}
}
