<<<<<<< HEAD
package noEstatica;

public class FactorialAppNoEstatica {

	double factorial(int n) throws FactorialNegExc {
		int f = 1;

		if (n < 0)
			throw new FactorialNegExc("No se puede calcular el factorial de un numero negativo");

		for (int i = 1; i <= n; i++) {
			f *= i;
		}

		return f;
	}

	public static void main(String[] args) {

		double resultado = 0;

		FactorialAppNoEstatica f = new FactorialAppNoEstatica();

		try {
			resultado = f.factorial(-6);
		} catch (FactorialNegExc ex) {
			System.out.println("NumeroNegativoException " + ex.getMessage());
		} catch (Exception ex) {
			System.out.println (ex.getMessage());
		} finally {
			if (resultado != 0)
				System.out.println("El resultado es " + resultado);
		}

	}

}
=======
package noEstatica;

public class FactorialAppNoEstatica {

	double factorial(int n) throws FactorialNegExc {
		int f = 1;

		if (n < 0)
			throw new FactorialNegExc("No se puede calcular el factorial de un numero negativo");

		for (int i = 1; i <= n; i++) {
			f *= i;
		}

		return f;
	}

	public static void main(String[] args) {

		double resultado = 0;

		FactorialAppNoEstatica f = new FactorialAppNoEstatica();

		try {
			resultado = f.factorial(-6);
		} catch (FactorialNegExc ex) {
			System.out.println("NumeroNegativoException " + ex.getMessage());
		} catch (Exception ex) {
			System.out.println (ex.getMessage());
		} finally {
			if (resultado != 0)
				System.out.println("El resultado es " + resultado);
		}

	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
