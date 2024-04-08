package serializables5;

/**
 * Solucion que contempla todos los casos y es la mas optima
 */
import java.io.*;

public class PruebaPersonaCreaVacio {
	final static String NOM_FICH = "datos.obj";

	public static void main(String[] args) {
		try {
			// Creo el fichero vacio para probar que ocurre con esta solucion en este caso
			File f = new File(NOM_FICH);

			ObjectOutputStream oos;
			oos = new ObjectOutputStream(new FileOutputStream(f));
			oos.close();

		} catch (IOException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	
	}
}