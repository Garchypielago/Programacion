package serializables4;

/*
 * Arreglamos el problema reescribiendo la clase ObjectOutputStream
 * Siempre tiene que existir el fichero antes de ejecutar este programa
 * para probar ejecutamos antes el programa PruebaPersonaAntes
 * Ojo, que hay que borrar el antiguo fichero, ya que la clase Persona es distinta
 * esta en otro paquete (aunque en esta caso tenga un id identico)
 * 
 * */

import java.io.*;

public class PruebaPersona {
	final static String NOM_FICH = "datos.obj";

	public static void main(String[] args) {
		Persona p1;
		System.out.println("ESCRITURA");
		File f = new File(NOM_FICH);

		try (ClaseOutput co = new ClaseOutput(new FileOutputStream(f, true))) {
			// Este programa funcionara si ya existe el fichero
			// ya existe una cabecera correcta en el fichero

			p1 = new Persona("Pepi", 53);
			co.writeObject(p1);
			p1 = new Persona("Julia", 17);
			co.writeObject(p1);

		} catch (IOException ex) {
			System.out.println(ex);
		}

		System.out.println("LECTURA");

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOM_FICH))) {
			// Se lee el fichero con todos los datos

			try {
				while (true) {
					p1 = (Persona) ois.readObject();
					System.out.println(p1);
				}
			} catch (EOFException e) {
			}

		} catch (IOException ex) {
			System.out.println(ex);
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}