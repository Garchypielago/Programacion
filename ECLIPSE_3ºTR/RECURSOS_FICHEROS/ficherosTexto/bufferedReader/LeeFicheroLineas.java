package bufferedReader;

import java.io.*;

public class LeeFicheroLineas {
	public static void main(String arg[]) {
		final String NOMFICH = "c:\\fich1.txt";
		// Creamos manualmente el fichero con lineas con un editor
		// Creamos un String que va a ir conteniendo el texto del archivo
		// linea a linea.
		String texto = "";
		BufferedReader contenido = null; 
		try {
			// Se crea un objeto FileReader para conectarse con el archivo
			// FileReader lector = new FileReader(NOMFICH);
			// El contenido del objeto se envuelve en un BufferedReader
			// BufferedReader contenido = new BufferedReader(lector);
			// Se puede abreviar asi:
			contenido = new BufferedReader(new FileReader(NOMFICH));

			// Cambiar en properties del proyecto a UTF-8 en la codificacion
			// para que se vean los acentos bien.
			/*
			 * Se puede hacer una lectura adelantada como lo siguiente texto=
			 * contenido.readLine(); while(texto!=null){
			 * System.out.println(texto); texto= contenido.readLine(); }
			 * 
			 * O usar el metodo ready:
			 */

			while (contenido.ready()) {
				texto = contenido.readLine();
				System.out.println(texto);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el fichero");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (contenido != null)
					contenido.close(); // Podemos usar try con recursos y seria innecesario esto
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
