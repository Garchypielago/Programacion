package nio;
/*********************/
/**** Con java.io ****/
/*********************/
import java.io.File;

public class _3_EjemploRecorrerDir {
	public static void main(String args[]) {
		File carpeta = new File("C:\\Users\\Alumno\\Downloads");
		listarFicherosPorCarpeta(carpeta);
	}
	
	// Proceso recursivo para recorrer las carpetas y ficheros de un directorio
	public static void listarFicherosPorCarpeta(File carpeta) {
	    for (File ficheroEntrada : carpeta.listFiles()) {
	        if (ficheroEntrada.isDirectory()) {
	            listarFicherosPorCarpeta(ficheroEntrada);
	        } else {
	            System.out.println(ficheroEntrada.getName());
	        }
	    }
	}

}
