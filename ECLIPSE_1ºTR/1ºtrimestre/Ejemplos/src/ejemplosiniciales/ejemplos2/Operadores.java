<<<<<<< HEAD
package ejemplos2;

public class Operadores {
	public static void main(String[] args) {
		int calculo, num1, num2;

		// ********* Probamos operadores logicos: *********
		System.out.println("Esto devuelve un booleano:");
		System.out.println("4 > 3 " + (4 > 3)); // Muestra true
		System.out.println("7 <= 2 " + (7 <= 2)); // 7 <= 2 resulta false.
		System.out.println("5 + 2 == 4 + 3 " + (5 + 2 == 4 + 3)); // 5 + 2 == 4 + 3 resulta true.
		System.out.println("4 * 3 != 12 " + (4 * 3 != 12)); // 4 * 3 != 12 resulta false

		System.out.println("4 > 3 && 5 <= 5 " + (4 > 3 && 5 <= 5));
		// 4 > 3 && 5 <= 5 resulta true, porque las dos expresiones son true.
		System.out.println("4 > 3 && 5 != 5 " + (4 > 3 && 5 != 5));
		// 4 > 3 && 5 <= 5 resulta false, porque al menos una expresion es false.
		System.out.println("4 > 3 || 5 != 5 " + (4 > 3 || 5 != 5));
		// 4 > 3 || 5 != 5 resulta true, porque al menos una expresion es true.
		System.out.println("4 > 3 && !(5 != 5) " + (4 > 3 && !(5 != 5)));
		// 4 > 3 && !(5 != 5) resulta true, porque las dos expresiones son true.

		// ********* Probamos operadores matematicos: *********
		calculo = 5;
		calculo += 6; // Incrementa en 6 el valor de la variable
		System.out.println(calculo); // Muestra 11

		calculo *= 2; // Duplica el valor de calculo
		System.out.println(calculo); // Muestra 22

		num1 = 3;
		num2 = 7;
		num1++; // Suma 1 a num1
		System.out.println(num1); // Muestra 4

		num2--; // resta 1 a num2
		System.out.println(num2); // Muestra 6

		int x = 5, y = 5, z;
		z = x++; /*
					 * z vale 5, x vale 6 porque primero se asigna el valor de x a z despues se
					 * incrementa x
					 */
		System.out.println("Valor de z: " + z);
		
		z = ++y; /*
					 * z vale 6, y vale 6 porque primero incrementa la variable y, despues se asigna
					 * el valor a z
					 */
		System.out.println("Valor de z: " + z);
	}
}
=======
package ejemplos2;

public class Operadores {
	public static void main(String[] args) {
		int calculo, num1, num2;

		// ********* Probamos operadores logicos: *********
		System.out.println("Esto devuelve un booleano:");
		System.out.println("4 > 3 " + (4 > 3)); // Muestra true
		System.out.println("7 <= 2 " + (7 <= 2)); // 7 <= 2 resulta false.
		System.out.println("5 + 2 == 4 + 3 " + (5 + 2 == 4 + 3)); // 5 + 2 == 4 + 3 resulta true.
		System.out.println("4 * 3 != 12 " + (4 * 3 != 12)); // 4 * 3 != 12 resulta false

		System.out.println("4 > 3 && 5 <= 5 " + (4 > 3 && 5 <= 5));
		// 4 > 3 && 5 <= 5 resulta true, porque las dos expresiones son true.
		System.out.println("4 > 3 && 5 != 5 " + (4 > 3 && 5 != 5));
		// 4 > 3 && 5 <= 5 resulta false, porque al menos una expresion es false.
		System.out.println("4 > 3 || 5 != 5 " + (4 > 3 || 5 != 5));
		// 4 > 3 || 5 != 5 resulta true, porque al menos una expresion es true.
		System.out.println("4 > 3 && !(5 != 5) " + (4 > 3 && !(5 != 5)));
		// 4 > 3 && !(5 != 5) resulta true, porque las dos expresiones son true.

		// ********* Probamos operadores matematicos: *********
		calculo = 5;
		calculo += 6; // Incrementa en 6 el valor de la variable
		System.out.println(calculo); // Muestra 11

		calculo *= 2; // Duplica el valor de calculo
		System.out.println(calculo); // Muestra 22

		num1 = 3;
		num2 = 7;
		num1++; // Suma 1 a num1
		System.out.println(num1); // Muestra 4

		num2--; // resta 1 a num2
		System.out.println(num2); // Muestra 6

		int x = 5, y = 5, z;
		z = x++; /*
					 * z vale 5, x vale 6 porque primero se asigna el valor de x a z despues se
					 * incrementa x
					 */
		System.out.println("Valor de z: " + z);
		
		z = ++y; /*
					 * z vale 6, y vale 6 porque primero incrementa la variable y, despues se asigna
					 * el valor a z
					 */
		System.out.println("Valor de z: " + z);
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
