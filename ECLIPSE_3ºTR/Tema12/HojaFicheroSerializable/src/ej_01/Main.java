package ej_01;

import java.io.*;
import javax.swing.*;

public class Main {

	final static String FICH = JOptionPane.showInputDialog("Nombre del alumno") + ".obj";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		crearFichero(FICH);
		leerFichero(FICH);
		System.out.println("Su nota media del curso es de: " + mediaFichero(FICH));

	}

	public static void crearFichero(String FICH) {
		try {

			File f = new File(FICH);
			Asignatura asig;
			Asignaturas arr = new Asignaturas();

			arr.rellenar();

			System.out.println("………………Volcando la lista al fichero………………");
			if (f.exists() && f.length() > 0) {
				ClaseOutput co = new ClaseOutput(new FileOutputStream(f, true));
				for (int i = 0; i < arr.arr.size(); i++) {
					asig = new Asignatura(arr.arr.get(i).getNombre(), arr.arr.get(i).getNota());
					co.writeObject(asig);
				}
				co.close();
			} else {
				ObjectOutputStream oos;
				oos = new ObjectOutputStream(new FileOutputStream(f));
				for (int i = 0; i < arr.arr.size(); i++) {
					asig = new Asignatura(arr.arr.get(i).getNombre(), arr.arr.get(i).getNota());
					oos.writeObject(asig);
				}
				oos.close();
			}
			System.out.println("***** Volcado finalizado con éxito *****");
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void leerFichero(String FICH) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICH))) {
			Asignatura asig;

			while (true) {
				asig = (Asignatura) ois.readObject();
				System.out.println(asig);
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

	public static double mediaFichero(String FICH) {
		double media = -1;
		double suma = 0;
		int contador = 0;

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICH))) {
			Asignatura asig;

			System.out.println("…………………….Calculando media…………….…….");
			while (true) {
				asig = (Asignatura) ois.readObject();
				suma = suma + asig.getNota();
				contador++;
			}
		} catch (EOFException ex) {
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		if (contador != 0)
			media = suma / contador;

		return media;

	}

}
