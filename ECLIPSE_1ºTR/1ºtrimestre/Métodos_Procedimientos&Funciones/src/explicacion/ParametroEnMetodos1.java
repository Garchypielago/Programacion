package Explicacion;

public class ParametroEnMetodos1 {
	static int miGlobal = 19;

	public static void main(String[] args) {

		modificarGlobal1(miGlobal);
		System.out.println("Valor de miGlobal tras modificarGlobal1 " + miGlobal);
		System.out.println();
		modificarGlobal2();
		System.out.println("Valor de miGlobal tras modificarGlobal2 " + miGlobal);
		System.out.println();

		int p = 9;
		//
		modificar1(p);
		System.out.println("Valor de p tras modificar1 " + p);
		System.out.println();

		p = modificar2(p);
		System.out.println("Valor de p tras modificar2 " + p);
		System.out.println();

		int[] array = { 9, 4 };

		//
		modificarA1(array);
		System.out.println("Valor de array tras modificarA1 " + array);
		escribirArray(array);
		System.out.println();
		System.out.println();
	}

	public static void modificarGlobal1(int v) {
		System.out.println("Valor de v dentro del metodo antes de mod " + v);
		v += 100;
		System.out.println("Valor de v dentro del metodo despues de mod " + v);
	}

	public static void modificarGlobal2() {
		System.out.println("Valor de miGlobal dentro del metodo antes de mod " + miGlobal);
		miGlobal += 100;
		System.out.println("Valor de miGlobal dentro del metodo despues de mod " + miGlobal);
	}

	/*
	 * Comprobacion de que una variable int que se modifica en un metodo no se
	 * modifica, sino que solo se modifica su copia
	 */
	public static void modificar1(int v) {
		System.out.println("Valor de v dentro del metodo antes " + v);
		v += 100;
		System.out.println("Valor de v dentro del metodo despues " + v);
	}

	public static int modificar2(int v) {
		System.out.println("Valor de v dentro del metodo antes " + v);
		v += 100;
		System.out.println("Valor de v dentro del metodo despues " + v);
		return v;
	}

	public static void modificarA1(int[] v) {
		System.out.println("Valor de v dentro del metodo antes " + v);
		for (int i = 0; i < v.length; i++)
			v[i] += 100;
		System.out.println("Valor de v dentro del metodo despues " + v);
	}

	static void escribirArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}