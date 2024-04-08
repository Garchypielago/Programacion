package serializables3;

/*
 * Primer metodo para arreglar el problema visto:
 * Usamos un fichero auxiliar: chapuza
 * 
 * */
import java.io.*;

public class PruebaPersona {
	final static String NOM_FICH = "datos.obj", NOM_FICH_AUX = "auxiliar.obj";

	public static void main(String[] args) {

		Persona p1 = new Persona("Pablo", 20);
		Persona p2 = new Persona("Rosa", 35);

		// Insertamos las dos personas que acabamos de crear

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOM_FICH))) {
			oos.writeObject(p1);
			oos.writeObject(p2);
		} catch (IOException ex) {
			System.out.println(ex);
		}

		// Se aniaden dos registros mas usando el primer metodo.
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOM_FICH));
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOM_FICH_AUX))) {

			try {// Si no capturo aqu� la excepci�n de EOF no pasa a escribir los objetos nuevos
					// Vuelco en un fichero auxiliar todo el contenido del original
				while (true) {
					p1 = (Persona) ois.readObject();
					oos.writeObject(p1);
				}
			} catch (EOFException ex) {
			}

			// Hemos leido los objetos del fichero datos.obj y los hemos pasado
			// al nuevo fichero temporal
			// Aniadimos dos nuevos objetos

			p1 = new Persona("Juan", 50);
			oos.writeObject(p1);
			p1 = new Persona("Maria", 35);
			oos.writeObject(p1);
			
			oos.close(); // para poder borrar y renombrar no esperamos a que termine el try
			ois.close(); // hay que cerrar aqui
			// Se podría hacer con dos try/catch para que se queden cerrados los dos ficheros
			// de forma natural. De todas formas, si se produce un error antes del cierre, al haber
			// hecho un try con recursos, nos aseguramos de que los ficheros no se quedan abiertos
			
			File faux = new File(NOM_FICH_AUX);
			File f1 = new File(NOM_FICH);
			if (f1.delete()) // Borro el fichero original
				faux.renameTo(f1); // auxiliar pasa a ser el fichero datos.obj
			else
				System.out.println("Se ha producido un error en la copia de registros nuevos al fichero");

		} catch (IOException ex) {
			System.out.println(ex);
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}

		// Ahora leemos el fichero con todos los datos
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOM_FICH))) {

			while ((p1 = (Persona) ois.readObject()) != null)
				System.out.println(p1);

		} catch (EOFException e) {
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
