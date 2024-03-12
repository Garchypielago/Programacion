package ejercicios02;

import javax.swing.JOptionPane;

public class ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto;
		int n, t;
		long DNI;

		// ej02
		System.out.println("----Ejercicio 2:----");
		do {
			texto = JOptionPane.showInputDialog("Que posición quieres del array entre 0 y 9");
			n = Integer.parseInt(texto);
		} while (n < 0 || n > 9);

		System.out.println(posicion(n));

		// ej03
		System.out.println("\n----Ejercicio 3:----");
		texto = JOptionPane.showInputDialog("De que tamaño quieres el array:");
		t = Integer.parseInt(texto);
		do {
			texto = JOptionPane
					.showInputDialog("De que ultimo digito quieres que saque los numeros del array, entre 0 y 9");
			n = Integer.parseInt(texto);
		} while (n < 0 || n > 9);

		int A[] = new int[t];
		for (int i = 0; i < t - 1; i++) {
			A[i] = (int) (Math.random() * 300) + 1;
		}
		System.out.println("--Matriz aleatoria--");
		for (int i = 0; i < A.length; i++) {
			if (i < A.length - 1) {
				System.out.print(A[i] + ", ");
			} else {
				System.out.println(A[i] + ".");
			}
		}
		System.out.println("\n--Matriz números sacados--");
		int[] resultado = digito(A, n);
		for (int i = 0; i < resultado.length; i++) {
			if (i < resultado.length - 1) {
				System.out.print(resultado[i] + ", ");
			} else {
				System.out.println(resultado[i] + ".");
			}
		}

		// ej04
		System.out.println("\n----Ejercicio 4:----");
		texto = JOptionPane.showInputDialog("Dime los números de tu DNI");
		DNI = Long.parseLong(texto);

		System.out.println("Tu DNI es: " + DNI + DNI(DNI));

		// ej05
		System.out.println("\n----Ejercicio 5:----");
		texto = JOptionPane.showInputDialog("Escribe tu numero para saber si es capicua o no");
		n = Integer.parseInt(texto);

		System.out.println(capicua(n));

		// ej06
		System.out.println("\n----Ejercicio 6:----");
		int C[] = new int[10];
		for (int i = 0; i < C.length; i++) {
			C[i] = (int) (Math.random() * 11);
		}

		System.out.println("--Matriz aleatoria--");
		for (int i = 0; i < C.length; i++) {
			if (i < C.length - 1) {
				System.out.print(C[i] + ", ");
			} else {
				System.out.println(C[i] + ".");
			}
		}

		int B[] = asteriscos(C);

		System.out.println("\n--Comprobacion de que cuenta bien--");
		for (int i = 0; i < B.length; i++) {
			if (i < B.length - 1) {
				System.out.print(B[i] + ", ");
			} else {
				System.out.println(B[i] + ".");
			}
		}

		System.out.println("\n--Histograma--");
		for (int i = 0; i < B.length; i++) {
			System.out.print(i + ")   ");
			for (int j = 0; j < B[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static int posicion(int n) {
		int A[] = new int[10];
		for (int i = 0; i < A.length; i++) {
			A[i] = (int) (Math.random() * 100) + 1;
		}

		int x = A[n];

		return x;
	}

	public static int[] digito(int A[], int n) {
		int h = 0, j = 0;
		for (int i = 0; i < A.length; i++) {
			int x = A[i] % 10;
			if (x == n) {
				h++;
			}
		}
		int B[] = new int[h];
		for (int i = 0; i < A.length && j < h; i++) {
			int x = A[i] % 10;
			if (x == n) {
				B[j] = A[i];
				j++;
			}
		}

		return B;
	}

	public static char DNI(long n) {
		int r = (int) (n % 23);

		char A[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
				'C', 'K', 'E' };

		return A[r];
	}

	public static boolean capicua(int n) {
		int j = 0;
		for (int x = n; x > 0; x = x / 10, j++)
			;
		int arr[] = new int[j];
		for (int i = 0; i < arr.length; i++, j--) {
			arr[i] = (int) (n / Math.pow(10, j - 1)) % 10;
		}
		boolean capicua = false;
		int B[] = new int[arr.length];
		for (int p = 0; p < arr.length; p++) {
			B[p] = arr[arr.length - 1 - p];
		}
		int t = 0;
		for (; t < arr.length && arr[t] == B[t]; t++)
			;
		if (t == arr.length) {
			capicua = true;
		}

		return capicua;
	}

	public static int[] asteriscos(int A[]) {
		int B[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j <= 10; j++) {
				if (A[i] == j) {
					B[j]++;
				}
			}
		}

		return B;
	}

}
