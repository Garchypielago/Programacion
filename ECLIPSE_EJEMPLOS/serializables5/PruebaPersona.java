package serializables5;

/**
 * Solucion que contempla todos los casos y es la mas optima
 */
import java.io.*;

public class PruebaPersona {
	final static String NOM_FICH = "datos.obj";

	public static void main(String[] args) {
		Persona p1;
		try {
			// Este programa funcionara
			// tanto si ya existe el fichero, como si se crea de nuevo
			// Para ello pregunta si existe el fichero y si no existe
			// usa la clase que no aniade cabecera
			// Si existe usara la otra clase (FileOutputStream)
			File f = new File(NOM_FICH);
			// Que pasa si existe y esta vacio...?
			if (f.exists() && f.length() > 0) {
				ClaseOutput co = new ClaseOutput(new FileOutputStream(f, true));
				p1 = new Persona("Pepi", 53);
				co.writeObject(p1);
				p1 = new Persona("Julia", 17);
				co.writeObject(p1);
				co.close();
			} else {
				ObjectOutputStream oos;
				oos = new ObjectOutputStream(new FileOutputStream(f));
				p1 = new Persona("Lola", 53);
				oos.writeObject(p1);
				p1 = new Persona("Juana", 17);
				oos.writeObject(p1);
				oos.close();
			}
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOM_FICH))) {
			// Se lee el fichero con todos los datos

			while (true) {
				p1 = (Persona) ois.readObject();
				System.out.println(p1);
			}
		} catch (EOFException ex) {
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}