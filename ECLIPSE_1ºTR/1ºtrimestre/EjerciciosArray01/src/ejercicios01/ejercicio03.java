<<<<<<< HEAD
package ejercicios01;

public class ejercicio03 {

	public static void main(String[] args) {
		int n = 0, n1 = 1;

		int[] A = { 3, 1, 0, 8, 8 };

		System.out.println("original: \n" + A[0] + ", " + A[1] + ", " + A[2] + ", " + A[3] + ", " + A[4]);
		System.out.println("cuentaceros: " + cuentaCeros(A));
		System.out.println("sumapares: " + sumaPares(A));
		System.out.println("cuentarepetidos de 7: " + cuentaRepes(A, 8));
		sustituye(A, 3, 2);
		System.out.println("sustituye 3 por 2: \n" + A[0] + ", " + A[1] + ", " + A[2] + ", " + A[3] + ", " + A[4]);
		intercambiaValores(A, n, n1);
		System.out.println("intercambiavalores " + n + " y " + n1 + ": \n" + A[0] + ", " + A[1] + ", " + A[2] + ", "
				+ A[3] + ", " + A[4]);
		intercambiaPosicion(A, n, n1);
		System.out.println("intercambiaposicion " + n + " y " + n1 + ": \n" + A[0] + ", " + A[1] + ", " + A[2] + ", "
				+ A[3] + ", " + A[4]);
		invierte(A);
		System.out.println("invierte: \n" + A[0] + ", " + A[1] + ", " + A[2] + ", " + A[3] + ", " + A[4]);
		invierte2(A);
		System.out.println("invierte2: \n" + A[0] + ", " + A[1] + ", " + A[2] + ", " + A[3] + ", " + A[4]);
		rotaDerecha(A);
		System.out.println("rotaderecha: \n" + A[0] + ", " + A[1] + ", " + A[2] + ", " + A[3] + ", " + A[4]);
		rotaIzquierda(A);
		System.out.println("rotaizquierda: \n" + A[0] + ", " + A[1] + ", " + A[2] + ", " + A[3] + ", " + A[4]);

		int[] a1 = { 3, 0, 1, 7, 9 };
		int[] a2 = { 3, 0, 1, 7, 9 };
		System.out.println("a1 = { 3, 0, 1, 7, 9 } y a2 = { 3, 0, 1, 7, 9 }" + iguales(a1, a2));
		
		int[] a3 = { 3, 0, 1, 7 };
		int[] a4 = { 3, 0, 1, 7, 9 };
		System.out.println("a3 = { 3, 0, 1, 7 } y a4 = { 3, 0, 1, 7, 9 }" + iguales(a3, a4));
		
		int[] a5 = { 3, 0, 1, 7 };
		int[] a6 = { 3, 0, 1, 3 };
		System.out.println("a5 = { 3, 0, 1, 7 } y a6 = { 3, 0, 1, 3 }" + iguales(a5, a6));
	}

