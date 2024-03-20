package basicos;

import java.io.File;


public class EjemploFile {

	public static void main(String[] args) {

		try {
			File f1 = new File("C:\\Pruebas");
			System.out.println("f1.getPath() "+ f1.getPath());	
			System.out.println("f1.getName() "  + f1.getName());
			
			System.out.println();	
			
			File f2 = new File("C:\\Pruebas\\prueba.txt");
			System.out.println("f2.getPath() " + f2.getPath());	
			System.out.println("f2.getName() "  + f2.getName());	
		
			System.out.println();	
			
			System.out.println("Ruta compuesta:");	
			File dir = new File("C:\\Pruebas");
			File f3 = new File(dir, "prueba.txt");
			System.out.println("f3.getPath() " + f3.getPath());	
			System.out.println("f3.getName() "  + f3.getName());		
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
