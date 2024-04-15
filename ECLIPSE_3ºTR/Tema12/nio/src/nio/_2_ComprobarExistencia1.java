package nio;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class _2_ComprobarExistencia1 {
	public static void main(String args[]) {
		Path rutaFichero = Paths.get("test.txt");
		
		System.out.println(" path = " + rutaFichero);
		System.out.println(" exists = " + Files.exists(rutaFichero));
		System.out.println(" readable = " + Files.isReadable(rutaFichero));
		System.out.println(" writeable = " + Files.isWritable(rutaFichero));
		System.out.println(" executable = " + Files.isExecutable(rutaFichero));
		
		// La implementacion de Paths.get(), hace lo que FileSystems.getDefault().getPath()
		// en el siguiente ejercicio
	}
} 
