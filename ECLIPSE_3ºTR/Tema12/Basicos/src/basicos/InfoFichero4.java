package basicos;

import java.io.File;

public class InfoFichero4 {
	public static void main(String []args){	
		
		// Hacer la prueba existiendo la carpeta Practicas y  no existiendo
		File f1 = new File("C:\\Practicas\\uno");
		if (f1.exists()) {
			if (f1.isDirectory()) 
				System.out.println(f1.getPath() + " es un directorio.");
			else 
				System.out.println(f1.getPath() + " es un fichero.");
		}
		else {// El directorio no existe
			System.out.println(f1.getPath()+ ", no existe.");
			if (f1.mkdir())
				System.out.println(f1.getPath()+ ", lo creamos con mkdir.");
			else
				System.out.println(f1.getPath()+ ", no se ha podido crear con mkdir." );
		}
		
		// Con el metodo mkdirs si se puede crear
		if (!f1.exists()) {// El directorio no existe
			if (f1.mkdirs())
				System.out.println(f1.getPath()+ ", lo creamos con mkdirs.");
			else
				System.out.println(f1.getPath()+ ", no se ha podido crear con mkdirs." );
		}
		
		// Prueba:
		
		if (f1.delete()) System.out.println(f1.getPath()+ ", Se ha podido borrar." );
		// Se borra solo el fichero pero deja la carpeta...
		else System.out.println(f1.getPath()+ ", No se ha podido borrar." );
//		Deletes the file or directory denoted by this abstract pathname. If this pathname denotes a directory, then the directory must be empty in order to be deleted. 
//
//		Note that the java.nio.file.Files class defines the delete method to throw an IOException when a file cannot be deleted. This is useful for error reporting and to diagnose why a file cannot be deleted.

		f1 = new File("C:\\Practicas");
		if (f1.delete()) System.out.println(f1.getPath()+ ", Se ha podido borrar." );
		else System.out.println(f1.getPath()+ ", No se ha podido borrar." );
	}		

}
