package serializables1;
/*
 * Escribimos dos objetos en un fichero y a continuacion los leemos.
 * No se vuelve a abrir para añadir mas objetos
 * */
import java.io.*;

public class PruebaPersona2 {
	final static String NOM_FICH = "datos.obj";

	public static void main(String[] args) {
		Persona p1 = new Persona("Pablo", 20);
		Persona p2 = new Persona("Rosa", 35);

		// Escribimos los dos objetos
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOM_FICH, true))) {
			oos.writeObject(p1);
			oos.writeObject(p2);
		} catch (IOException ex) {
			System.out.println(ex);
		}

		// Leemos los dos objetos
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOM_FICH))) {
			
			while (true) {
				p1 = (Persona) ois.readObject();
				System.out.println(p1.devolverEdad() + " " + p1.devolverNombre());				
			}
		} catch (EOFException ex) {
			System.out.println("fin de fichero");
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
