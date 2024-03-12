<<<<<<< HEAD
package ejercicios;

import javax.swing.JOptionPane;

public class ejercicio06 {

	public static void main(String[] args) {
		String texto1, texto2;
		int i = 0;

		texto1 = JOptionPane.showInputDialog("Escribe la cadena en la que buscará: ");
		texto2 = JOptionPane.showInputDialog("Escribe la cadena que se buscará: ");

		int pos = texto1.indexOf(texto2);

		if (pos != -1) {
				texto1 = texto1.replaceAll(texto2, texto2.toUpperCase());
				pos = texto1.indexOf(texto2);
		}
				
		JOptionPane.showInternalMessageDialog(null, texto1);

	}

}
=======
package ejercicios;

import javax.swing.JOptionPane;

public class ejercicio06 {

	public static void main(String[] args) {
		String texto1, texto2;
		int i = 0;

		texto1 = JOptionPane.showInputDialog("Escribe la cadena en la que buscará: ");
		texto2 = JOptionPane.showInputDialog("Escribe la cadena que se buscará: ");

		int pos = texto1.indexOf(texto2);

		if (pos != -1) {
				texto1 = texto1.replaceAll(texto2, texto2.toUpperCase());
				pos = texto1.indexOf(texto2);
		}
				
		JOptionPane.showInternalMessageDialog(null, texto1);

	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
