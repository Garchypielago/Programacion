<<<<<<< HEAD
package EjerciciosClases03;

import javax.swing.*;

public class Empleado_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.1
		Empleado empleado1 = new Empleado();
		empleado1 = leerEmpleado();

		Empleado empleado2 = new Empleado();
		empleado2 = leerEmpleado();

		Empleado empleado3 = new Empleado();
		empleado3 = leerEmpleado();

		System.out.println(empleado1);
		System.out.println(empleado2);
		System.out.println(empleado3);

		
		// 1.2
		String input;
		int num_empleados;

		do {
			input = JOptionPane.showInputDialog("De cuantos empleados quieres el array (hasta 100)");
			num_empleados = Integer.parseInt(input);
		} while (num_empleados > 100 || num_empleados <= 0);
		
		Empleado[] arrayEmpleados = new Empleado[num_empleados];
		
		arrayEmpleados=arrayEmpleados(num_empleados);
		
		for (Empleado e: arrayEmpleados) {
			JOptionPane.showMessageDialog(null, e);
		}
		

		// 1.3
		menuEmpleado(arrayEmpleados);
		menuEmpleado();

	}

	public static Empleado leerEmpleado() {
		String nombre, apellido, input;
		double salario;
		int edad;

		nombre = JOptionPane.showInputDialog("Nombre del empleado");
		apellido = JOptionPane.showInputDialog("Apellido del empleado");
		input = JOptionPane.showInputDialog("Edad del empleado");
		edad = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("Salario del empleado");
		salario = Double.parseDouble(input);

		Empleado newEmpleado = new Empleado(nombre, apellido, edad, salario);

		return newEmpleado;
	}

	public static Empleado[] arrayEmpleados(int num_empleados) {
		Empleado[] arrayEmpleados = new Empleado[num_empleados];

		for (int i = 0; i < arrayEmpleados.length; i++) {
			arrayEmpleados[i] = leerEmpleado();
		}
		return arrayEmpleados;
	}
	
	public static void subirSalarioEmpleados(Empleado[] arrayEmpleados) {
		String input;
		double aumento, antes=0, despues=0;
		input = JOptionPane.showInputDialog("¿Cuanto se les sube el salario?");
		aumento = Double.parseDouble(input);
		for (Empleado e : arrayEmpleados) {
			if (e != null)
				antes=e.getSalario()+antes;
				e.subirSalario(aumento);
				despues=despues+e.getSalario();
		}
		JOptionPane.showMessageDialog(null, "Salarios antes de la subida: " + antes
				+ "Salarios despues de la subida: " + despues);
	}

	public static void menuEmpleado(Empleado[] arrayEmpleados) {
		int opcion, contador = arrayEmpleados.length;
		String input;

		do {
			input = JOptionPane.showInputDialog("Elige la opcion: \n\n1)Nuevo empleado \n2)Mostrar empleados "
					+ "\n3)Aplicar plus a empleados \n4)Mostrar salario total \n5)Salir");
			opcion = Integer.parseInt(input);

			switch (opcion) {
			case 1:
				arrayEmpleados[contador] = leerEmpleado();
				contador++;
				break;
			case 2:
				for (Empleado e : arrayEmpleados) {
					if (e != null)
						JOptionPane.showMessageDialog(null, e);
				}
				break;
			case 3:
				double aumento;
				input = JOptionPane.showInputDialog("¿Cuanto se les sube el salario?");
				aumento = Double.parseDouble(input);
				for (Empleado e : arrayEmpleados) {
					if (e != null)
						e.subirSalario(aumento);
				}
				break;
			case 4:
				double suma = 0;
				for (Empleado e : arrayEmpleados) {
					if (e != null)
						suma = suma + e.getSalario();
				}
				JOptionPane.showMessageDialog(null, "La suma de los salarios es: " + suma + "€");
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Fin del programa");
				break;
			default:
				JOptionPane.showMessageDialog(null, "No es una opcion valida");
				break;
			}
		} while (opcion != 5);
	}
	
	public static void menuEmpleado() {
		int opcion, contador = 0;
		String input;
		
		Empleado[] arrayEmpleados = new Empleado[100];

		do {
			input = JOptionPane.showInputDialog("Elige la opcion: \n\n1)Nuevo empleado \n2)Mostrar empleados "
					+ "\n3)Aplicar plus a empleados \n4)Mostrar salario total \n5)Salir");
			opcion = Integer.parseInt(input);

			switch (opcion) {
			case 1:
				arrayEmpleados[contador] = leerEmpleado();
				contador++;
				break;
			case 2:
				for (Empleado e : arrayEmpleados) {
					if (e != null)
						JOptionPane.showMessageDialog(null, e);
				}
				break;
			case 3:
				double aumento;
				input = JOptionPane.showInputDialog("¿Cuanto se les sube el salario?");
				aumento = Double.parseDouble(input);
				for (Empleado e : arrayEmpleados) {
					if (e != null)
						e.subirSalario(aumento);
				}
				break;
			case 4:
				double suma = 0;
				for (Empleado e : arrayEmpleados) {
					if (e != null)
						suma = suma + e.getSalario();
				}
				JOptionPane.showMessageDialog(null, "La suma de los salarios es: " + suma + "€");
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Fin del programa");
				break;
			default:
				JOptionPane.showMessageDialog(null, "No es una opcion valida");
				break;
			}
		} while (opcion != 5);
	}

}
=======
package EjerciciosClases03;

