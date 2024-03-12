<<<<<<< HEAD
package excepciones;

import java.util.*;

import javax.swing.JOptionPane;

public class Prueba4 {

	public static void main(String[] args) {
		int a = 0, b = 0;

		boolean ex;

		// Con JOptionPanel
		do {

			try {			
				a = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero a: "));

				b = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero b: "));
				ex = false;
			} catch (NumberFormatException exc) {
				JOptionPane.showMessageDialog(null, "Error, lo introducido no es un numero: ");
				ex = true;
			}

		} while (ex);

		JOptionPane.showMessageDialog(null, "a " + a + " b " + b);
	}

}
=======
package excepciones;

import java.util.*;

import javax.swing.JOptionPane;

public class Prueba4 {

	public static void main(String[] args) {
		int a = 0, b = 0;

		boolean ex;

		// Con JOptionPanel
		do {

			try {			
				a = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero a: "));

				b = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero b: "));
				ex = false;
			} catch (NumberFormatException exc) {
				JOptionPane.showMessageDialog(null, "Error, lo introducido no es un numero: ");
				ex = true;
			}

		} while (ex);

		JOptionPane.showMessageDialog(null, "a " + a + " b " + b);
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
