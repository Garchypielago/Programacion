package nio;
//Con java.nio y Lambdas

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class _3_EjemploRecorrerDir2 {
	public static void main(String args[]) {
		listarFicherosPorCarpeta("C:\\Users\\Alumno\\Downloads");
	}
	
	// Proceso para recorrer las carpetas y ficheros de un directorio con java 8, nio
	public static void listarFicherosPorCarpeta(String carpeta) {
		try {
			Files.walk(Paths.get(carpeta)).forEach(ruta-> {
			    if (Files.isRegularFile(ruta)) {
			        System.out.println(ruta);
			    }
			    else System.out.println("--" + ruta + "--");
			    	
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
