<<<<<<< HEAD
package Explicacion;

public class PruebaTabla {
	public static void main(String[] args) {
		tabla(4);
		tabla(7);
	}

	public static void tabla(int n) {
		// ejemplo de llamada
		// de tipo void
		System.out.println("Tabla de multiplicar del numero " + n);
		for (int i = 0; i <= 10; i++)
			System.out.println(n + " x " + i + " = " + producto(n, i));
		return; // para cuando no devuelve ningun valor
	}

	public static int producto(int a, int b) {
		return a * b;
	}
}
=======
package Explicacion;

public class PruebaTabla {
	public static void main(String[] args) {
		tabla(4);
		tabla(7);
	}

	public static void tabla(int n) {
		// ejemplo de llamada
		// de tipo void
		System.out.println("Tabla de multiplicar del numero " + n);
		for (int i = 0; i <= 10; i++)
			System.out.println(n + " x " + i + " = " + producto(n, i));
		return; // para cuando no devuelve ningun valor
	}

	public static int producto(int a, int b) {
		return a * b;
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
