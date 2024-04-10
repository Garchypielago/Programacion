package ej_02;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

import javax.swing.JOptionPane;

class MenuApp {

	public static final int MAX_OPC = 6;

	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		System.out.println();
		System.out.println("\t1. Añadir cliente");
		System.out.println("\t2. Listar clientes");
		System.out.println("\t3. Buscar cliente");
		System.out.println("\t4. Borrar cliente");
		System.out.println("\t5. Borrar fichero de clientes");
		System.out.println("\t6. Salir");
		do {
			System.out.print("\n\n\tElija opcion:");
			opcion_menu = Integer.parseInt(sc.nextLine());
		} while (opcion_menu < 1 || opcion_menu > tope_op);

		return opcion_menu;
	}

	final static String FICH = "Empresa.obj";
	// final static String FICH = JOptionPane.showInputDialog("Nombre de empresa") +
	// ".obj";

	public static void main(String args[]) {

		int opcion = 0;

		Scanner sc = new Scanner(System.in);

		while (opcion != MAX_OPC) {
			opcion = menu(MAX_OPC, sc);
			String NIF;

			switch (opcion) {
			case 1:
				try {
					Cliente cl;
					cl = new Cliente(JOptionPane.showInputDialog("NIF"), JOptionPane.showInputDialog("Nombre"),
							JOptionPane.showInputDialog("Direccion"),
							Integer.parseInt(JOptionPane.showInputDialog("Telefono")),
							Double.parseDouble(JOptionPane.showInputDialog("Deuda")));
					addCliente(FICH, cl);
				} catch (Exception e) {
					System.out.println("Error al crear el cliente");
				}
				break;
			case 2:
				listarClientes(FICH);
				break;
			case 3:
				NIF = JOptionPane.showInputDialog("Escribe el NIF del cliente");
				Cliente cl = buscarCliente(FICH, NIF);
				if (cl != null)
					System.out.println(cl.toString());
				else
					System.out.println("Cliente no encontrado.");
				break;
			case 4:
				NIF = JOptionPane.showInputDialog("Escribe el NIF del cliente");
				borrarCliente(FICH, NIF);
				break;
			case 5:
				borrarFichero(FICH);
				break;
			case 6:
				System.out.println("Programa finalizado");
				break;
			}
		}
		sc.close();
	}

	public static void addCliente(String FICH, Cliente cl) {
		try {
			File f = new File(FICH);
			if (f.exists() && f.length() > 0) {
				ClaseOutput co = new ClaseOutput(new FileOutputStream(f, true));
				co.writeObject(cl);
				co.close();
			} else {
				ObjectOutputStream oos;
				oos = new ObjectOutputStream(new FileOutputStream(f));
				oos.writeObject(cl);
				oos.close();
			}
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void listarClientes(String FICH) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICH))) {
			Cliente cl;
			while (true) {
				cl = (Cliente) ois.readObject();
				System.out.println(cl);
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

	public static Cliente buscarCliente(String FICH, String NIF) {
		Cliente cli = null;

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICH))) {
			Cliente cl;
			while (true) {
				cl = (Cliente) ois.readObject();
				if (cl.getNIF().equalsIgnoreCase(NIF))
					cli = cl;
			}
		} catch (EOFException ex) {
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}

		return cli;
	}

	public static void borrarCliente(String FICH, String NIF) {

		final String FICH_AUX = "auxiliar.obj";
		Cliente cl2;
		boolean hecho = false;

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICH));
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICH_AUX))) {

			try {
				Cliente cl = new Cliente(NIF);
				while (true) {
					cl2 = (Cliente) ois.readObject();
					if (!cl2.equals(cl)) {
						oos.writeObject(cl2);
						hecho = true;
					}
				}
			} catch (EOFException ex) {
			}
			oos.close();
			ois.close();

			File faux = new File(FICH_AUX);
			File f1 = new File(FICH);
			if (f1.delete()) {
				faux.renameTo(f1);
				if (hecho)
					System.out.println("Cliente " + NIF + " borrado");
				else
					System.out.println("Cliente no encontrado.");
			} else
				System.out.println("Se ha producido un error en la copia de registros nuevos al fichero");
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}

	public static void borrarFichero(String FICH) {
		File f = new File(String.valueOf(FICH));
		if (f.delete())
			System.out.println("Se ha borrado");
		else
			System.out.println("No se ha borrado");
	}

}