package ej_03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

import ej_02.ClaseOutput;

class MenuApp {

	public static final int MAX_OPC = 7;

	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		System.out.println();
		System.out.println("\t1. Agregar contacto.");
		System.out.println("\t2. Buscar contacto.");
		System.out.println("\t3. Modificar contacto.");
		System.out.println("\t4. Eliminar contacto.");
		System.out.println("\t5. Ordenar alfabéticamente.");
		System.out.println("\t6. Mostrar agenda.");
		System.out.println("\t7. Salir.");
		do {
			System.out.print("\n\n\tElija opcion:");
			opcion_menu = Integer.parseInt(sc.nextLine());
		} while (opcion_menu < 1 || opcion_menu > tope_op);

		return opcion_menu;
	}

	final static String FICH = "Agenda.obj";
	final static String SUP_FICH = "Eliminados.txt";
	// final static String FICH = JOptionPane.showInputDialog("Nombre de agenda") +
	// ".obj";

	public static void main(String args[]) {

		int opcion = 0;

		Scanner sc = new Scanner(System.in);

		while (opcion != MAX_OPC) {
			opcion = menu(MAX_OPC, sc);
			switch (opcion) {
			case 1:
				
				addContacto(FICH, null);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			}
		}
		sc.close();
	}
	
	public static void crearContacto() {
		
	}
	
	public static void addContacto(String FICH, Contacto cont) {
		File f = new File(FICH);
		try(MyOutputStream co = new MyOutputStream(f);) {
				co.writeObject(cont);
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
