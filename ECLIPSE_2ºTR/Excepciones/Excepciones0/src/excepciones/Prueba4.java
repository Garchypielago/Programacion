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
