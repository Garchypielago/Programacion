<<<<<<< HEAD
package ejemplos1;

public class AmbitoVariables {
	static int variableGlobal;

	public static void main(String[] args) {
		int variableDelMain = 10;
		/*
		 * Aqui se pueden usar variableGlobal y variableDelMain. No se puede usar
		 * variableDeOtroMetodo
		 */
		System.out.println("****Dentro del metodo  main****");
		System.out.println("variableGlobal " + variableGlobal);
		System.out.println("variableDelMain " + variableDelMain);
		otroMetodo();
	}

	static void otroMetodo() {
		int variableDeOtroMetodo = 90;
		/*
		 * Aqui se pueden usar variableGlobal y variableDeOtroMetodo. No se puede usar
		 * variableDelMain
		 */
		System.out.println("****Dentro del metodo  otroMetodo****");

		System.out.println("variableGlobal " + variableGlobal);
		//System.out.println("variableDelMain " + variableDelMain);
		System.out.println("variableDeOtroMetodo " + variableDeOtroMetodo);
	}
}
=======
package ejemplos1;

public class AmbitoVariables {
	static int variableGlobal;

	public static void main(String[] args) {
		int variableDelMain = 10;
		/*
		 * Aqui se pueden usar variableGlobal y variableDelMain. No se puede usar
		 * variableDeOtroMetodo
		 */
		System.out.println("****Dentro del metodo  main****");
		System.out.println("variableGlobal " + variableGlobal);
		System.out.println("variableDelMain " + variableDelMain);
		otroMetodo();
	}

	static void otroMetodo() {
		int variableDeOtroMetodo = 90;
		/*
		 * Aqui se pueden usar variableGlobal y variableDeOtroMetodo. No se puede usar
		 * variableDelMain
		 */
		System.out.println("****Dentro del metodo  otroMetodo****");

		System.out.println("variableGlobal " + variableGlobal);
		//System.out.println("variableDelMain " + variableDelMain);
		System.out.println("variableDeOtroMetodo " + variableDeOtroMetodo);
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
