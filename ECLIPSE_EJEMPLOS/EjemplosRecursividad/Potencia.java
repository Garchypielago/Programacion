//Potencia
package recursividad;

public class Potencia {
	public static void main(String[] args) {
		int b = 9, e = 3;

		System.out.println("La potencia de " + b + " elevado a " + e + " es " + potencia(b, e));
	}

	static int potencia(int base, int exp) {
		if (exp == 0) {
			return 1;
		} else {
			return base * potencia(base, exp - 1); // llamada recursiva
		}
	}
}