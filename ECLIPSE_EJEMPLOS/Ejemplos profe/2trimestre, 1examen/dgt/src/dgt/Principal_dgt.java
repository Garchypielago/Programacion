package dgt;

// Mas adelante haremos el ejercicio con clase que agrupe los conductores y con excepciones
// Poner una clase para que tengamos los conductores y sus metodos
import java.util.Scanner;

public class Principal_dgt {

	public static final int MAX_OP = 6;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuOp;
		System.out.println("Introduce la cantidad de conductores: ");
		int cantidadConductores = sc.nextInt();
		int posicion;

		Conductor[] arrayConductores = new Conductor[cantidadConductores];

		do {
			menuOp = menu(sc);

			switch (menuOp) {
			case 1:
				if (Conductor.getNumCond() < cantidadConductores) {
					arrayConductores[Conductor.getNumCond()] = crearConductor(sc);
					System.out.println();
				} else {
					System.out.println("No se pueden crear más conductores.\n");
				}
				break;
			case 2:
				if (Conductor.getNumCond() > 0) {
					System.out.println("¿A qué conductor pertenece la muestra? ");
					posicion = sc.nextInt();
					if (arrayConductores[posicion - 1] != null) {
						Muestra muestra = crearMuestra(sc);// no pido datos de muestra si no cabe

						if (arrayConductores[posicion - 1].ingresarMuestra(muestra) < 0)
							System.out.println("No se admiten más muestras para ese conductor");
					} else
						System.out.println("El conductor no existe.\n");
				} else
					System.out.println("No hay conductores dados de alta.");
				break;
			case 3:
				if (Conductor.getNumCond() > 0) {
					System.out.println("Indica de qué conductor quieres mostrar los datos: ");

					posicion = sc.nextInt();
					if (arrayConductores[posicion - 1] != null) {
						System.out.println(arrayConductores[posicion - 1]);
						System.out.println();
					} else
						System.out.println("El conductor no existe.\n");
				} else
					System.out.println("No hay conductores dados de alta.");
				break;
			case 4:
				if (Conductor.getNumCond() > 0) {
					// Hacer un metodo para mostrar los conductores
					if (Conductor.getNumCond() > 0) {
						for (int i = 0; i < Conductor.getNumCond(); i++) {
							System.out.println(i + " " +arrayConductores[i]);
							System.out.println();
						}
					} else
						System.out.println("No hay conductores dados de alta.");
					System.out.println("Indica de qué conductor quieres mostrar las muestras: ");
					posicion = sc.nextInt();
					if (arrayConductores[posicion - 1] != null) {
						System.out.println(arrayConductores[posicion - 1].escribirArrayMuestras());
						System.out.println();
					} else
						System.out.println("El conductor no existe.\n");
				} else
					System.out.println("No hay conductores dados de alta.");
				break;
			case 5:
				if (Conductor.getNumCond() > 0) {
					for (int i = 0; i < Conductor.getNumCond(); i++) {
						System.out.println(arrayConductores[i]);
						System.out.println();
					}
				} else
					System.out.println("No hay conductores dados de alta.");
				break;
			default:
				System.out.println("Fin del programa.");
				break;
			}

		} while (menuOp != MAX_OP);

		sc.close();
	}

	private static Conductor crearConductor(Scanner sc) {

		System.out.print("Introduce el nombre del conductor: ");
		String name = sc.nextLine();
		System.out.print("Introduce el dni: ");
		String dni = sc.nextLine();
		System.out.print("Indica el numero de muestras que se van a guardar para este conductor: ");
		int numMuestras = Integer.parseInt(sc.nextLine());

		return new Conductor(name, dni, numMuestras);
	}

	private static Muestra crearMuestra(Scanner sc) {
		Muestra muestra = new Muestra();
		

		System.out.println("Introduce los datos de la muestra");

		System.out.print("Fecha:");
		muestra.setFecha(sc.nextLine());

		System.out.print("Hora:");
		muestra.setHora(sc.nextLine());

		do {
			System.out.println("Codigo del puesto de control preventivo:");
			muestra.setCodigo(sc.nextLine());
		} while (muestra.getCodigo() == null);

		System.out.print("Matricula del vehiculo:");
		muestra.setMatricula(sc.nextLine());

		do {
			System.out.print("Tasa de alcohol:");
			muestra.setPorcentaje(Float.parseFloat(sc.nextLine()));
		} while (muestra.getPorcentaje() == -1);

		return muestra;
	}

	private static int menu(Scanner sc) {
		int menuOp;

		System.out.println("1. Introducir un nuevo conductor.");
		System.out.println("2. Introducir una muestra.");
		System.out.println("3. Mostrar los datos de un conductor.");
		System.out.println("4. Mostrar las muestras de un conductor.");
		System.out.println("5. Mostrar los datos de todos los conductores.");
		System.out.println("6. Salir.");

		do {
			System.out.println("Elige una opcion:");
			menuOp = Integer.parseInt(sc.nextLine());
			System.out.println();
		} while (menuOp < 1 || menuOp > MAX_OP);

		return menuOp;
	}

}
