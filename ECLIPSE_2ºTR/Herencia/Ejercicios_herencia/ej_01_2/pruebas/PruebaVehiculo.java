<<<<<<< HEAD
package pruebas;

import java.util.*;

import excepciones_ej01_2.*;
import hijos_vehiculo.*;
import vehiculos.Vehiculos;

public class PruebaVehiculo {

	public static final int MAX_OPC = 8;

	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		System.out.println();
		System.out.println(
				"----------------------------------------------------------------------------------------------------");
		System.out.println("\t1. Añadir coche");
		System.out.println("\t2. Añadir camion");
		System.out.println("\t3. Añadir un remolque (de peso en kg el que indique el usuario) a todos los camiones");
		System.out.println("\t4. Muestre la información de todos los vehículos por pantalla.");
		System.out.println("\t5. Borre todos los camiones que tengan un remolque de más de 1000 kg");
		System.out.println("\t6. Añadir un remolque (de peso en kg el que indique el usuario) a un camión concreto");
		System.out.println(
				"\t7. - Acelerar un vehiculo (de matrícula la que indique el usuario y los km que indique el usuario)");
		System.out.println("\t8. Salir.");
		System.out.println(
				"----------------------------------------------------------------------------------------------------");
		do {
			System.out.print("\n\tElija opcion:");
			opcion_menu = Integer.parseInt(sc.nextLine());
		} while (opcion_menu < 1 || opcion_menu > tope_op);
		System.out.println(
				"----------------------------------------------------------------------------------------------------");

		return opcion_menu;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;

		Vehiculos vs = new Vehiculos();

		Scanner sc = new Scanner(System.in);

		while (opcion != MAX_OPC) {
			opcion = menu(MAX_OPC, sc);
			switch (opcion) {
			case 1:
				añadirCoche(vs);
				break;
			case 2:
				añadirCamion(vs);
				break;
			case 3:
				añadirRemolques(vs);
				break;
			case 4:
				vs.mostrarVehiculos();
				break;
			case 5:
				vs.borrarPesados();
				break;
			case 6:
				añadirRemolque(vs);
				break;
			case 7:
				acelerar(vs);
				break;
			case 8:
				System.out.println("Fin del programa");
				break;
			}
		}
		sc.close();
	}

	public static void añadirCoche(Vehiculos vs) {
		boolean repetir = true;
		String mat;
		int npuertas;
		Scanner sc = new Scanner(System.in);

		while (repetir) {
			try {
				System.out.println("Escriba la matricula del coche");
				mat = sc.nextLine();
				System.out.println("Escriba las puertas del coche");
				npuertas = Integer.parseInt(sc.nextLine());

				vs.agregarVehiculo(new Coche(mat, npuertas));
				repetir = false;

			} catch (MatriculaRepetida mr) {
				System.out.println(mr.getMessage());
			} catch (Exception e) {
				System.out.println("Error vuleva a escribirlo");
			}
		}
	}

	public static void añadirCamion(Vehiculos vs) {
		boolean repetir = true;
		String mat;
		int npuertas;
		Scanner sc = new Scanner(System.in);

		while (repetir) {
			try {
				System.out.println("Escriba la matricula del camion");
				mat = sc.nextLine();

				vs.agregarVehiculo(new Camion(mat));
				repetir = false;

			} catch (MatriculaRepetida mr) {
				System.out.println(mr.getMessage());
			} catch (Exception e) {
				System.out.println("Error vuleva a escribirlo");
			}
		}
	}

	public static void añadirRemolques(Vehiculos vs) {
		int peso;
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba el peso del remolque");
		peso = Integer.parseInt(sc.nextLine());

		vs.ponerRemolqueTodos(peso);
	}

	public static void añadirRemolque(Vehiculos vs) {
		String mat;
		int peso;
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba el peso del remolque");
		peso = Integer.parseInt(sc.nextLine());

		System.out.println("Escriba la matricula del camion");
		mat = sc.nextLine();

		vs.ponRemolque(peso, mat);
	}

	public static void acelerar(Vehiculos vs) {
		String mat;
		int vel;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Escriba la matricula del vehiculo");
			mat = sc.nextLine();

			System.out.println("Escriba la velocidad de aceleracion");
			vel = Integer.parseInt(sc.nextLine());

			vs.acelerarVehiculo(mat, vel);

		} catch (DemasiadoRapidoExcepcion dre) {
			System.out.println(dre.getMessage());
		} catch (Exception e) {
			System.out.println("Error vuleva a escribirlo");
		}

	}
}
=======
package pruebas;