import javax.swing.*;

public class Empleado_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.1
		Empleado empleado1 = new Empleado();
		empleado1 = leerEmpleado();

		Empleado empleado2 = new Empleado();
		empleado2 = leerEmpleado();

		Empleado empleado3 = new Empleado();
		empleado3 = leerEmpleado();

		System.out.println(empleado1);
		System.out.println(empleado2);
		System.out.println(empleado3);

		
		// 1.2
		String input;
		int num_empleados;

		do {
			input = JOptionPane.showInputDialog("De cuantos empleados quieres el array (hasta 100)");
			num_empleados = Integer.parseInt(input);
		} while (num_empleados > 100 || num_empleados <= 0);
		
		Empleado[] arrayEmpleados = new Empleado[num_empleados];
		
		arrayEmpleados=arrayEmpleados(num_empleados);
		
		for (Empleado e: arrayEmpleados) {
			JOptionPane.showMessageDialog(null, e);
		}
		

		// 1.3
		menuEmpleado(arrayEmpleados);
		menuEmpleado();

	}

	public static Empleado leerEmpleado() {
		String nombre, apellido, input;
		double salario;
		int edad;

		nombre = JOptionPane.showInputDialog("Nombre del empleado");
		apellido = JOptionPane.showInputDialog("Apellido del empleado");
		input = JOptionPane.showInputDialog("Edad del empleado");
		edad = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("Salario del empleado");
		salario = Double.parseDouble(input);

		Empleado newEmpleado = new Empleado(nombre, apellido, edad, salario);

		return newEmpleado;
	}

	public static Empleado[] arrayEmpleados(int num_empleados) {
		Empleado[] arrayEmpleados = new Empleado[num_empleados];

		for (int i = 0; i < arrayEmpleados.length; i++) {
			arrayEmpleados[i] = leerEmpleado();
		}
		return arrayEmpleados;
	}
	
	public static void subirSalarioEmpleados(Empleado[] arrayEmpleados) {
		String input;
		double aumento, antes=0, despues=0;
		input = JOptionPane.showInputDialog("¿Cuanto se les sube el salario?");
		aumento = Double.parseDouble(input);
		for (Empleado e : arrayEmpleados) {
			if (e != null)
				antes=e.getSalario()+antes;
				e.subirSalario(aumento);
				despues=despues+e.getSalario();
		}
		JOptionPane.showMessageDialog(null, "Salarios antes de la subida: " + antes
				+ "Salarios despues de la subida: " + despues);
	}

	public static void menuEmpleado(Empleado[] arrayEmpleados) {
		int opcion, contador = arrayEmpleados.length;
		String input;

		do {
			input = JOptionPane.showInputDialog("Elige la opcion: \n\n1)Nuevo empleado \n2)Mostrar empleados "
					+ "\n3)Aplicar plus a empleados \n4)Mostrar salario total \n5)Salir");
			opcion = Integer.parseInt(input);

			switch (opcion) {
			case 1:
				arrayEmpleados[contador] = leerEmpleado();
				contador++;
				break;
			case 2:
				for (Empleado e : arrayEmpleados) {
					if (e != null)
						JOptionPane.showMessageDialog(null, e);
				}
				break;
			case 3:
				double aumento;
				input = JOptionPane.showInputDialog("¿Cuanto se les sube el salario?");
				aumento = Double.parseDouble(input);
				for (Empleado e : arrayEmpleados) {
					if (e != null)
						e.subirSalario(aumento);
				}
				break;
			case 4:
				double suma = 0;
				for (Empleado e : arrayEmpleados) {
					if (e != null)
						suma = suma + e.getSalario();
				}
				JOptionPane.showMessageDialog(null, "La suma de los salarios es: " + suma + "€");
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Fin del programa");
				break;
			default:
				JOptionPane.showMessageDialog(null, "No es una opcion valida");
				break;
			}
		} while (opcion != 5);
	}
	
	public static void menuEmpleado() {
		int opcion, contador = 0;
		String input;
		
		Empleado[] arrayEmpleados = new Empleado[100];

		do {
			input = JOptionPane.showInputDialog("Elige la opcion: \n\n1)Nuevo empleado \n2)Mostrar empleados "
					+ "\n3)Aplicar plus a empleados \n4)Mostrar salario total \n5)Salir");
			opcion = Integer.parseInt(input);

			switch (opcion) {
			case 1:
				arrayEmpleados[contador] = leerEmpleado();
				contador++;
				break;
			case 2:
				for (Empleado e : arrayEmpleados) {
					if (e != null)
						JOptionPane.showMessageDialog(null, e);
				}
				break;
			case 3:
				double aumento;
				input = JOptionPane.showInputDialog("¿Cuanto se les sube el salario?");
				aumento = Double.parseDouble(input);
				for (Empleado e : arrayEmpleados) {
					if (e != null)
						e.subirSalario(aumento);
				}
				break;
			case 4:
				double suma = 0;
				for (Empleado e : arrayEmpleados) {
					if (e != null)
						suma = suma + e.getSalario();
				}
				JOptionPane.showMessageDialog(null, "La suma de los salarios es: " + suma + "€");
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Fin del programa");
				break;
			default:
				JOptionPane.showMessageDialog(null, "No es una opcion valida");
				break;
			}
		} while (opcion != 5);
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
