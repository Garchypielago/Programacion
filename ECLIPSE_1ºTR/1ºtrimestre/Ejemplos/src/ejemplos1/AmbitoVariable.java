<<<<<<< HEAD
package ejemplos1;

public class AmbitoVariable {
	static int variableGlobal;
	
	public static void main(String[] args) {
		byte variableDelMain = 10;
		/*
		 * Aqui se pueden usar variableGlobal y variableDelMain. 
		 * No se puede usar variableDeOtroMetodo
		 */
		System.out.println("***Dentro del metodo main***");
		System.out.println("variableGlobal " + variableGlobal);
		System.out.println("variableDelMain " + variableDelMain);
		
		otroMetodo();	//Se ejecuta el otroMetodo, aun que este mas abajo escrito
		
		System.out.println("Se acaba el programa ");
	}

	private static void otroMetodo() {
		short variableDelOtroMetodo = 130;
		/*
		 * Aqui se pueden usar variableGlobal y variableDeOtroMetodo. 
		 * No se puede usar VariableDelMain
		 */
		System.out.println("***Dentro del metodo otroMetodo***");
		
		System.out.println("variableGlobal " + variableGlobal);
		//System.out.println("variableDelMain " + variableDelMain);
		System.out.println("variableDeOtroMetodo " + variableDelOtroMetodo);
		
	}
}
=======
package ejemplos1;

public class AmbitoVariable {
	static int variableGlobal;
	
	public static void main(String[] args) {
		byte variableDelMain = 10;
		/*
		 * Aqui se pueden usar variableGlobal y variableDelMain. 
		 * No se puede usar variableDeOtroMetodo
		 */
		System.out.println("***Dentro del metodo main***");
		System.out.println("variableGlobal " + variableGlobal);
		System.out.println("variableDelMain " + variableDelMain);
		
		otroMetodo();	//Se ejecuta el otroMetodo, aun que este mas abajo escrito
		
		System.out.println("Se acaba el programa ");
	}

	private static void otroMetodo() {
		short variableDelOtroMetodo = 130;
		/*
		 * Aqui se pueden usar variableGlobal y variableDeOtroMetodo. 
		 * No se puede usar VariableDelMain
		 */
		System.out.println("***Dentro del metodo otroMetodo***");
		
		System.out.println("variableGlobal " + variableGlobal);
		//System.out.println("variableDelMain " + variableDelMain);
		System.out.println("variableDeOtroMetodo " + variableDelOtroMetodo);
		
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