	public static int cuentaCeros(int arr[]) {
		int x = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				x++;
			}
		}
		return x;
	}

	public static int sumaPares(int arr[]) {
		int x = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				x = x + arr[i];
			}
		}
		return x;
	}

	public static int cuentaRepes(int arr[], int x) {
		int y = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				y++;
			}

		}
		return y;
	}

	public static void sustituye(int arr[], int x, int y) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				arr[i] = y;
			}
		}
	}

	public static void intercambiaValores(int arr[], int x, int y) {
		boolean xexiste = false, yexiste = false;

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == x) {
				xexiste = true;
			}
			if (arr[j] == y) {
				yexiste = true;
			}
		}
		if (xexiste == true && yexiste == true) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == x) {
					arr[i] = y;
				} else if (arr[i] == y) {
					arr[i] = x;
				}
			}
		}
	}

	public static void intercambiaPosicion(int arr[], int x, int y) {
		int z;
		z = arr[x];
		arr[x] = arr[y];
		arr[y] = z;
	}

	public static void invierte(int arr[]) {

		for (int i = 0; i < arr.length / 2; i++) {
			int z = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = z;
		}
	}

	public static void invierte2(int arr[]) {
		int B[] = new int[arr.length];

		for (int i = 0; i < arr.length / 2; i++) {
			B[i] = arr[arr.length - 1 - i];
			B[B.length - 1 - i] = arr[i];
			arr[i] = B[i];
			arr[arr.length - i - 1] = B[B.length - 1 - i];
		}
	}

	public static void rotaDerecha(int arr[]) {
		int z = arr[arr.length - 1];

		for (int i = arr.length - 1; i < arr.length && i > 0; i--) {
				arr[i] = arr[i - 1];
		}
		arr[0] = z;
	}

	public static void rotaIzquierda(int arr[]) {
		int z = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i+1];
		}
		arr[arr.length-1] = z;
	}

	public static boolean iguales(int a1[], int a2[]) {

		if (a1.length == a2.length) {
			int i = 0;
			for (; i < a1.length && a1[i] == a2[i]; i++) {
			}
			if (i == a1.length) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

}
=======
package ejercicios01;

public class ejercicio03 {

	public static void main(String[] args) {
		int n = 0, n1 = 1;

		int[] A = { 3, 1, 0, 8, 8 };

		System.out.println("original: \n" + A[0] + ", " + A[1] + ", " + A[2] + ", " + A[3] + ", " + A[4]);
		System.out.println("cuentaceros: " + cuentaCeros(A));
		System.out.println("sumapares: " + sumaPares(A));
		System.out.println("cuentarepetidos de 7: " + cuentaRepes(A, 8));
		sustituye(A, 3, 2);
		System.out.println("sustituye 3 por 2: \n" + A[0] + ", " + A[1] + ", " + A[2] + ", " + A[3] + ", " + A[4]);
		intercambiaValores(A, n, n1);
		System.out.println("intercambiavalores " + n + " y " + n1 + ": \n" + A[0] + ", " + A[1] + ", " + A[2] + ", "
				+ A[3] + ", " + A[4]);
		intercambiaPosicion(A, n, n1);
		System.out.println("intercambiaposicion " + n + " y " + n1 + ": \n" + A[0] + ", " + A[1] + ", " + A[2] + ", "
				+ A[3] + ", " + A[4]);
		invierte(A);
		System.out.println("invierte: \n" + A[0] + ", " + A[1] + ", " + A[2] + ", " + A[3] + ", " + A[4]);
		invierte2(A);
		System.out.println("invierte2: \n" + A[0] + ", " + A[1] + ", " + A[2] + ", " + A[3] + ", " + A[4]);
		rotaDerecha(A);
		System.out.println("rotaderecha: \n" + A[0] + ", " + A[1] + ", " + A[2] + ", " + A[3] + ", " + A[4]);
		rotaIzquierda(A);
		System.out.println("rotaizquierda: \n" + A[0] + ", " + A[1] + ", " + A[2] + ", " + A[3] + ", " + A[4]);

		int[] a1 = { 3, 0, 1, 7, 9 };
		int[] a2 = { 3, 0, 1, 7, 9 };
		System.out.println("a1 = { 3, 0, 1, 7, 9 } y a2 = { 3, 0, 1, 7, 9 }" + iguales(a1, a2));
		
		int[] a3 = { 3, 0, 1, 7 };
		int[] a4 = { 3, 0, 1, 7, 9 };
		System.out.println("a3 = { 3, 0, 1, 7 } y a4 = { 3, 0, 1, 7, 9 }" + iguales(a3, a4));
		
		int[] a5 = { 3, 0, 1, 7 };
		int[] a6 = { 3, 0, 1, 3 };
		System.out.println("a5 = { 3, 0, 1, 7 } y a6 = { 3, 0, 1, 3 }" + iguales(a5, a6));
	}

	public static int cuentaCeros(int arr[]) {
		int x = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				x++;
			}
		}
		return x;
	}

	public static int sumaPares(int arr[]) {
		int x = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				x = x + arr[i];
			}
		}
		return x;
	}

	public static int cuentaRepes(int arr[], int x) {
		int y = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				y++;
			}

		}
		return y;
	}

	public static void sustituye(int arr[], int x, int y) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				arr[i] = y;
			}
		}
	}

	public static void intercambiaValores(int arr[], int x, int y) {
		boolean xexiste = false, yexiste = false;

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == x) {
				xexiste = true;
			}
			if (arr[j] == y) {
				yexiste = true;
			}
		}
		if (xexiste == true && yexiste == true) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == x) {
					arr[i] = y;
				} else if (arr[i] == y) {
					arr[i] = x;
				}
			}
		}
	}

	public static void intercambiaPosicion(int arr[], int x, int y) {
		int z;
		z = arr[x];
		arr[x] = arr[y];
		arr[y] = z;
	}

	public static void invierte(int arr[]) {

		for (int i = 0; i < arr.length / 2; i++) {
			int z = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = z;
		}
	}

	public static void invierte2(int arr[]) {
		int B[] = new int[arr.length];

		for (int i = 0; i < arr.length / 2; i++) {
			B[i] = arr[arr.length - 1 - i];
			B[B.length - 1 - i] = arr[i];
			arr[i] = B[i];
			arr[arr.length - i - 1] = B[B.length - 1 - i];
		}
	}

	public static void rotaDerecha(int arr[]) {
		int z = arr[arr.length - 1];

		for (int i = arr.length - 1; i < arr.length && i > 0; i--) {
				arr[i] = arr[i - 1];
		}
		arr[0] = z;
	}

	public static void rotaIzquierda(int arr[]) {
		int z = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i+1];
		}
		arr[arr.length-1] = z;
	}

	public static boolean iguales(int a1[], int a2[]) {

		if (a1.length == a2.length) {
			int i = 0;
			for (; i < a1.length && a1[i] == a2[i]; i++) {
			}
			if (i == a1.length) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
