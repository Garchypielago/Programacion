<<<<<<< HEAD
package EjerciciosClases03;

import javax.swing.*;

public class Promedio {
	private int contador;
	private int[] promedio;

	public Promedio(int tam) {
		super();
		promedio = new int[tam];
	}

	public Promedio(int tam, int[] promedio) {
		super();
		if (tam >= promedio.length) {
			this.promedio = new int[tam];
			for (int i = 0; i < promedio.length; i++) {
				this.promedio[i] = promedio[i];
			}
			contador = promedio.length;
		} else {
			System.out.println("Error, debes introducir un tamaño mayor al array");
		}
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public int[] getPromedio() {
		return promedio;
	}

	public void setPromedio(int[] promedio) {
		this.promedio = promedio;
	}

	public boolean agregarNumero(int num) {
		if (contador < promedio.length) {
			promedio[contador++] = num;
			return true;
		} else {
			return false;
		}
	}

	public double obtenerPromedio() {
		double promedio = 0;
		int suma = 0;

		for (int i = 0; i < contador; i++) {
			suma += this.promedio[i];
			promedio = (double) suma / (double) (contador);
		}

		return promedio;
	}

	public String verDatos() {
		String texto = "";
		for (int i = 0; i < contador; i++) {
			if (i < contador - 1) {
				texto += promedio[i] + ", ";
			} else {
				texto += promedio[i] + ".";
			}
		}

		return texto;
	}

	// MetodoMain

	public static void main(String[] args) {

		Promedio media = new Promedio(4);
		System.out.println(media.obtenerPromedio());

		media.agregarNumero(1);
		media.agregarNumero(2);
		media.agregarNumero(3);
		media.agregarNumero(4);
		System.out.println(media.obtenerPromedio());

		int[] media1 = { 2, 2 };
		Promedio media2 = new Promedio(4, media1);
		System.out.println(media2.obtenerPromedio());
		media2.agregarNumero(4);

		int[] media3 = { 2, 2, 0, 0 };
		Promedio media4 = new Promedio(4, media3);
		System.out.println(media4.obtenerPromedio());
		media4.agregarNumero(4);
		
		System.out.println(media4.verDatos());

		menuPromedio(media2);

	}

	// MetodoMenu
	public static void menuPromedio(Promedio Promedio) {
		int opcion, num;
		String input;

		do {
			input = JOptionPane
					.showInputDialog("Elige la opcion: \n\n1)Agregar numero \n2)Obtener promedio hasta el momento "
							+ "\n3)Ver los datos introducidos \n4)Salir");
			opcion = Integer.parseInt(input);

			switch (opcion) {
			case 1:
				input = JOptionPane.showInputDialog("Que numero quieres agregar");
				num = Integer.parseInt(input);
				Promedio.agregarNumero(num);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, Promedio.obtenerPromedio());
				break;
			case 3:
				JOptionPane.showMessageDialog(null, Promedio.verDatos());
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Fin del programa");
				break;
			default:
				JOptionPane.showMessageDialog(null, "No es una opcion valida");
				break;
			}
		} while (opcion != 4);
	}

}
=======
package EjerciciosClases03;

import javax.swing.*;

public class Promedio {
	private int contador;
	private int[] promedio;

	public Promedio(int tam) {
		super();
		promedio = new int[tam];
	}

	public Promedio(int tam, int[] promedio) {
		super();
		if (tam >= promedio.length) {
			this.promedio = new int[tam];
			for (int i = 0; i < promedio.length; i++) {
				this.promedio[i] = promedio[i];
			}
			contador = promedio.length;
		} else {
			System.out.println("Error, debes introducir un tamaño mayor al array");
		}
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public int[] getPromedio() {
		return promedio;
	}

	public void setPromedio(int[] promedio) {
		this.promedio = promedio;
	}

	public boolean agregarNumero(int num) {
		if (contador < promedio.length) {
			promedio[contador++] = num;
			return true;
		} else {
			return false;
		}
	}

	public double obtenerPromedio() {
		double promedio = 0;
		int suma = 0;

		for (int i = 0; i < contador; i++) {
			suma += this.promedio[i];
			promedio = (double) suma / (double) (contador);
		}

		return promedio;
	}

	public String verDatos() {
		String texto = "";
		for (int i = 0; i < contador; i++) {
			if (i < contador - 1) {
				texto += promedio[i] + ", ";
			} else {
				texto += promedio[i] + ".";
			}
		}

		return texto;
	}

	// MetodoMain

	public static void main(String[] args) {

		Promedio media = new Promedio(4);
		System.out.println(media.obtenerPromedio());

		media.agregarNumero(1);
		media.agregarNumero(2);
		media.agregarNumero(3);
		media.agregarNumero(4);
		System.out.println(media.obtenerPromedio());

		int[] media1 = { 2, 2 };
		Promedio media2 = new Promedio(4, media1);
		System.out.println(media2.obtenerPromedio());
		media2.agregarNumero(4);

		int[] media3 = { 2, 2, 0, 0 };
		Promedio media4 = new Promedio(4, media3);
		System.out.println(media4.obtenerPromedio());
		media4.agregarNumero(4);
		
		System.out.println(media4.verDatos());

		menuPromedio(media2);

	}

	// MetodoMenu
	public static void menuPromedio(Promedio Promedio) {
		int opcion, num;
		String input;

		do {
			input = JOptionPane
					.showInputDialog("Elige la opcion: \n\n1)Agregar numero \n2)Obtener promedio hasta el momento "
							+ "\n3)Ver los datos introducidos \n4)Salir");
			opcion = Integer.parseInt(input);

			switch (opcion) {
			case 1:
				input = JOptionPane.showInputDialog("Que numero quieres agregar");
				num = Integer.parseInt(input);
				Promedio.agregarNumero(num);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, Promedio.obtenerPromedio());
				break;
			case 3:
				JOptionPane.showMessageDialog(null, Promedio.verDatos());
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Fin del programa");
				break;
			default:
				JOptionPane.showMessageDialog(null, "No es una opcion valida");
				break;
			}
		} while (opcion != 4);
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
