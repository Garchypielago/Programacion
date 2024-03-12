<<<<<<< HEAD
package Basicos01;

import javax.swing.JOptionPane;

public class ejercicio09 {

	public static void main(String[] args) {
		String texto;
		int iva = 0;
		double importe, importes = 0, descuento = 0;
		do {

			texto = JOptionPane.showInputDialog("Escribe el importe:");
			importe = Double.parseDouble(texto);

			if (importe != 0) {
				texto = JOptionPane.showInputDialog("Escribe el porcentaje de iva (4%, 10% o 12%):");
				iva = Integer.parseInt(texto);

				if (iva == 4 || iva == 10 || iva == 12) {
					importes = importe + importes;

				} else {
					JOptionPane.showMessageDialog(null, "\nRepita importe e IVA, se introdujo un IVA no válido\n");
				}
			}

		} while (importe != 0);

//		if (importes >= 10000) {
//			descuento = importes - importes * 0.1;
//		} else if (importes >= 1000) {
//			descuento = importes - importes * 0.05;
//		} else {
//			descuento = importes - descuento;
//		}

		descuento = mdescuento(importes);

		JOptionPane.showMessageDialog(null,
				"Tu importe total es de " + importes + "€, y tu impote final es de " + descuento + "€.");

	}

	public static double mdescuento(double x) {
		double y = 0;

		if (x >= 10000) {
			y = x - x * 0.1;
		} else if (x >= 1000) {
			y = x - x * 0.05;
		} else {
			y = x - y;
		}

		return y;
	}

}
=======
package Basicos01;

import javax.swing.JOptionPane;

public class ejercicio09 {

	public static void main(String[] args) {
		String texto;
		int iva = 0;
		double importe, importes = 0, descuento = 0;
		do {

			texto = JOptionPane.showInputDialog("Escribe el importe:");
			importe = Double.parseDouble(texto);

			if (importe != 0) {
				texto = JOptionPane.showInputDialog("Escribe el porcentaje de iva (4%, 10% o 12%):");
				iva = Integer.parseInt(texto);

				if (iva == 4 || iva == 10 || iva == 12) {
					importes = importe + importes;

				} else {
					JOptionPane.showMessageDialog(null, "\nRepita importe e IVA, se introdujo un IVA no válido\n");
				}
			}

		} while (importe != 0);

//		if (importes >= 10000) {
//			descuento = importes - importes * 0.1;
//		} else if (importes >= 1000) {
//			descuento = importes - importes * 0.05;
//		} else {
//			descuento = importes - descuento;
//		}

		descuento = mdescuento(importes);

		JOptionPane.showMessageDialog(null,
				"Tu importe total es de " + importes + "€, y tu impote final es de " + descuento + "€.");

	}

	public static double mdescuento(double x) {
		double y = 0;

		if (x >= 10000) {
			y = x - x * 0.1;
		} else if (x >= 1000) {
			y = x - x * 0.05;
		} else {
			y = x - y;
		}

		return y;
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