import java.util.*;

import excepciones_ej01_2.*;
import hijos_vehiculo.*;
import vehiculos.Vehiculos;

public class PruebaVehiculo {

	public static final int MAX_OPC = 8;

	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		System.out.println();
		System.out.println(
				"----------------------------------------------------------------------------------------------------");
		System.out.println("\t1. Añadir coche");
		System.out.println("\t2. Añadir camion");
		System.out.println("\t3. Añadir un remolque (de peso en kg el que indique el usuario) a todos los camiones");
		System.out.println("\t4. Muestre la información de todos los vehículos por pantalla.");
		System.out.println("\t5. Borre todos los camiones que tengan un remolque de más de 1000 kg");
		System.out.println("\t6. Añadir un remolque (de peso en kg el que indique el usuario) a un camión concreto");
		System.out.println(
				"\t7. - Acelerar un vehiculo (de matrícula la que indique el usuario y los km que indique el usuario)");
		System.out.println("\t8. Salir.");
		System.out.println(
				"----------------------------------------------------------------------------------------------------");
		do {
			System.out.print("\n\tElija opcion:");
			opcion_menu = Integer.parseInt(sc.nextLine());
		} while (opcion_menu < 1 || opcion_menu > tope_op);
		System.out.println(
				"----------------------------------------------------------------------------------------------------");

		return opcion_menu;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;

		Vehiculos vs = new Vehiculos();

		Scanner sc = new Scanner(System.in);

		while (opcion != MAX_OPC) {
			opcion = menu(MAX_OPC, sc);
			switch (opcion) {
			case 1:
				añadirCoche(vs);
				break;
			case 2:
				añadirCamion(vs);
				break;
			case 3:
				añadirRemolques(vs);
				break;
			case 4:
				vs.mostrarVehiculos();
				break;
			case 5:
				vs.borrarPesados();
				break;
			case 6:
				añadirRemolque(vs);
				break;
			case 7:
				acelerar(vs);
				break;
			case 8:
				System.out.println("Fin del programa");
				break;
			}
		}
		sc.close();
	}

	public static void añadirCoche(Vehiculos vs) {
		boolean repetir = true;
		String mat;
		int npuertas;
		Scanner sc = new Scanner(System.in);

		while (repetir) {
			try {
				System.out.println("Escriba la matricula del coche");
				mat = sc.nextLine();
				System.out.println("Escriba las puertas del coche");
				npuertas = Integer.parseInt(sc.nextLine());

				vs.agregarVehiculo(new Coche(mat, npuertas));
				repetir = false;

			} catch (MatriculaRepetida mr) {
				System.out.println(mr.getMessage());
			} catch (Exception e) {
				System.out.println("Error vuleva a escribirlo");
			}
		}
	}

	public static void añadirCamion(Vehiculos vs) {
		boolean repetir = true;
		String mat;
		int npuertas;
		Scanner sc = new Scanner(System.in);

		while (repetir) {
			try {
				System.out.println("Escriba la matricula del camion");
				mat = sc.nextLine();

				vs.agregarVehiculo(new Camion(mat));
				repetir = false;

			} catch (MatriculaRepetida mr) {
				System.out.println(mr.getMessage());
			} catch (Exception e) {
				System.out.println("Error vuleva a escribirlo");
			}
		}
	}

	public static void añadirRemolques(Vehiculos vs) {
		int peso;
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba el peso del remolque");
		peso = Integer.parseInt(sc.nextLine());

		vs.ponerRemolqueTodos(peso);
	}

	public static void añadirRemolque(Vehiculos vs) {
		String mat;
		int peso;
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba el peso del remolque");
		peso = Integer.parseInt(sc.nextLine());

		System.out.println("Escriba la matricula del camion");
		mat = sc.nextLine();

		vs.ponRemolque(peso, mat);
	}

	public static void acelerar(Vehiculos vs) {
		String mat;
		int vel;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Escriba la matricula del vehiculo");
			mat = sc.nextLine();

			System.out.println("Escriba la velocidad de aceleracion");
			vel = Integer.parseInt(sc.nextLine());

			vs.acelerarVehiculo(mat, vel);

		} catch (DemasiadoRapidoExcepcion dre) {
			System.out.println(dre.getMessage());
		} catch (Exception e) {
			System.out.println("Error vuleva a escribirlo");
		}

	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
