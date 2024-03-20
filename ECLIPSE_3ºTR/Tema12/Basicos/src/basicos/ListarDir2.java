package basicos;
// Utilizar los metodos de la clase File para indicar las propiedades del archivo 
// autoexec.nt en un sistema windows y para listar el contenido del fichero actual.
import java.io.*;

public class ListarDir2 {
	public static void main(String args[]) {
		File f1, f2, f3;
		String[] listaArchivos;
		int i;

		// Doble barra pues \ es un simbolo especial hay que escaparlo
		f1 = new File("C:\\WINDOWS\\system32", "xmllite.dll");

		// Sin path absoluto
		// f1 = new File( "/WINDOWS/system32", "xmllite.dll");//No es absoluto
		// Con path absoluto
		// f1 = new File( "C:\\WINDOWS\\system32\\xmllite.dll");//Si es absoluto

		System.out.println("Nombre: " + f1.getName());
		System.out.println("Camino: " + f1.getPath());

		System.out.println("Camino absoluto: " + f1.getAbsolutePath());

		System.out.println("Padre: " + f1.getParent()); // Imprime "C:\"
		System.out.println("Existe: " + f1.exists()); // Imprime true o false
		System.out.println("Se puede leer: " + f1.canRead()); // Imprime true o
																// false
		System.out.println("Se puede Escribir: " + f1.canWrite()); // Imprime
																	// true o
																	// false
		System.out.println("Es directorio: " + f1.isDirectory()); // Imprime
																	// true o
																	// false
		System.out.println("Es fichero: " + f1.isFile()); // Imprime true o
															// false
		System.out.println("Es absoluto: " + f1.isAbsolute()); // Imprime true o
																// false
		System.out.println("Longitud: " + f1.length()); // Imprime la longitud
		//

		System.out.println();
		
		f2 = new File("pepito.xxx"); // No crea fisicamente el archivo
		f3 = new File("."); // No crea fisicamente el archivo

		System.out.println("Camino absoluto de f2: " + f2.getAbsolutePath());
		System.out.println("Camino absoluto de f3: " + f3.getAbsolutePath());
		System.out.println("Es absoluto f2: " + f2.isAbsolute());
		System.out.println("Es absoluto f3: " + f3.isAbsolute());
		//
		System.out.println("Existe f2: " + f2.exists()); // Imprime true o false
		
		System.out.println();
		
		if (f3.isDirectory()) { // "." representa el directorio actual
			listaArchivos = f3.list();
			System.out.println("Contenido del directorio actual");
			for (i = 0; i < listaArchivos.length; i++)
				System.out.println(listaArchivos[i]); // Imprime un archivo o
														// directorio
		} else {
			System.out.println("No es un directorio.");
		}

	}
}

