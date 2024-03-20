package basicos;

import java.io.*;

public class CreaFichero2 {
	public static void main(String[] args) {
		String frase = "Esto es un ejemplo de escritura de ficheros de texto \r\n";
		FileWriter escribir = null;
		
		try {
			/* Crear un objeto File se encarga de crear o abrir acceso a un archivo que
			* se especifica en su constructor, pero no lo crea
			* File archivo = new File("texto.txt");
			*/
			
			/* Crear objeto FileWriter nos permitira escribir sobre el archivo
			* FileWriter escribir = new FileWriter(archivo);
			* */
			
			escribir = new FileWriter("texto.txt"); // Crea el fichero en la carpeta del proyecto			
			
			// FileWriter escribir = new FileWriter(archivo,true); // Para aniadir al texto que ya existia
			
			// Se escribe en el archivo con el metodo write
			
			escribir.write(frase);
			escribir.write(frase);
					
			// System.out.println(System.in.getClass()); // System.in es un BufferedInputStream
		} catch (Exception e) {
			System.out.println("Error al escribir " + e);
		} finally {
			try {
				escribir.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
