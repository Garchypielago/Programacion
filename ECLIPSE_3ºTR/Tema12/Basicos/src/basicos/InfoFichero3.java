package basicos;

import java.io.File;

public class InfoFichero3 {
	public static void main(String []args){
		
		// Probar con las distintas combinaciones
		
		// Comprobamos si la carpeta existe
		File f1 = new File("C:\\Practicas");
		if (f1.exists()){
			if (f1.isDirectory()) 
				System.out.println(f1.getPath() + " es un directorio.");
			else 
				System.out.println(f1.getPath() + " es un fichero.");
		}
		else
			System.out.println(f1.getPath() + " no existe.");
		
		// Comprobamos si el fichero existe
		File f2 = new File("C:\\Practicas\\texto.txt");
		
		if (f2.exists()) {
			if (f2.isDirectory()) 
				System.out.println(f2.getPath() + " es un directorio.");
			else
				System.out.println(f2.getPath() + " es un fichero.");				
		}
		else
			System.out.println(f2.getPath() + " no existe.");
		
		
	}		

}
