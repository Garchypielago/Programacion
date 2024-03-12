<<<<<<< HEAD
package ejercicios01;

import javax.swing.JOptionPane;

public class ejercicio06 {

	public static void main(String[] args) {
		int n1, n2, media = 0, superior = 0, inferior = 0, igual = 0;
		String texto;

		do {
			texto = JOptionPane.showInputDialog("Escribe el número de personas");
			n1 = Integer.parseInt(texto);
		} while (n1 < 0);

		int[] A = new int[n1];
		for (int i = 0; i < A.length; i++) {
			do {
				texto = JOptionPane.showInputDialog("Escribe la " + (i + 1) + " altura (en cm):");
				n2 = Integer.parseInt(texto);
			} while (n2 <= 0);
			media = media + n2;
			A[i] = n2;
		}
		media = media / n1;

		for (int i = 0; i < A.length; i++) {
			if (A[i] > media) {
				superior++;
			} else if (A[i] < media) {
				inferior++;
			} else {
				igual++;
			}
		}

		String personas = (n1 == 1) ? "persona" : "personas"; // para que escriba en singular o plural

		System.out.println("La media es de " + media + "cm");
		System.out.println("Hay " + superior + personas + " por encima de la media");
		System.out.println("Hay " + inferior + personas + " por debajo de la media");
		System.out.println("Hay " + igual + personas + " con la altura media");

	}

}
=======
package ejercicios01;

import javax.swing.JOptionPane;

public class ejercicio06 {

	public static void main(String[] args) {
		int n1, n2, media = 0, superior = 0, inferior = 0, igual = 0;
		String texto;

		do {
			texto = JOptionPane.showInputDialog("Escribe el número de personas");
			n1 = Integer.parseInt(texto);
		} while (n1 < 0);

		int[] A = new int[n1];
		for (int i = 0; i < A.length; i++) {
			do {
				texto = JOptionPane.showInputDialog("Escribe la " + (i + 1) + " altura (en cm):");
				n2 = Integer.parseInt(texto);
			} while (n2 <= 0);
			media = media + n2;
			A[i] = n2;
		}
		media = media / n1;

		for (int i = 0; i < A.length; i++) {
			if (A[i] > media) {
				superior++;
			} else if (A[i] < media) {
				inferior++;
			} else {
				igual++;
			}
		}

		String personas = (n1 == 1) ? "persona" : "personas"; // para que escriba en singular o plural

		System.out.println("La media es de " + media + "cm");
		System.out.println("Hay " + superior + personas + " por encima de la media");
		System.out.println("Hay " + inferior + personas + " por debajo de la media");
		System.out.println("Hay " + igual + personas + " con la altura media");

	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
