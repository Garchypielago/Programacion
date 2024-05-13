package ficheros;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import excepciones.ExcepVehiculo;
import i_o.CreacionObj;
import i_o.Vehiculo;

public class Fichero {

	private static File FICH = new File("Vehiculos.dat");

	public static ArrayList<Vehiculo> sacarCoches() {
		ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICH))) {
			Vehiculo coche;

			while (true) {
				coche = (Vehiculo) ois.readObject();
				lista.add(coche);
			}

		} catch (EOFException ex) {
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return lista;
	}

	public static void insertarCoche(Scanner sc) {
		try (MyOutputStream oos = new MyOutputStream(FICH)) {
			Vehiculo inser = CreacionObj.crearVehiculo(sc);
			oos.writeObject(inser);

		} catch (ExcepVehiculo ev) {
			System.out.println(ev.getMessage());
		} catch (EOFException ex) {
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void mostrarCoches() {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICH))) {
			Vehiculo coche;
			
			//meterle format
			while (true) {
				coche = (Vehiculo) ois.readObject();
				System.out.println(coche.toString());
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
