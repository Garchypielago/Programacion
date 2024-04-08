package serializables4;
/*
 * Escribimos dos objetos en un fichero y a continuacion los leemos.
 * No se vuelve a abrir para añadir mas objetos
 * */
import java.io.*;

public class PruebaPersonaAntes {
	final static String NOM_FICH = "datos.obj";

	public static void main(String[] args) {
		Persona p1 = new Persona("Pablo", 20);
		Persona p2 = new Persona("Rosa", 35);

		// Escribimos los dos objetos
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOM_FICH))) {
			oos.writeObject(p1);
			oos.writeObject(p2);
		} catch (IOException ex) {
			System.out.println(ex);
		}

		// Leemos los dos objetos
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOM_FICH))) {
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
