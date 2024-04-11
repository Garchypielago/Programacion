package ej_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

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
				try {
					Contacto cont;
					cont = crearContacto(sc);
					addContacto(FICH, cont);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try {
					Contacto cont;
					cont = crearContacto(sc);
					buscarContacto(FICH, cont);
					if (cont != null)
						System.out.println(cont.toString());
					else
						System.out.println("Contacto no encontrado.");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					Contacto cont;
					cont = crearContacto(sc);
					modificarContacto(FICH, cont, sc);
					if (cont != null)
						System.out.println("Se ha modificado: " + cont.toString());
					else
						System.out.println("Contacto no encontrado.");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				try {
					Contacto cont;
					cont = crearContacto(sc);
					eliminarContacto(FICH, SUP_FICH, cont);
					if (cont != null)
						System.out.println("Se ha eliminado: " + cont.toString());
					else
						System.out.println("Contacto no encontrado.");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				ordenarAgenda(FICH);
				break;
			case 6:
				mostrarAgenda(FICH);
				break;
			case 7:
				mostrarEliminados(SUP_FICH);
				System.out.println("\n Programa finalizado.");
				break;
			}
		}
		sc.close();
	}

	public static Contacto crearContacto(Scanner sc) {
		Contacto cont = null;
		String nombre, apellidos, email;
		int numero;

		System.out.println("Nombre:");
		nombre = sc.nextLine();
		System.out.println("Apellido:");
		apellidos = sc.nextLine();
		System.out.println("E-mail:");
		email = sc.nextLine();
		System.out.println("Telefono:");
		numero = Integer.parseInt(sc.nextLine());
		cont = new Contacto(nombre, apellidos, email, numero);

		return cont;
	}

	public static void addContacto(String FICH, Contacto cont) {
		File f = new File(FICH);
		try (MyOutputStream co = new MyOutputStream(f);) {
			co.writeObject(cont);
			System.out.println("Contacto agregado.");
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static Contacto buscarContacto(String FICH, Contacto cont) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICH))) {
			Contacto cont3;
			while (true) {
				cont3 = (Contacto) ois.readObject();
				if (cont3.equals(cont))
					return cont3;
			}
		} catch (EOFException ex) {
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}

		return null;
	}

	public static void modificarContacto(String FICH, Contacto cont, Scanner sc) {
		final String FICH_AUX = "auxiliar.obj";
		Contacto cont2;
		boolean hecho = false;

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICH));
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICH_AUX))) {

			try {
				while (true) {
					cont2 = (Contacto) ois.readObject();
					if (!cont2.equals(cont)) {
						oos.writeObject(cont2);
					} else {
						try {
							String email;
							int numero;
							System.out.println("E-mail (Pulsa enter si no lo quieres cambiar):");
							email = sc.nextLine();
							if (!email.equals(null)) {
								cont2.setEmail(email);
								hecho = true;
							}
							System.out.println("Telefono (Pulsa enter si no lo quieres cambiar):");
							numero = Integer.parseInt(sc.nextLine());
							cont2.setNumero(numero);
							hecho = true;
						} catch (NumberFormatException e) {}
						oos.writeObject(cont2);
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
					System.out.println("Contacto " + cont + " modificado");
				else
					System.out.println("Contacto no encontrado.");
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

	public static void eliminarContacto(String FICH, String SUP_FICH, Contacto cont) {
		Contacto cont2;
		boolean hecho = false;

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICH));
				BufferedWriter bw = new BufferedWriter(new FileWriter(SUP_FICH))) {

			try {
				while (true) {
					cont2 = (Contacto) ois.readObject();
					if (!cont2.equals(cont)) {
						bw.write(cont2.toString() + "\r\n");
						hecho = true;
					}
				}
			} catch (EOFException ex) {
			}

			File faux = new File(SUP_FICH);
			File f1 = new File(FICH);
			if (f1.delete()) {
				faux.renameTo(f1);
				if (hecho)
					System.out.println("Contacto " + cont + " borrado");
				else
					System.out.println("Contacto no encontrado.");
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

	public static void ordenarAgenda(String FICH) {
		TreeSet<Contacto> ts = new TreeSet<Contacto>();

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICH))) {
			Contacto cont;
			while (true) {
				cont = (Contacto) ois.readObject();
				ts.add(cont);
			}
		} catch (EOFException ex) {
			File f1 = new File(FICH);
			if (f1.delete()) {
				File f2 = new File(FICH);
				for (Contacto contacto : ts) {
					addContacto(FICH, contacto);
				}
				System.out.println("Agenda ordenada");
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

	public static void mostrarAgenda(String FICH) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICH))) {
			Contacto cont;
			while (true) {
				cont = (Contacto) ois.readObject();
				System.out.println(cont);
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

	public static void mostrarEliminados(String FICH) {
		String frase;
		try (BufferedReader br = new BufferedReader(new FileReader(SUP_FICH))) {
			while ((frase = br.readLine()) != null) {
				System.out.println(frase);
			}
		} catch (Exception e) {
			System.out.println("ERROR DE LECTURA");
		}

	}
}
