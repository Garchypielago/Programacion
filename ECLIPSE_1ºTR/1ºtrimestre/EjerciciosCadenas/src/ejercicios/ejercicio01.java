<<<<<<< HEAD
package ejercicios;

import javax.swing.JOptionPane;

public class ejercicio01 {

	public static void main(String[] args) {
		String texto, mayor = "";
		Character letra = 'a';
		int vocal1 = 0, vocal2 = 0;

		for (int i = 1; i <= 5; i++) {
			texto = JOptionPane.showInputDialog("Escribe tu " + i + " palabra");

			for (int j = 0; j < texto.length(); j++) {
				letra = texto.toLowerCase().charAt(j);

				if (letra.equals('a') || letra.equals('á') || letra.equals('e') || letra.equals('é')
						|| letra.equals('i') || letra.equals('í') || letra.equals('o') || letra.equals('ó')
						|| letra.equals('u') || letra.equals('ú') || letra.equals('ü')) {

					vocal1++;
				}

			}

			if (vocal1 > vocal2) {
				mayor = texto;
				vocal2 = vocal1;
			}

			vocal1 = 0;

		}

		JOptionPane.showMessageDialog(null, "La palabra con mas vocales ha sido: " + mayor);

	}

}
=======
package ejercicios;

import javax.swing.JOptionPane;

public class ejercicio01 {

	public static void main(String[] args) {
		String texto, mayor = "";
		Character letra = 'a';
		int vocal1 = 0, vocal2 = 0;

		for (int i = 1; i <= 5; i++) {
			texto = JOptionPane.showInputDialog("Escribe tu " + i + " palabra");

			for (int j = 0; j < texto.length(); j++) {
				letra = texto.toLowerCase().charAt(j);

				if (letra.equals('a') || letra.equals('á') || letra.equals('e') || letra.equals('é')
						|| letra.equals('i') || letra.equals('í') || letra.equals('o') || letra.equals('ó')
						|| letra.equals('u') || letra.equals('ú') || letra.equals('ü')) {

					vocal1++;
				}

			}

			if (vocal1 > vocal2) {
				mayor = texto;
				vocal2 = vocal1;
			}

			vocal1 = 0;

		}

		JOptionPane.showMessageDialog(null, "La palabra con mas vocales ha sido: " + mayor);

	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
